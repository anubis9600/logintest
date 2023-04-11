package tech.anubislas.logintest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tech.anubislas.logintest.entity.Department;
import tech.anubislas.logintest.repository.DepartmentRepository;
import tech.anubislas.logintest.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private DepartmentRepository repository;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentByDepartmentId(@PathVariable("id") Integer id){
        return departmentService.fetchDepartmentByDepartmentId(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Integer id){
        departmentService.deleteDepartmentById(id);
        return "Departement supprimee";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Integer id,
            @RequestBody Department department){
        return departmentService.updateDepartment(id, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByDepartmentName(@PathVariable("name") String name){
        return departmentService.fetchDepartmentByDepartmentName(name);
    }

}
