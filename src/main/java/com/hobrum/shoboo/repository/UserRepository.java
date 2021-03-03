package com.hobrum.shoboo.repository;

import com.hobrum.shoboo.entity.User;

import java.util.List;

public interface UserRepository {

    public List<User> getAllEmployees();
    public void saveEmployee(User user);
    public User getEmployee(int id);
    public void deleteEmployee(int id);

}
