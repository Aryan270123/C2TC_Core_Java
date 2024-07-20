package com.DayThree;
// Demo on a HasA Association
public class Executor {

	public static void main(String[] args) {
		Address add1 = new Address("M.G Complex", "Sector-14", "Vashi", 400703);
		
		Person p1 = new Person("Aryan", add1);
		
		
//		System.out.println(p1);
		display(p1, add1);
	}
	
	public static void display(Person p1, Address add1) {
		System.out.println("My Name: "+p1.getName());
		System.out.println("My Address:-");
		System.out.println("Street: "+ add1.getStreet());
		System.out.println("Landmark: "+ add1.getLandmark());
		System.out.println("City: " + add1.getCity());
		System.out.println("Pincode: " + add1.getPincode());
	}
	
	

}
