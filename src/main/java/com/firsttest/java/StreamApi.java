package com.firsttest.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.fasterxml.jackson.core.sym.Name;

public class StreamApi {

	/**
	 * occureance of each characters in a given string
	 * 
	 */

//	public static void main(String[] args) {
//		
//	
//	String name = "Rashmi Ranjan Swain";
//	char[] charArray = name.replaceAll(" ", "").toLowerCase().toCharArray();
//	System.out.println(charArray[0]);
//	Map<Character, Integer> map = new HashMap<>();
//	int count = 1;
//	for (int i = 0; i < charArray.length; i++) { 
//		if(map.containsKey(charArray[i])) {
//			count++;
//		map.put(charArray[i], count);
//		}
//		map.put(charArray[i], count);
//		count = 1;
//	}
//	System.out.println(map);
//	}
	/**
	 * occureance of each characters in a given string using stream api
	 * 
	 */
//	public static void main(String[] args) {
//		
//		String name = "Rashmi Ranjan Swain";
//		Map<String, Long> map = Arrays.stream(name.replaceAll(" ", "").split(""))
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(map);
//		
//		
//		
//	}

	/*
	 * duplicate and unique elements from a given string using stream api
	 */

//	public static void main(String[] args) {
//		String name = "Rashmi Ranjan Swain";
//		List<String> duplicateList = Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		.entrySet().stream()
//		.filter(x -> x.getValue() > 1)
//		.map(Map.Entry::getKey)
//		.collect(Collectors.toList());
//		System.out.println(duplicateList);
//		
//		
//		List<String> uniqueElements = Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//				.entrySet().stream()
//				.filter(x -> x.getValue() == 1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//				System.out.println(uniqueElements);
//
//		}

	/*
	 * first non repeat and repeat elements of a given string using stream api
	 */

//	public static void main(String[] args) {
//		String name = "Rashmi Ranjan Swain";
//		String firstNonRepeatElement = Arrays.stream(name.toLowerCase().split(""))
//		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//		.entrySet().stream()
//		.filter(x -> x.getValue()==1)
//		.findFirst().get().getKey();
//		System.out.println("First Non Repeat Element---->" + firstNonRepeatElement);
//		
//		String firstRepeatElement = Arrays.stream(name.toLowerCase().split(""))
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//				.entrySet().stream()
//				.filter(x -> x.getValue()>1)
//				.findFirst().get().getKey();
//				System.out.println("First Repeat Element---->" + firstRepeatElement);
//	}

	/*
	 * second highest and lowest number of a given array using stream api
	 */

//	public static void main(String[] args) {
//		int[] num = { 5, 9, 11, 2, 8, 21, 1 };
//		Integer secondHighestNum = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
//				.get();
//		System.out.println("Second Highest Number---->" + secondHighestNum);
//
//		Integer secondLowestNum = Arrays.stream(num).boxed().sorted().skip(1).findFirst().get();
//		System.out.println("Second Lowest Number---->" + secondLowestNum);
//	}

	/*
	 * longest string in a given string array using stream api
	 */
	
//	public static void main(String[] args) {
//		String[] strArray = {"java","spring boot","hibernate","mysql","mongodb"};
//		String longestString = Arrays.stream(strArray)
//		.reduce((word1, word2) -> word1.length()>word2.length() ? word1 : word2)
//		.get();
//		System.out.println("Longest String------>"+longestString);
//	}
	
	/*
	 * number or string starts with some specific value of a array using stream api
	 */
	
//	public static void main(String[] args) {
//		int[] num = { 5, 9, 11, 2, 8, 21, 1, 29 };
//		List<String> startsWithList = Arrays.stream(num)
//		.boxed()
//		.map(s -> s + "")
//		.filter(s -> s.startsWith("2"))
//		.collect(Collectors.toList());
//		
//		System.out.println("Starts with List----->"+startsWithList);
//	}
	
	/*
	 * String.join() method
	 */
//	public static void main(String[] args) {
//		List<String> nos = Arrays.asList("1", "2", "3", "4");
//		String results = String.join("-", nos);
//		System.out.println(results);
//	}
	
	/*
	 * Skip() and limit() method usages
	 */
	
	
//	public static void main(String[] args) {
//		IntStream.rangeClosed(1, 10)
//		.skip(1)
//		.limit(8)
//		.forEach(System.out::println);
//	}
	
	/*
	 * Sort a list and map
	 */
	
//	
//	public static void main(String[] args) {
//		
//	}
	
	/*
	 * map() and flatMap()
	 */
	
//	public static void main(String[] args) {
//		
//	}
	
}
