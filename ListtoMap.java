// Java program for list convert in map 
// with the help of Object method 

import java.util.ArrayList; 
import java.util.List; 
import java.util.Map; 
import java.util.HashMap; 

// create a list 
class Student { 

	// id will act as Key 
	private Integer id; 

	// name will act as value 
	private String name; 

	// create curstuctor for reference 
	public Student(Integer id, String name) 
	{ 

		// assign the value of id and name 
		this.id = id; 
		this.name = name; 
	} 

	// return private variable id 
	public Integer getId() 
	{ 
		return id; 
	} 

	// return private variable name 
	public String getName() 
	{ 
		return name; 
	} 
} 

// main class and method 
public class ListtoMap  { 

	// main Driver 
	public static void main(String[] args) 
	{ 

		// create a list 
		List<Student> 
			lt = new ArrayList<Student>(); 

		// add the member of list 
		lt.add(new Student(1, "Geeks")); 
		lt.add(new Student(2, "For")); 
		lt.add(new Student(3, "Geeks")); 

		// create map with the help of 
		// Object (stu) method 
		// create object of Map class 
		Map<Integer, String> map = new HashMap<>(); 

		// put every value list to Map 
		for (Student stu : lt) { 
			map.put(stu.getId(), stu.getName()); 
		} 

		// print map 
		System.out.println("Map : " + map); 
	} 
} 
