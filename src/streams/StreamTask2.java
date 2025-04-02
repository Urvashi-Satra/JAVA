package streams;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTask2 {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=xifdVmHOAWc&list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy
		//https://www.youtube.com/watch?v=1Ps5F1PU72M
		
		System.out.println("Q1 - Java program to count the occurence of each character in a string");
		
		String sentence ="streamapijava";
		
		Map<String, Long> map= Arrays.stream(sentence.split(""))
									.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		System.out.println(map);
		
		
		
		
		
		
		
/*01 Given a sentence, find the word that has the highest length*/
		
		System.out.println("01 Given a sentence, find the word that has the highest length");
		
		
		String sentence1= "I am learning java streamApi";
		
		String result=Arrays.stream(sentence1.split(" "))
							.max(Comparator.comparing(String::length))
							.get();
		
		System.out.println(result);
		
/* 02 Remove duplicate from string and return in same order*/
		
		System.out.println("02 - Remove duplicate from string and return in same order");
		String sentence2="dabcadefg";
		
		String output = sentence2.chars()
								 .distinct()
								 .mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(output);

/*Sorting with lambdas*/
	System.out.println("Sorting list with comparator");
	//traditional way
			class MyComparator implements Comparator<Employee>{

				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return (o1.getSalary()-o2.getSalary());
				}
				
				
			}
			List<Employee> employees=DataBase.getEmployees();
			Collections.sort(employees,new MyComparator());
//			System.out.println(employees);
			
/*Anonymous*/
			//traditional way
			Collections.sort(employees,new Comparator<Employee>() {
				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return (o1.getSalary()-o2.getSalary());
				}

			});
			
//			System.out.println(employees);
			
/*lambda Expression*/
			//traditional way
			Collections.sort(employees,(o1,o2)-> (o1.getSalary()-o2.getSalary()));
			
//			System.out.println(employees);
			
/* Using stream API*/
			employees.stream().sorted((o1,o2)-> (o1.getSalary()-o2.getSalary())).forEach(System.out::println);
			
/*Using comparator*/		
			employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
/*using method reference*/
			
			employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);;
			
			
			
/*Sorting MAP with lambda */
		//traditional	
			Map<String, Integer> map2=new HashMap<>();
			map2.put("eight", 8);
			map2.put("four", 4);
			map2.put("ten", 10);
			map2.put("two", 2);
			
			//first take the entry set in list format 
		List<Entry<String, Integer>> entries= new ArrayList<>(map2.entrySet());
//			
//			Collections.sort(entries,new Comparator<Entry<String, Integer>>() {
//
//				@Override
//				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//					// TODO Auto-generated method stub
//					return (o1.getValue().compareTo(o2.getValue()));
//				}
//			});
			
			
			
			//lambda expresssion comparator
			
			Collections.sort(entries,(o1,o2)-> (o1.getKey().compareTo(o2.getKey())));
			
			for(Entry<String, Integer> entry :entries) {
				System.out.println(entry);
			}
			
			
			//stream api 
			
			// get entryset first , convert it into stream , use sort method with comparator
			
			map2.entrySet().stream()
							.sorted((o1,o2) -> (o1.getValue().compareTo(o2.getValue())))
							.forEach(System.out::println);
			
			//or
			
			map2.entrySet().stream()
							.sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
			
			Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
			employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
			employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
			employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
			employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
			employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
			
			
			employeeMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
			.forEach(System.out::println);
	}

}
