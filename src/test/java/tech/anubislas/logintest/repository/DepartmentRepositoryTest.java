package tech.anubislas.logintest.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import tech.anubislas.logintest.entity.Department;

@DataJpaTest
public class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp(){
        Department department = 
                    Department.builder()
                    .departmentAdress("Gisenyi")
                    .departmentCode("MECH-010")
                    .departmentName("Mechanic")
                    .build();
        
        entityManager.persist(department);
    }

    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findById(1).get();
        assertEquals(department.getDepartmentName(), "Mechanic");
    }

}