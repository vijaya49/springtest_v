package com.jpmc.zitcode.repository;

import com.jpmc.zitcode.model.Employees;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employees, Integer> {

            
}
