package com.uday.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepartmentDto {
    @JsonProperty("department_id")
    private long departmentId;
    private String departmentName;
    private String departmentDescription;

    public DepartmentDto() {
    }

    public DepartmentDto(long departmentId, String departmentName, String departmentDesc) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentDescription = departmentDesc;
    }

    public DepartmentDto(String departmentName, String departmentDesc) {
        this.departmentName = departmentName;
        this.departmentDescription = departmentDesc;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDesc) {
        this.departmentDescription = departmentDesc;
    }
}
