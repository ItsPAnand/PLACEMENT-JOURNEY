package com.app.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.DepositModel;
import com.app.bank.model.RegisterModel;

@Repository
public interface DepositRepo extends JpaRepository<DepositModel, String> {

}
