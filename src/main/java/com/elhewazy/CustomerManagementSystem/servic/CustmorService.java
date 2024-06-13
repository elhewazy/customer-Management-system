package com.elhewazy.CustomerManagementSystem.servic;

import com.elhewazy.CustomerManagementSystem.model.Customer;


import java.util.List;

public interface CustmorService {
public List<Customer> getAll();
    public Customer addCustmor(Customer u);
    public List<Customer> getCustmorByEmail(String email);
    public List<Customer> getCustmorByLastName(String lastName);
    public Customer getCustmorByPhone(long phone);
    public Customer updateCustmor(Customer s);
    public String deletCustmor(int id);
}
