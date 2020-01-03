package com.jpmc.zitcode.service;

import com.jpmc.zitcode.model.Employees;
import com.jpmc.zitcode.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;



    @Override
    public List<Employees> findAll()
    {
        /*String sql= "select * from employees";
        System.out.println("Querry:::::::::::"+sql);
        List<Employees> empList=jtm.query(sql,new BeanPropertyRowMapper(Employees.class));
        System.out.println("empList:::::::::::"+empList);*/
        return (List<Employees>) employeeRepository.findAll();

    }
}
