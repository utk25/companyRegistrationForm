package com.cimplyFive.companyregistration.repository;

import com.cimplyFive.companyregistration.databasemodel.RegisteredCompany;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RegisteredCompanyRepository extends MongoRepository<RegisteredCompany, String> {

    RegisteredCompany findByEmailId(String emailId);

    List<RegisteredCompany> findAll();
}

