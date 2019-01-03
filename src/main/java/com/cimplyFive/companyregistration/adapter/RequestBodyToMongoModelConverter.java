package com.cimplyFive.companyregistration.adapter;

import com.cimplyFive.companyregistration.databasemodel.RegisteredCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class RequestBodyToMongoModelConverter {

    @Autowired
    private RegisteredCompany registeredCompany = new RegisteredCompany();

    public RegisteredCompany convertToMongoModel(Map<String, String> body) {

        registeredCompany.setEmailId(body.get("emailId"));
        registeredCompany.setFirstName(body.get("firstName"));
        registeredCompany.setMiddleName(body.get("middleName"));
        registeredCompany.setLastName(body.get("lastName"));
        registeredCompany.setMobileNumber(Long.parseLong(body.get("mobileNumber")));
        registeredCompany.setOrganizationName(body.get("organizationName"));
        registeredCompany.setDesignation(body.get("designation"));
        registeredCompany.setOfficeNumber(Long.parseLong(body.get("officeNumber")));
        registeredCompany.setAddress1(body.get("address1"));
        registeredCompany.setAddress2(body.get("address2"));
        registeredCompany.setLandmark(body.get("landmark"));
        registeredCompany.setPin(Integer.parseInt(body.get("pin")));
        registeredCompany.setCity(body.get("city"));
        registeredCompany.setState(body.get("state"));
        registeredCompany.setCountry(body.get("country"));
        registeredCompany.setEmailFrequency(body.get("emailFrequency"));

        return registeredCompany;
    }
}
