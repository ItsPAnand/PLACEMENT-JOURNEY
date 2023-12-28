package com.app.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.TransactModel;

@Repository
public interface TransactRepo extends JpaRepository<TransactModel, String>{

}
