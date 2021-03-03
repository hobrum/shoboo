package com.hobrum.shoboo.service;

import com.hobrum.shoboo.entity.User;
import com.hobrum.shoboo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllEmployee() {

        return userRepository.getAllEmployees();

    }

    @Override
    public void saveEmployee(User user) {

    }

    @Override
    public User getEmployee(int id) {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

    }
}
