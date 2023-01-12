    //------------------------------------------------------------------------------------------------------------------------------
	// Assignment 1
	// Written by: Miskat Mahmud ID# 40250110
    // Date: 07 October 2022
	// For COMP 248 Section RA
	//------------------------------------------------------------------------------------------------------------------------------


	/* This program lets the user input 2 integers p and q ranging between 50 to 127. 
     Then the program uses the given inputs to report a point location of a given stationary astronomical object 
     in space with respect to the x-axis, y-axis and z-axis. At the end it displays the coordinates of the first astronomical 
     object and the nearest astronomical object in (x,y,z) form. 
    */ 

// Console input  
import java.util.Scanner;

public class A1_Q1 {

	public static void main(String[] args) {
		
	    // Declaring the Scanner
		Scanner Keyboard = new Scanner(System.in);
		
		// Displaying the welcome message 
		System.out.println("Welcome to the Simple 3D-Space Program:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		// Asking the user for the input
		System.out.print("Please enter the values for 'p' and 'q', simultaneously: ");
		
	    // Setting up the range for integer p,q by using 'byte' 
		byte p = Keyboard.nextByte();
		byte q = Keyboard.nextByte();
		
		// Values of the given constants
		double pi = 22.0 / 7.0;
		double e = 2.718281828;
		
		// Introducing the variables x, y, z as 'double' for the first object coordinates
		double x, y, z;
		
		// Computation of the coordinates of the first object
		x = p * pi / e + 50 ;
		y = p * pi / e + 50 * 12 ;
		z = q + y ;
		
		// Displaying the output of the coordinates' result
		System.out.println("\nThe Cartesian coordinates of the first object is: \n(" +x +", " + y + ", " + z +")");
		
		// Introducing of the variables xn, yn ,zn for the nearest object coordinates
		double xn,yn,zn;
		
		// Computation of the coordinates for the nearest object
		xn = p * pi / e + 50 ;
		yn = xn * 12 ;
		zn = q + yn * 6 ;
		
		// Displaying the output of the coordinates' result
		System.out.println("The Cartesian coordinates of the nearest object is: \n(" + xn +", " + yn + ", " + zn +")\n");
		
		// Closing message
		System.out.println("Thank you for your contribution to this Space Project.");
		
		//Closing the scanner
		Keyboard.close();
		
		// End of the program
		
		
	}

	

}

