package com.tools.apirestredis.repository;

import org.springframework.data.repository.CrudRepository;
import com.tools.apirestredis.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
