package com.arman.crudapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department_id;
    private String department_name;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "department")
    private List<Employee> employees;

    

    public Department() {
    }


    public Department(Long department_id, String department_name, List<Employee> employees) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.employees = employees;
    }


    public Long getDepartment_id() {
        return department_id;
    }


    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }


    public String getDepartment_name() {
        return department_name;
    }


    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }


    public List<Employee> getEmployees() {
        return employees;
    }


    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    
}
