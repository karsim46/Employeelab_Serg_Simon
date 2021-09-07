package com.codeclan.example.Employee_lab.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "employees")

public class Employee{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "name")
private String name;

@Column(name = "age")
private int age;

@Column(name = "employee_number")
private int employeeNumber;

@Column(name = "email")
private String email;

@ManyToOne
@JoinColumn(name = "department_id", nullable = false)
@JsonIgnoreProperties({"employees"})
private Department department;


    public Employee (String name, int age, int employeeNumber, String email, Department department){
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.department = department;
    }
    public Employee(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setId(Long id) {
        this.id = id;
    }
}
