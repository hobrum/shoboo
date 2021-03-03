package com.hobrum.shoboo.controller;

import com.hobrum.shoboo.entity.User;
import com.hobrum.shoboo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("api")
public class MyRESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String wellcome() {

        return "Wellcome page!";

    }

    @GetMapping("/users")
    public List<User> showAllEmployees() {

        List<User> allUsers = userService.getAllEmployee();
        return allUsers;

    }

}
