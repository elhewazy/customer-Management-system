package com.elhewazy.CustomerManagementSystem.Dao;

import com.elhewazy.CustomerManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {


}
