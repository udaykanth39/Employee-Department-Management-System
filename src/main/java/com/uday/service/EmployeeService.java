package com.uday.service;

import com.uday.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(long id);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(long id, EmployeeDto updatedEmployeeDto);
    EmployeeDto deleteEmployee(long id);

}
