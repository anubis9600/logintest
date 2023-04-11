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
    private String departmentName;
    private String departmentAdress;
    private String departmentCode;

    public Department(Long departmentId, String departmentName, String departmentAdress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAdress = departmentAdress;
        this.departmentCode = departmentCode;
    }

    public Department() {}


    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
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

    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    
}
