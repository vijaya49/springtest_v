package com.jpmc.zitcode.service;

import com.jpmc.zitcode.model.Employees;

import java.util.List;

public interface IEmployeeService {

    List<Employees> findAll();
}
