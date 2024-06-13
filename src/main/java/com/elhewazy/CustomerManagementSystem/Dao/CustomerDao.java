package com.elhewazy.CustomerManagementSystem.Dao;

import com.elhewazy.CustomerManagementSystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
    public List<Customer> findByEmail(String email);
    public List<Customer> getCustmorByLastName(String lastName);
    public Customer getCustmorByPhone(long phone);
}
