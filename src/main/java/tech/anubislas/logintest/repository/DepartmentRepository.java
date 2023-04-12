package tech.anubislas.logintest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.anubislas.logintest.entity.Department;

// @Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    public Department findByDepartmentName(String name);
    public Department findByDepartmentNameIgnoreCase(String name);
}