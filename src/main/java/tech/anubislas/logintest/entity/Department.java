package tech.anubislas.logintest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long departmentId;
    private String departmentname;
    private String departmentName;
    private String departmentAdress;


    public Department(Long departmentId, String departmentname, String departmentName, String departmentAdress) {
        this.departmentId = departmentId;
        this.departmentname = departmentname;
        this.departmentName = departmentName;
        this.departmentAdress = departmentAdress;
    }
    public Department() {}


    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentname() {
        return this.departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAdress() {
        return this.departmentAdress;
    }

    public void setDepartmentAdress(String departmentAdress) {
        this.departmentAdress = departmentAdress;
    }


    
}
