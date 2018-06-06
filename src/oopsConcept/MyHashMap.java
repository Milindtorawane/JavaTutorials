package oopsConcept;

import java.util.HashMap;

//A HashMap contains values based on the key.
//It contains only unique elements.
//It may have one null key and multiple null values.
//It maintains no order



public class MyHashMap {
	
	
	
	
	
	public static void main (String []args){
		
		
		System.out.println("I am here ");
		HashMap<String,String> PhoneBook=new HashMap<String,String>();  
		PhoneBook.put("Milind T", "9028320176");
		PhoneBook.put("Prasad", "985001444");
		
		
		System.out.println(PhoneBook.get("Milind T"));
		
	}
}
