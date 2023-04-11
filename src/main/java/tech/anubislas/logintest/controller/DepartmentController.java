package tech.anubislas.logintest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tech.anubislas.logintest.entity.Department;
import tech.anubislas.logintest.service.DepartmentService;
import tech.anubislas.logintest.service.DepartmentServiceImpl;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        
        DepartmentService service = new DepartmentServiceImpl();

        return departmentService.saveDepartment(department);
    }
}
