package com.uday.mapper;

import com.uday.dto.DepartmentDto;
import com.uday.entity.Department;

public class DepartmentMapper {

    public static Department maptoDepartment(DepartmentDto departmentDto) {
        return new Department(
                departmentDto.getDepartmentId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }

    public static DepartmentDto maptoDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getDepartmentId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }
}

