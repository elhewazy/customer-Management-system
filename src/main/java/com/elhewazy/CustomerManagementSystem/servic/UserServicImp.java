package com.elhewazy.CustomerManagementSystem.servic;

import com.elhewazy.CustomerManagementSystem.Dao.UserDao;
import com.elhewazy.CustomerManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicImp implements UserServic{
    @Autowired
    UserDao ud;
    @Override
    public User addUser(User u) {
        return null;
    }

    @Override
    public User getUser(String email, String password) {


        return null;
    }

    @Override
    public User updateUser(User u) {
        return null;
    }

    @Override
    public User deletUser(int id) {
        return null;
    }

    private void checkUser(){

    }
}
