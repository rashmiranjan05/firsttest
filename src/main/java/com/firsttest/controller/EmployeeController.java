package com.firsttest.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firsttest.entity.Employee;
import com.firsttest.repository.EmployeeRepository;
import com.firsttest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeRepository.save(employee), HttpStatus.OK);
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getEmployee() {
		return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
		
	}
	
	@GetMapping("/get/date")
	public ResponseEntity<Object[]> getEmployeeByDate(@RequestParam("startDate") String startDate, 
			@RequestParam("lastDate") String lastDate,
			@RequestParam("employeeId") Long employeeId) {
		


		LocalDate startLocalDate = LocalDate.parse(startDate);
		LocalDate lastLocalDate = LocalDate.parse(lastDate);

//	    Period period = Period.between(startLocalDate, lastLocalDate);
//
//	    int months = period.getMonths();
//	    int days = period.getDays();
//
//	    Object[] dateDifference = new Object[]{months, days};
		
		
		
		
		

		int months = (int) Period.between(startLocalDate, lastLocalDate).toTotalMonths();
		int days = lastLocalDate.getDayOfMonth() - startLocalDate.getDayOfMonth();

		Object[] dateDifference = new Object[]{months, days};

	    System.out.println(dateDifference[0]);
	    System.out.println(dateDifference[1]);
	    
	    
	    
	    
		Object[] dateDifferenceInMonthsAndDays = employeeRepository.getDateDifferenceInMonthsAndDays(startLocalDate,lastLocalDate,employeeId);
		return new ResponseEntity<>(dateDifferenceInMonthsAndDays, HttpStatus.OK);
	}
	
	@GetMapping("/export/csv")
	public void saveToDatabase() {
		employeeService.saveEmplyeeData();
	}
}
