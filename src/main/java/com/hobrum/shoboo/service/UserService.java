package com.hobrum.shoboo.service;

import com.hobrum.shoboo.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllEmployee();
    public void saveEmployee(User user);
    public User getEmployee(int id);
    public void deleteEmployee(int id);

}
