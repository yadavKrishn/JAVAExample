package com.handson;
import java.util.Scanner;
public class HandsonDay2 {

	public static void main(String[] args) {
		// Problem1 
		int x = 5;

	        while (x > 1) {

	            
	       	 // prints upto max datatype 2^31 and
	       	 // -2^31 - 2 ^ 31 = small(1 or 2) 
	       	 // x < 3 so it gives small x
	       	 x = x + 1;
	            if (x < 3) {

	                 System.out.println("small x");

	            }

	        }System.out.println();
	   
        

/// Problem 2
		 x = 1;

        while (x < 10) {

   if (x > 3) {

        System.out.println("big x");

   			}
   		x++;
        } 
        System.out.println();
       
        
        // Problem 3     
        x = 5;

        while (x  > 1) {

              x = x - 1;

              if (x < 3) {

            	  System.out.println("small x");

              }

}		System.out.println();
        // Problem 4
        x = 5;

        while (x  > 1) {

              x = x - 1;

              if (x < 3) {

         System.out.println("small x");

              }

        }
        System.out.println();  

        // Problem 4
        System.out.println(" Hello World! \n It's been nice knowing you.\n Goodbye World!");
        System.out.println();
        // Problem 5 Patterns
        for(int i1 = 1; i1 <= 4; i1++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
	

		int i1, j, row = 4;       
		for (i1=0; i1<row; i1++)   
		{       
		for (j=row-i1; j>1; j--)   
		{    
		System.out.print(" ");   
		}     
		for (j=0; j<=i1; j++ )   
		{   
		System.out.print("* ");   
		}   
		  
		System.out.println("\n");   
		}   
        for(i1=0;i1<=36;i1++) {
        	System.out.println(i1);
        }	

//Problem 7
   String name = "Rank";

   /* Now let's say hello */ // hello + name

   System.out.println("Hello "+name);

   System.out.println();

//Problem 8
   int i;   

   System.out.print("Hello ");       // Say Hello

   i = 0;                               // Initialize loop counter

      while (i <= args.length-1) {    // Test and Loop

    	  System.out.print(args[i] + " "); 

    	  i = i + 1;                     // Increment Loop Counter

    }
       
       System.out.println();             // Finish the line
        
// radius = 2.0 area = 3.14 * 2.0 * 2.0 = 12.56
//Problem 9    	                        
       double CM       = 2.54;
      

       Scanner in = new Scanner(System.in);
       
       /* Read centimeter input from user */
       System.out.print("Enter length in inch : ");
       double inch = in.nextDouble();
       

       /* Convert cm into inch, m and km */
       double cm = inch * CM;
       
       
       
       /* Print result on console */
       System.out.println(inch + " inch is equal to " + cm + " cm.");
  //Problem 10
       Scanner in1 = new Scanner(System.in);
       System.out.println("Enter the number of hours worked by an employee ");
       int hour = in1.nextInt();
       Scanner in2 = new Scanner(System.in);
       System.out.println("Enter their base pay rate ");
       double basePay  = in2.nextDouble();
       double payDue=basePay/hour;
       System.out.println("Pay due is" +payDue);

    

// Problem 11
       Integer i4 = 42;
       String s = (i<40)?"life":(i>50)?"universe":"everything";

       System.out.println(s);
}
}

