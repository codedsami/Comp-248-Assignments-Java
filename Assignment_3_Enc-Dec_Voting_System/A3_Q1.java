//-------------------------------------------------
//Assignment 3
//Written by: Miskat Mahmud ID# 40250110
//For COMP 248 Section RA - Fall 2022
//------------------------------------------------
/* This program returns a ciphertext for a any given string. It is an Encryption-Decryption program.
 * The program receives a text then ensures there is no space character as the first and the last character. Then depending on the received text's length,
 * the program returns a ciphertext. 
*/



import java.util.Scanner;
public class A3_Q1 {

	public static void main(String[] args) {
		//declaring keyboard
		Scanner In = new Scanner (System.in);
		
		//printing welcome message
		System.out.println("Welcome to the 3D-Space Encryption-Decryption Program:\n"
				         + "+++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Please enter your plain text below:");
		
		//receiving the user input
		String text = In.nextLine();
		
		//trimming to get rid of space characters
		text=text.trim();
		
		//declaring the string ciphertext
		String ciphertext = "" ;
		
		//initializing variables
		int i,j;
		
		
		//implementation of conditions
		if (text.length()%2==0)  //in case of even number of characters
		{
		 for ( i =0, j = 1; j <= text.length(); i+=2,j+=2 ) //for loop to execute the output
			 ciphertext = ciphertext + text.charAt(j)+ text.charAt(i); //switching characters
		 
		 //printing the output
		 System.out.println("\nKindly find below your encrypted text output:");
		 System.out.println(ciphertext);
		}
		
		else if (text.length()%2!=0) //in case of odd number of characters
		{
		 for ( i =1, j = 2; j <= text.length(); i+=2,j+=2 )  //for loop to execute the output
			 ciphertext = ciphertext + text.charAt(j)+ text.charAt(i); //switching characters
		 
		 //printing the output
		 System.out.println("\nKindly find below your encrypted text output:");    
		 System.out.println(text.charAt(0) + ciphertext);	
		}
		
		//closing message
		System.out.print("\nThank you for your contribution to this Space Project.");
		
		//closing the scanner
		In.close();

	}

}
