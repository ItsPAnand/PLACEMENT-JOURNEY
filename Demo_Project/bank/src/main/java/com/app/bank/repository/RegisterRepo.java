package com.app.bank.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.RegisterModel;

import java.util.List;

@Repository
public interface RegisterRepo extends CrudRepository<RegisterModel, String>{

}
