package com.jpmc.zitcode.controller;

import com.jpmc.zitcode.model.Employees;
import com.jpmc.zitcode.repository.EmployeeRepository;
import com.jpmc.zitcode.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/v1/employees/")
public class EmployeeController {

    @Autowired
   private IEmployeeService employeeService;

    @GetMapping("showEmpDetails")
    public String empDetails(Model model) {

       List<Employees> empList =  employeeService.findAll();

        model.addAttribute("empList", empList);
       // System.out.println("Employee>>>>>>"+emp);
        return "showEmpDetails";
    }




}
