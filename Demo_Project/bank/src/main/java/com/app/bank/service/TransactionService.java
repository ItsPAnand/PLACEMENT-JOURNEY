package com.app.bank.service;

import com.app.bank.model.TransactModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.repository.TransactRepo;

import java.util.Comparator;
import java.util.List;

@Service
public class TransactionService {

	@Autowired
	public TransactRepo repo;

	public List<TransactModel> sortTransaction(List<TransactModel> transactRepoList){
		transactRepoList.sort(new Comparator<TransactModel>() {
			@Override
			public int compare(TransactModel o1, TransactModel o2) {
				return Double.compare(o1.getAmount(), o2.getAmount());
			}
		});
		return transactRepoList;
	}

}
