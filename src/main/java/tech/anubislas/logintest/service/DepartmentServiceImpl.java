package tech.anubislas.logintest.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.anubislas.logintest.entity.Department;
import tech.anubislas.logintest.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    Department department;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentByDepartmentId(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartmentById(Integer id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
        Department departmentFromDb = departmentRepository.findById(id).orElse(null);

        if (Objects.nonNull(department.getDepartmentName()) && 
        !"".equalsIgnoreCase(departmentFromDb.getDepartmentName())) {
            
        }
        if (Objects.nonNull(department.getDepartmentAdress()) && 
        !"".equalsIgnoreCase(departmentFromDb.getDepartmentAdress())) {
            
        }
        if (Objects.nonNull(department.getDepartmentCode()) && 
        !"".equalsIgnoreCase(departmentFromDb.getDepartmentCode())) {
            
        }
        departmentFromDb.setDepartmentName(department.getDepartmentName());
        departmentFromDb.setDepartmentAdress(department.getDepartmentAdress());
        departmentFromDb.setDepartmentCode(department.getDepartmentCode());

        return departmentRepository.save(departmentFromDb);
    }

    @Override
    public Department fetchDepartmentByDepartmentName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }

    
}
