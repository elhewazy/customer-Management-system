package com.elhewazy.CustomerManagementSystem.servic;

import com.elhewazy.CustomerManagementSystem.model.User;

public interface UserServic {

  public User addUser(User u);
    public User getUser(String email,String password);
    public User updateUser(User u);
    public User deletUser(int id);



}
