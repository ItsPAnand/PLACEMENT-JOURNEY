package com.app.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.repository.DepositRepo;

@Service
public class DepositService {
	
	@Autowired
	public DepositRepo repo;

}
