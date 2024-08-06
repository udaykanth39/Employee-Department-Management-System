package com.uday.service;

import com.uday.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);
    DepartmentDto updateDepartment(long id, DepartmentDto departmentDto);
    DepartmentDto getDepartmentById(long id);
    List<DepartmentDto> getAllDepartments();
    void deleteDepartment(long id);
}


