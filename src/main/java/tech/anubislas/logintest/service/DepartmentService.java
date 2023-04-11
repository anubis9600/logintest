package tech.anubislas.logintest.service;

import java.util.List;

import tech.anubislas.logintest.entity.Department;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
