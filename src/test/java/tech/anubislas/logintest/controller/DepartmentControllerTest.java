package tech.anubislas.logintest.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tech.anubislas.logintest.entity.Department;
import tech.anubislas.logintest.service.DepartmentService;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebFluxTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentAdress("Rohero")
                .departmentName("Network")
                .departmentCode("NW001")
                .departmentId(1L)
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Department InputDepartment = Department.builder()
                .departmentAdress("Rohero")
                .departmentName("Network")
                .departmentCode("NW001")
                .build();

        Mockito.when(departmentService.saveDepartment(InputDepartment))
                .thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.post = MockMvcRequestBuilders.post();
        post("/departments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("    {\n" +
                        "        \"departmentName\": \"Network\",\n" +
                        "        \"departmentAdress\": \"Rohero\",\n" +
                        "        \"departmentCode\": \"NW001\"\n" +
                        "    }")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void fetchDepartmentByDepartmentId() {
    }
}