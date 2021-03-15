package com.handson;
import java.util.*;
//Problem 1
class Venue{
	void demo() {
	Scanner sc= new Scanner(System.in);   
	System.out.print("Enter Venue name");  
	String str= sc.nextLine();             
	Scanner sc1= new Scanner(System.in);   
	System.out.print("Enter City name");  
	String str1= sc1.nextLine(); 
	System.out.println("Venue Details: \n Venue name: "+str+"\n City name:"+str1);
}
}
//Problem 2
class Player{
	void demo1() {
		Scanner sc2= new Scanner(System.in);   
		System.out.print("Enter the player name");  
		String str2= sc2.nextLine();             
		Scanner sc3= new Scanner(System.in);   
		System.out.print("Enter the country name");  
		String str3= sc3.nextLine();
		Scanner sc4= new Scanner(System.in);   
		System.out.print("Enter the skill");  
		String str4= sc4.nextLine();
		System.out.println("Player Details:\n Player Name:"+str2+"\n Country Name:"+str3+"\n Skill"+str4);
	}
}
//problem 3
class Delivery{
	void displayDeliveryDetails() {
		Scanner sc5= new Scanner(System.in);   
		System.out.print("Enter the over");  
		long str5= sc5.nextLong();             
		Scanner sc6= new Scanner(System.in);   
		System.out.print("Enter the ball");  
		long str6= sc6.nextLong();
		Scanner sc7= new Scanner(System.in);   
		System.out.print("Enter the runs");  
		long str7= sc7.nextLong();             
		Scanner sc8= new Scanner(System.in);   
		System.out.print("Enter the batsman name");  
		String str8= sc8.nextLine();
		Scanner sc9= new Scanner(System.in);   
		System.out.print("Enter the bowler name");  
		String str9= sc9.nextLine();             
		Scanner sc10= new Scanner(System.in);   
		System.out.print("Enter the nonStriker name");  
		String str10= sc10.nextLine();
		System.out.println("Delivery Details\n Over:"+str5+"\n Ball:"+str6+"\n Ball:"+str6+"\n Run:"+str7+"\n Batsman:"+str8+"\n Bowler:"+str9+"\n NonStriker"+str10);  	
	}
}
class Player1{
	void demo3() {
		Scanner sc11= new Scanner(System.in);   
		System.out.print("Enter name,country,skill");  
		String str11= sc11.nextLine();
        String[] arrOfStr = str11.split(","); 
        String[] a=arrOfStr;
  
        for (int i=0;i<3;i++) {
            
	}
        System.out.println("Player Details:\n Player name:"+a[0]+"\n Country name:"+a[1]+"\n Skill:"+a[2]);
	}
}
public class HandsonDay3 {

	public static void main(String[] args) {
	Venue v=new Venue();
	v.demo();
	Player p=new Player();
	p.demo1();
	Delivery d=new Delivery();
	d.displayDeliveryDetails();
	Player1 p1=new Player1();
	p1.demo3();
}

}
