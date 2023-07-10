package com.firsttest.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<Customer> listOfCustomers = EkartDatabase.getAll();
		
		//List<Customer> convert to List<String> --> Data Transformation
		
		List<String> listOfEmails = listOfCustomers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(listOfEmails);
	}	
}
