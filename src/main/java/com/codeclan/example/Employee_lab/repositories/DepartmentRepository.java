package com.codeclan.example.Employee_lab.repositories;

import com.codeclan.example.Employee_lab.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
