package com.firsttest.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firsttest.entity.Employee;
import com.firsttest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEmplyeeData() {
		String line = "";
		try {
			BufferedReader buffer = new BufferedReader(new FileReader("src/main/resources/EmployeeData.csv"));
			while ((line =buffer.readLine())!=null) {
				String[] data = line.split(",");
				Employee employee = new Employee();
				employee.setName(data[0]);
				employee.setEmployeeId(Integer.valueOf(data[1]));
				employee.setDepartment(data[2]);
				employeeRepository.save(employee);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
