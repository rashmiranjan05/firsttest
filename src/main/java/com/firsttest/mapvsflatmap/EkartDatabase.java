package com.firsttest.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
	
	public static List<Customer> getAll(){
		return Stream.of(new Customer(101, "lucky", "lucky@gmail.com", Arrays.asList("45213665", "4521366563")),
				new Customer(101, "sisodiya", "sisodiya@gmail.com", Arrays.asList("452853665", "452966563")),
				new Customer(101, "raj", "raj@gmail.com", Arrays.asList("4520000665", "405523366563")),
				new Customer(101, "singh", "singh@gmail.com", Arrays.asList("4102353665", "45242365666563"))
				).collect(Collectors.toList());
	}

}
