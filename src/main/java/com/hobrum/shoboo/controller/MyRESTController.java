package com.hobrum.shoboo.controller;

import com.hobrum.shoboo.entity.Employee;
import com.hobrum.shoboo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/empl")
    public List<Employee> showAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployee();
        return allEmployees;

    }

}
