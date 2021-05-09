package com.wcci.springbootexercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import javax.annotation.Resource;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeRepository employeeRepo;


    @GetMapping({"/employees",""})
    public String getAllEmployees(Model model){
        model.addAttribute("allEmployeesModel", employeeRepo.getAllEmployees());
        return "all-employees-template";
    }



}
