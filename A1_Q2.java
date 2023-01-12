    //---------------------------------------------------------------------------------------------------------------------------------------------
	// Assignment 1
	// Written by: Miskat Mahmud id#40250110
    // Date: 07 October 2022
	// For COMP 248 Section RA
	//----------------------------------------------------------------------------------------------------------------------------------------------


	/* This program lets the user input 2 temperature in Fahrenheit unit and Celsius unit respectively.
	   Then the program converts the value in fahrenheit to celsius, and converts the value in celsius
	   to fahrenheit. After that the program computes the 'x' value which is the remainder of the newly 
	   converted fahrenheit unit and celsius unit values. Here, fahrenheit unit is dividend and celsius 
	   unit is divisor. Also, the program computes 'y' value which is the exponentiation operation comprising
	   the values of the newly computed Celsius unit (as the exponent) and Fahrenheit unit (as the base). 
    */

// Console input
import java.util.Scanner;

public class A1_Q2 {

	public static void main(String[] args) {
		
		// Declaring the Scanner
		Scanner Keyboard = new Scanner(System.in);
		
		
		
		// Displaying the welcome message
		System.out.println("Welcome to the Simple Meteorological Program:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		
		// Asking the user to input two temperature
		System.out.print("Please enter the values for the 'Fahrenheit' and 'Celsius' scale, simultaneously: ");
		
		
		// Introducing the variables Fahrenheit and Celsius
		double Fahrenheit, Celsius;
		
		
		// User input
		Fahrenheit= Keyboard.nextDouble();
		Celsius = Keyboard.nextDouble();
		
		
		// Introduction of the 'double' variables CelsiusNew and FahrenheitNew which are going to the the new converted units
		double CelsiusNew, FahrenheitNew;
		
		
		// Converting the given Fahrenheit value to Celsius unit by using the given formula
		CelsiusNew = (10.0/18.0) * (Fahrenheit-32.0);
		
		
		// Converting the given Celsius value to Farhenheit unit by using the altered formula
		FahrenheitNew = (18.0*Celsius)/10.0 + 32.0;
		
		
		// Computing the remainder of new fahrenheit and new celsius value and rounding off
	    double x = Math.round(FahrenheitNew)% Math.round(CelsiusNew);
	    
	    
	    // Computing the exponential operation of FahrenheitNew^CelsiusNew
		double y = Math.pow(FahrenheitNew, CelsiusNew);
		
		
		// Displaying the output of the four results
		System.out.println("\nThe corresponding temperature in Celsius unit is: " + CelsiusNew); // Displays the newly converted Celsius unit
		System.out.println("The corresponding temperature in Fahrenheit unit is: " + FahrenheitNew); // Displays the newly converted Fahrenheit unit
		System.out.println("The corresponding value for x is: " + x); // Displays FahrenheitNew%CelsiusNew
		System.out.println("The corresponding value for y is: " + y + "\n"); // Displays FahrenheitNew^CelsiusNew
		
		
		// Displaying the closing message
		System.out.print("Thank you for using my bespoke Meterological program!");
		
		
		// Closing the scanner
		Keyboard.close();
		
		// End of the program
		

	}

}
