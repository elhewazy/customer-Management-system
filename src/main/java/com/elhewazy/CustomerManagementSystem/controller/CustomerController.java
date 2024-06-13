package com.elhewazy.CustomerManagementSystem.controller;

import com.elhewazy.CustomerManagementSystem.model.Customer;
import com.elhewazy.CustomerManagementSystem.servic.CustmorServicImp;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CustomerController {

    @Autowired
    CustmorServicImp cs;
    @PutMapping
    public Customer updateCustomer(){
        return null;
    }
    @PostMapping("/addCustmor")
    public Customer addCustomer(@RequestBody Customer c){
Customer returCustomer = this.cs.addCustmor(c);
if(returCustomer == null){
    log.debug("the customer did not added"+ c.toString());
}else {log.debug("adding new custmor "+ c.toString());}

        return returCustomer;
    }
    @GetMapping
    public Customer getCustomer(){
        return null;
    }
    @GetMapping("/findByPhone/{phone}")
    public Customer getCustomerByPhone(@PathVariable long phone){
        log.debug("getting customer by phone  "+ phone );
        return this.cs.getCustmorByPhone(phone);
    }
    @GetMapping("/findByemail/{email}")
    public List<Customer> getCustomerByEmail(@PathVariable String email){
        List<Customer> listReturning = cs.getCustmorByEmail(email);
        if(listReturning.get(0) == null){
            log.info("the email not founding "+ email);
        }else {
            log.info("we found the eamil " + email);
        }
        return listReturning;
    }
    @DeleteMapping
    public String deletCustomer(int id){
        return this.cs.deletCustmor(id);
    }
}
