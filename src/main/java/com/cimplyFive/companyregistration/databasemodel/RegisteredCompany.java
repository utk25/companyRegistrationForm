package com.cimplyFive.companyregistration.databasemodel;

import com.cimplyFive.companyregistration.constants.RegistrationServiceConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Configuration
@Document
public class RegisteredCompany {

    @Id
    private String emailId;
    private String firstName;
    private String middleName = "";
    private String lastName;
    private Long mobileNumber;
    private String organizationName;
    private String designation;
    private Long officeNumber;
    private String address1;
    private String address2 = "";
    private String landmark = "";
    private Integer pin;
    private String city;
    private String state;
    private String country;
    private String emailFrequency = RegistrationServiceConstants.FREQUENCY_OF_EMAIL;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Long officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailFrequency() {
        return emailFrequency;
    }

    public void setEmailFrequency(String emailFrequency) {
        this.emailFrequency = emailFrequency;
    }

    public RegisteredCompany(String emailId, String firstName, String middleName, String lastName, Long mobileNumber, String organizationName, String designation, Long officeNumber, String address1, String address2, String landmark, Integer pin, String city, String state, String country, String emailFrequency) {
        this.emailId = emailId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.organizationName = organizationName;
        this.designation = designation;
        this.officeNumber = officeNumber;
        this.address1 = address1;
        this.address2 = address2;
        this.landmark = landmark;
        this.pin = pin;
        this.city = city;
        this.state = state;
        this.country = country;
        this.emailFrequency = emailFrequency;
    }

    public RegisteredCompany() {}
}

