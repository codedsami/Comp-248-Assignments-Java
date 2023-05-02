    //------------------------------------------------------------------------------------------------------------------------------
	// Assignment 2
	// Written by: Miskat Mahmud ID# 40250110
    // Date: 24 October 2022
	// For COMP 248 Section RA - Fall 2022
	//------------------------------------------------------------------------------------------------------------------------------
    /* This program is made for a city's recycling system. First, it shows the codes for various recyclable materials. 
     * Then It asks the user to input a code according to their recyclable material. Then the program gives a solution 
     * to the user depending on the code that the user submit. 
    */

import java.util.Scanner;
public class A2_Q1 {

	public static void main(String[] args) {
		
		// Welcome message
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+
	                       "Welcome to My City Recycling Program:\n"+
	                       "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
	    
	    // Output of code for recyclable material
	    System.out.println("Item Recycling Code. |--> Item samples\n"+
	                       "------------------------------------\n"+
	    		           "1. |-->[Soft drink bottles/Trash cans]\n"+
	    		           "2. |-->[Shampoo bottles/Yogurt containers]\n"+
	    		           "3. |-->[Plastic Bags]\n"+
	    		           "4. |-->[Storage bins/Brooms/Brushes]\n"+
	    		           "5. |-->[Garden hoses/Piping]\n"+
	    		           "6. |-->[Carry-out food containers]\n"+
	    		           "7. |-->[Plastic straws/Chip bags/Coffee pods]\n"+
	    		           "8. |-->[Cell phone/Computer/Camera/Batteries]\n"+
	    		           "9. |-->[TV Remote/Flashlight batteries]\n"+
	    		           "10.|-->[Car batteries]\n"+
	    		           "11.|-->[Cereal/Snack Cardboard boxes]\n"+
	    		           "12.|-->[Newspaper/Books/Wallpaper]\n"+
	    		           "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
	   
	    // Asking user for input
	   System.out.print("Please enter the Recycling Code, from the above,"
	   		          + " that corresponds to the item you want to recycle: ");
	    		
	   // Declaring scanner
	   Scanner Keyboard = new Scanner (System.in);
	   
	   // Declaring the variable code
	   double Code = Keyboard.nextDouble();
	    
	   
	    //if-else statements 
	   
	    if (1<=Code && Code<=5) //implication of conditions and output print
	             System.out.println("This is a Recycled Plastics/Paper item.\n"+ 
                                    "Item required to be put in the blue household recycling bin.\n\n"+
	    				            "Thank you for saving the planet!"); //closing message
	    
	    else if (6<=Code && Code<=7)
	    		 System.out.println("This is a Non-Recycled Plastics item.\n"+
                                    "Item required to be put in the gray household garbage bin.\n\n"+
                                    "Thank you for saving the planet!");
	    
	    else if (8<=Code && Code<=10)
	    		 System.out.println("This is a Batteries item.\n"+
	                                "Item required to be taken to your local recycling depot or nearby store for disposal.\n\n"+
	                                "Thank you for saving the planet!");
	    
	    else if (11<=Code && Code<=12)
	    		 System.out.println("This is a Paper item.\n"+
                                    "Item required to be put in the blue household recycling bin.\n\n"+
                                    "Thank you for saving the planet!"); 
	    
	    else if (13<=Code && Code<=127)
	    		System.out.println("This item is N/A.\n"+
	    	                       "Item code not handled by the city recycling system.\n"+
	    	                       "Kindly check the nearby city(ies) for possible recycling availability.\n\n"+
	    	                       "Thank you for saving the planet!");	
	    
	    else if (-128<=Code && Code<=0)
	    		System.out.println("This is a Hazardous material.\n"+
	    		                   "Material required to be put in a hazardous dumpster diving.\n"+
	    		                   "Kindly check your area for the nearby one.\n\n"+
	    		                   "Thank you for saving the planet!");	
	    	
	    else 
	    		System.out.println("Error: Your recycling Code is not a valid integer between -128 to 127. Kindly retry again!");
	     
	    
	   	// Closing the scanner
	    Keyboard.close();
	    	   
	    }

	}


