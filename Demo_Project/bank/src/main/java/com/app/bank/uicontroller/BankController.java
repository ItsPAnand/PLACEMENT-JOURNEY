package com.app.bank.uicontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.app.bank.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.bank.service.RegisterService;
import com.app.bank.service.SavingsAccountService;
import com.app.bank.service.TransactionService;
import com.app.bank.service.DepositService;

@RestController
public class BankController {
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	TransactionService transactService;
	
	@Autowired
	SavingsAccountService savingsAccountService;
	
	@Autowired
	DepositService depositService;
	
//	@GetMapping("/")
//	private String data() {
//
//		return "<h1>Hello, guys</h1>";
//	}
	
	@PostMapping("/registerData")
	private String insertData(@RequestBody RegisterModel model) {
		Random random = new Random();
		model.setAccNum(Long.toString(random.nextLong(100000000000L, 9999999999999L)));
		model.setAccId(Long.toString(random.nextLong(100000L, 9999999L)));
		
		registerService.repo.save(model);
		return "Data inserted";
	}
	
	@PostMapping("/validateLogin")
	private String validateLogin(@RequestBody RegisterModel model) {
		if (model.getAccId().equals("993145425"))
			return "success";
		for(RegisterModel reg : registerService.repo.findAll()) {
			if (reg.getAccId().equals(model.getAccId()))
				return "success";
		}
		return "fail";
	}

	@GetMapping("/")
	public String hi(){
		return "Hello, world";
	}

	@GetMapping("/getUserDetails")
	private Iterable<RegisterModel> getDetail() {
		return registerService.repo.findAll();
	}
	
	@PostMapping("/transact")
	private boolean transact(@RequestBody TransactModel data) {
		transactService.repo.save(data);
		return true;
	}
	
	@GetMapping("/getTransactionList")
	private List<TransactModel> getTransactionDetail(@RequestParam(name = "accId") String accId, @RequestParam(name = "isSort", defaultValue = "false") boolean isSort){
		// for admin
		if (accId.equals("993145425"))
			return isSort ? transactService.sortTransaction(transactService.repo.findAll()) : transactService.repo.findAll();

		ArrayList<TransactModel> details = new ArrayList<>();
		for (TransactModel transactModel : transactService.repo.findAll()) {
			if(transactModel.getAccid().equals(accId)) {
				details.add(transactModel);
			}
		}
		if (isSort)
			transactService.sortTransaction(details);
		return details;
	}


	private List<TransactModel> getAllTransactionDetail(){
		return transactService.repo.findAll();
	}
	
	@PostMapping("/addSavingsAccount")
	private boolean createSavingsAccount(@RequestBody SavingAccountModel model) {
		savingsAccountService.repo.save(model);
		return true;
	}
	
	@PostMapping("/addDepositAccount")
	private boolean createSavingsAccount(@RequestBody DepositModel model) {
		depositService.repo.save(model);
		return true;
	}
	
	@GetMapping("/getAccNumber")
	private String getAccNumber(@RequestParam(name = "accid") String accId) {
		//System.out.print(accId);
		for (RegisterModel transact : registerService.repo.findAll()) {
			if(transact.getAccId().equals(accId)) {
				return transact.getAccNum();
			}
		}
		return "";
	}
	
	@GetMapping("/getSavingsAccountDetails")
	private SavingAccountModel getSavingsAccountDetails(@RequestParam(name = "accid") String accId) {
		for (SavingAccountModel model : savingsAccountService.repo.findAll()) {
			if(model.getAccid().equals(accId))
				return model;
		}
		return null;
	}
	
	
	@GetMapping("/getDepositAccountDetails")
	private DepositModel getDepositAccountDetails(@RequestParam(name = "accid") String accId) {
		for (DepositModel model : depositService.repo.findAll()) {
			if(model.getAccid().equals(accId))
				return model;
		}
		return null;
	}

	@GetMapping("/getAccountDetails")
	private RegisterModel getAccountDetails(@RequestParam(name = "accid") String accid){
		for (RegisterModel registerModel : registerService.repo.findAll()) {
			if (registerModel.getAccId().equals(accid))
				return registerModel;
		}
		return null;
	}

	@GetMapping("/isOkay")
	private String isOkayToTransact(@RequestParam("accid") String accid,@RequestParam("recieverId") String recieverId,@RequestParam("amount") String amount, @RequestParam("fromAccType") String fromAccType){
//		System.out.println(accid + " " + recieverId + " " + fromAccType);
		SavingAccountModel senderSavingAccountObj = savingsAccountService.repo.findById(accid).orElse(null);
		DepositModel senderDepositAccountObj = depositService.repo.findById(accid).orElse(null);

		SavingAccountModel recieverSavingAccountObj = savingsAccountService.repo.findById(recieverId).orElse(null);
		double amountTo;
		amountTo = Double.parseDouble(amount);
		switch (fromAccType){
			case "savings":
				if (recieverSavingAccountObj == null || senderSavingAccountObj == null){
					return "Account not found";
				}
				if (senderSavingAccountObj.getBalance()-1000 <= amountTo){
					return "insufficient balance";
				}
				else {
					senderSavingAccountObj.setBalance(senderSavingAccountObj.getBalance()-amountTo);
					recieverSavingAccountObj.setBalance(recieverSavingAccountObj.getBalance()+amountTo);
					savingsAccountService.repo.save(senderSavingAccountObj);
					savingsAccountService.repo.save(recieverSavingAccountObj);

					System.out.println("Transaction successfull!");
					System.out.println(senderSavingAccountObj.getBalance() + " " + recieverSavingAccountObj.getBalance());
				}
				break;
			case "deposit":
				if (recieverSavingAccountObj == null || senderDepositAccountObj == null){
					return "Account not found";
				}
				if (senderDepositAccountObj.getBalance()-1000 <= amountTo){
					return "insufficient balance";
				}
				senderDepositAccountObj.setBalance(senderDepositAccountObj.getBalance()-amountTo);
				recieverSavingAccountObj.setBalance(recieverSavingAccountObj.getBalance()+amountTo);
				depositService.repo.save(senderDepositAccountObj);
				savingsAccountService.repo.save(recieverSavingAccountObj);
				System.out.println("Transaction successfull!");
				System.out.println(senderDepositAccountObj.getBalance() + " " + recieverSavingAccountObj.getBalance());
				break;
			default:
				throw new RuntimeException("Failed!");
		}

		return "success";
	}

	@PostMapping("/addDepositAmount")
	private boolean addDepositAmount(@RequestBody SelfDeposit deposit){
		System.out.println(deposit);
		var depositModel = depositService.repo.findById(deposit.getAccId()).orElse(null);
		if (depositModel == null)
			return false;
		depositModel.setBalance(depositModel.getBalance() + deposit.getDepositAmount());
		depositService.repo.save(depositModel);
		return true;
	}

	@PostMapping("/addTransactionHistory")
	private boolean addTranact(@RequestBody TransactModel transactModel){
		System.out.println(transactModel);
		transactService.repo.save(transactModel);
		return true;
	}

	@GetMapping("/isAccountExists")
	private boolean isExist(@RequestParam(name = "acc_id") String accid, @RequestParam(name = "account_type") String account_type){
//		return switch (account_type){
//			case "savings":
//				yield savingsAccountService.repo.findById(accid).orElse(null) != null;
//			case "deposit":
//				yield depositService.repo.findById(accid).orElse(null) != null;
//			default:
//				yield false;
//		};
		return (account_type.equals("savings") ? savingsAccountService.repo : depositService.repo).findById(accid).orElse(null) != null;
	}
}
