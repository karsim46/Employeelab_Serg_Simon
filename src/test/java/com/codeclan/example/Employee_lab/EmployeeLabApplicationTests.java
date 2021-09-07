package com.codeclan.example.Employee_lab;

import com.codeclan.example.Employee_lab.Model.Department;
import com.codeclan.example.Employee_lab.Model.Employee;
import com.codeclan.example.Employee_lab.repositories.DepartmentRepository;
import com.codeclan.example.Employee_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department1 = new Department("department1");
		departmentRepository.save(department1);
		Employee jack = new Employee("jack",30,666,"jackdaniels@satan.com",department1);
		employeeRepository.save(jack);
		department1.addEmployee(jack);
		departmentRepository.save(department1);

	}



}
