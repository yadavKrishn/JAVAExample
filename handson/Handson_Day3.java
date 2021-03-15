package com.handson;

import java.util.Scanner;

//problem 5
class Venue1{
	private String name;
	public String getName() {
	    return name;
	}
	 public void setName(String n) {
		    this.name = n;
	 }
	private String city;
	public String getCity() {
	    return city;
}
	public void setCity(String c) {
	    this.city = c;
 }
}

public class Handson_Day3 {

	public static void main(String[] args) {
	Venue1 v=new Venue1();
	String str;
	String str1;
	
	Scanner sc= new Scanner(System.in);   
	System.out.print("Enter the Venue name");  
	str= sc.nextLine(); 
	v.setName(str);
	
	Scanner sc1= new Scanner(System.in);   
	System.out.print("Enter the City name");  
	str1= sc1.nextLine();
	v.setCity(str1);
	
	System.out.println("Venue details:\n Venue name:"+str);
	System.out.println(" City name:"+str1);
	System.out.println("Menu:\n 1.Update Venue name\n 2. Update city\n 3. All information is Correct");
	Scanner sc2=new Scanner(System.in);
	int m= sc2.nextInt();
	if(m==1) {
		Scanner sc3= new Scanner(System.in);   
		System.out.print("Enter the Venue name");  
		str= sc.nextLine(); 
		v.setName(str);
		}
	else if(m==2) {
		Scanner sc4= new Scanner(System.in);   
		System.out.print("Enter the City name");  
		str1= sc1.nextLine();
		v.setCity(str1);
	}
}
}
