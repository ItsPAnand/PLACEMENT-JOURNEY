package com.app.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.repository.RegisterRepo;

@Service
public class RegisterService {

	@Autowired
	public RegisterRepo repo;

}
