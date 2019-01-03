package com.cimplyFive.companyregistration.controller;

import com.cimplyFive.companyregistration.adapter.RequestBodyToMongoModelConverter;
import com.cimplyFive.companyregistration.databasemodel.RegisteredCompany;
import com.cimplyFive.companyregistration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RequestBodyToMongoModelConverter requestBodyToMongoModelConverter;

    @Autowired
    private RegisteredCompany registeredCompany;

    @RequestMapping(method = RequestMethod.POST, value = "/register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void registerCompany(@RequestParam Map<String, String> body) {

        registeredCompany = requestBodyToMongoModelConverter.convertToMongoModel(body);
        registrationService.registerCompany(registeredCompany);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public List<RegisteredCompany> registeredCompanies() {

        return registrationService.findAll();
    }

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @GetMapping("/error")
    public ModelAndView error() {
        return new ModelAndView("error.html");
    }
}