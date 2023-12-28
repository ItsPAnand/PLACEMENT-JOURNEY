package com.app.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.repository.SavingsAccountRepo;

@Service
public class SavingsAccountService {

	@Autowired
	public SavingsAccountRepo repo;
}
