package com.cimplyFive.companyregistration.service;

import com.cimplyFive.companyregistration.databasemodel.RegisteredCompany;
import com.cimplyFive.companyregistration.exception.EmailFailureException;
import com.cimplyFive.companyregistration.repository.RegisteredCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.util.List;

@Configuration
public class RegistrationService {

    @Autowired
    private RegisteredCompanyRepository registeredCompanyRepository;

    @Autowired
    private JavaMailSender sender;

    public void registerCompany(RegisteredCompany registeredCompany) {

        addCompany(registeredCompany);
        try {
            sendEmail(registeredCompany.getEmailId());
        } catch (Exception e) {
            throw new EmailFailureException("Could not send email to the intended recipient");
        }
    }

    public List<RegisteredCompany> findAll() {
        return registeredCompanyRepository.findAll();
    }

    private RegisteredCompany getRegisteredCompanyByEmail(String emailId) {
        return registeredCompanyRepository.findByEmailId(emailId);
    }

    private void addCompany(RegisteredCompany registeredCompany) {
        registeredCompanyRepository.save(registeredCompany);
    }

    private void sendEmail(String emailId) throws Exception {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setTo(emailId);
        helper.setText("You have successfully registered your company @ CimplyFive");
        helper.setSubject("CimplyFive - Registration Successful");
        sender.send(message);
    }
}
