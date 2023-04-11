package tech.anubislas.logintest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.anubislas.logintest.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
}