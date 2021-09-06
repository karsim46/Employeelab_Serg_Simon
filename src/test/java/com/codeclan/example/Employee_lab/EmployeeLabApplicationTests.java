package com.codeclan.example.Employee_lab;

import com.codeclan.example.Employee_lab.Model.Employee;
import com.codeclan.example.Employee_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jack = new Employee("jack",30,666,"jackdaniels@satan.com");
		employeeRepository.save(jack);
	}

}
