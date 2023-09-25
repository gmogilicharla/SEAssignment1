/*
 * Fermat's Last Theorem
 * 		Near Miss
 * 
 * File name holds the program: Last Theorem.java
 * 
 * Name of Programmers: 
 * 
 * 		Gopikrishna Mogilicharla
 * 		Sindhu Sholapurkar
 * 
 * Email Addresses of Programers:
 * 
 * 		GopikrishnaMogilic@lewisu.edu
 * 		SindhuSholapurkar@lewisu.edu
 * 
 * Course: 
 * 		FA23-CPSC-60500-002
 * 
 * Libraries used:
 * 		import java.util.Scanner; For user input
 * 		import java.lang.Math; For taking Power of x and y
 * 
 * 
 * 
 * Date:
 * September 24, 2023
 * 
 * 
 * Description:
 * In this program, we wrote the piece of code to implement the Fermat's Last Theorem
 * Limitations:
 * 		k (upper limit) > = 10
 * 		n (power) > 2 and n < 3
 * 		10<=x<=k, 10<=y<=k  
 * 
 *1st step: Take user inputs for k and n
 *2nd step: compute the equation x^n + y^n
 *3rd step: take nth root of the result of above equation we will get z
 *4th step: take difference of x^n + y^n with z and z+1 ((x^n + y^n) - z), ((z+1) - (x^n + y^n)), smaller difference among these 2 will be called near miss
 *5th step: Finding the relative miss by applying a formula mentioned in Instructions
 *6th step: Compare the relative miss with smallest possible miss and here we will get Smallest possible miss.
 *
 *We used long data type to fix the problem of overflowing of results.
 * 
 */
import java.util.Scanner;
import java.lang.Math;


public class LastTheorem {
	
	//main function
	public static void main(String[] args) 
	{ 
		double smallestpossiblemiss = 99999999999999.99;
		
		int lower_limit = 10; //set the lower limit
		
		int k = 0;
	    int n = 0;
	    
	    //scanner object created. it will help in taking user inputs
	    Scanner userinput = new Scanner(System.in);
	    
	    // while loops are applied for the safety purpose, if any user will enter wrong input it will ask user gain to re enter the number
	    while(k<10) {
	    	System.out.println("Enter a number for upper limit (k) : ");
		    k = userinput.nextInt();
	    }
	    while(n<3 || n>11) {
	    	System.out.println("Enter a number for power (n) : ");
		    n = userinput.nextInt();
	    }
	    
	    //Here we have core loops in which complete execution of combinations of x and y from lower limit to upper limit is happening
	    for(long x = lower_limit; x<=k; x++) 
	    {
	    	for(long y = lower_limit; y<=k; y++)
	    	{	
	    		System.out.println("\n\n===========================================================================");
	        	System.out.print("==>   x = " + x +",  ");
	        	System.out.print("y = " + y +",  ");
	        	System.out.print("n = " + n);
	        	System.out.println();
	        	
	        	//lhs means left hand side, which is equal to x^n + y^n
	        	long lhs = (long)((Math.pow (x, n))+(Math.pow (y, n)));
	        	System.out.println("\nFirst Calculate x^n + y^n");
	        	System.out.println("==>   "+x+"^"+n+" + "+y+"^"+n+" = "+lhs);
	        
	        	//z value is calculated by taking nth root of the result of the above equation
	        	long z = (long) Math.pow (lhs, 1.0/n);
	        	System.out.println("\n==>   z = "+z);
	        	System.out.println();
	        
	        	//Here we are calculating differences with respect to z and z+1, smaller will be our near miss
	        	long nearmiss = (long)(lhs - Math.pow (z, n));
	        	if(((long)(Math.pow (z+1, n) - lhs))<nearmiss)
	        	{
	        		nearmiss = (long)(Math.pow (z+1, n) - lhs);
	        	}
	        	System.out.println("==>   Near Miss = "+nearmiss);
	        
	        	//here we are calculating the Relative miss by applying mentioned formula
	        	double rltvmiss = 100. * nearmiss / lhs;
	        	System.out.println("==>   Relative Miss = "+rltvmiss);
	        	
	        	//Here we are finding smallest possible miss 
	        	if(rltvmiss<smallestpossiblemiss)
	        	{
	        		smallestpossiblemiss = rltvmiss;
	        	}
	        	System.out.println("==>   Smallest Possible Miss = "+smallestpossiblemiss);
	        }
	    }
	    System.out.println("\n\n============  Execution Completed for all possible combinations of x and y  ============================");
	}
}


