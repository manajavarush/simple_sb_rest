package com.stas.spring.boot.simple_sb_rest.dao;

import com.stas.spring.boot.simple_sb_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
     List<Employee> getAllEmployees();

     void saveEmployee(Employee employee);

     Employee getEmployee(int id);

     void deleteEmployee(int id);
}
