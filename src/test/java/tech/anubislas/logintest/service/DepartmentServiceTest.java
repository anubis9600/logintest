package tech.anubislas.logintest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import tech.anubislas.logintest.entity.Department;
import tech.anubislas.logintest.repository.DepartmentRepository;

@SpringBootTest
public class DepartmentServiceTest {
    
    @Autowired
    private DepartmentService  departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp(){
        Department department = 
                    Department.builder()
                    .departmentName("NETWORK")
                    .departmentAdress("ASYST BDI")
                    .departmentCode("NW015")
                    .departmentId(1L)
                    .build();
        
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("network"))
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on valid Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "NETWORK";
        Department found = 
                    departmentService.fetchDepartmentByDepartmentName(departmentName);
        
        assertEquals(departmentName, found.getDepartmentName());
    }
}