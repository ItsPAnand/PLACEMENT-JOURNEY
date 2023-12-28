package com.app.bank.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.SavingAccountModel;
import com.app.bank.model.TransactModel;

@Repository
public interface SavingsAccountRepo extends JpaRepository<SavingAccountModel, String> {

}
