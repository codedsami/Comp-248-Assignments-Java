    //------------------------------------------------------------------------------------------------------------------------------
	// Assignment 2
	// Written by: Miskat Mahmud ID# 40250110
    // Date: 24 October 2022
	// For COMP 248 Section RA - Fall 2022
	//------------------------------------------------------------------------------------------------------------------------------
    /* This is a program designed for a farm's distribution center index program. The program asks the user
     * to input a month and market in order to get the corresponding price index value.
    */

//Declaring package
import java.util.Scanner;
public class A2_Q2 {

	public static void main(String[] args) {
		
		// Welcome message
		System.out.println("Welcome to Farms Distribution Center Price Index Program:\n"+
	                       "=========================================================\n");
		
		// Declaring scanner
		Scanner Keyboard = new Scanner (System.in);
		
		
		// Asking the user for input (month market)
		System.out.print  ("Please enter a Month and Market, respectively: ");
		
		
		// User input and transforming it into lower case or the purpose of case-insensitive
		String Month = Keyboard.next().toLowerCase();
		String Market = Keyboard.next().toLowerCase();
		
		
		// Declaration of variables P,W,I
		double P; // different for every month-market combination
		final double W = 1.4672; // Constant for every month or market input
		double I; //price index
		

		//switch-case statements
		switch (Market)
		
	    {case "domestic": //cases for domestic market
			
		  switch (Month) {
			   
			case "january": //same pseudocode has been followed for every possible month-market combination
				 
				   P = 75.25;    // particular P value for January domestic input
				   I = (1.0/20.0)*(P*W);  //formula for calculating price index
				 
		           System.out.print("\nThe value of the Price Index, 'I', is: "); //output printing
		           System.out.printf("%.2f",I); //printing up to 2 digits after decimal
		           System.out.print("\nThank you for using Farms Distribution Center Price Index Program!"); // closing message		 
		    break;
				 
		    case "february":
				   
				   P = 62.86;
				   I = (1.0/20.0)*(P*W);
	   		    
				   System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		       System.out.printf("%.2f",I);
	   		       System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");				 
			break;
				 
			case "march":
				
				   P = 54.78;
				   I = (1.0/20.0)*(P*W);
	   		   
				   System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		       System.out.printf("%.2f",I);
	   		       System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
		    break;
				 
			case "april":
				  
				   P = 68.46;
				   I = (1.0/20.0)*(P*W);
	   		    
				   System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		       System.out.printf("%.2f",I);
	   		       System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
		    break;
				 
			case "may":
				   P = 35.89;
				   I = (1.0/20.0)*(P*W);
	   		     
				   System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		       System.out.printf("%.2f",I);
	   		       System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
		    break;
				 
			case "june":
				
				   P = 28.94;
				   I = (1.0/20.0)*(P*W);
	   		     
				   System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		       System.out.printf("%.2f",I);
	   		       System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
		    break;
				 
			case "july":
				
				   P = 42.50;
				   I = (1.0/20.0)*(P*W);
	   		     
				   System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		       System.out.printf("%.2f",I);
	   		       System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
		     break;
				 
		     case "august":
		    	 
				    P = 86.10;
				    I = (1.0/20.0)*(P*W);
	   		      
				    System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		        System.out.printf("%.2f",I);
	   		        System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
		     break;
				 
			 case "september":
				   
				    P = 69.70;
				    I = (1.0/20.0)*(P*W);
	   		     
				    System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		        System.out.printf("%.2f",I);
	   		        System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			 break;
				 
			 case "october":
				   
				    P = 85.40;
				    I = (1.0/20.0)*(P*W);
	   		     
				    System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		        System.out.printf("%.2f",I);
	   		        System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			 break;
				 
			 case "november":
				 
				    P = 75.90;
				    I = (1.0/20.0)*(P*W);
				 
	   		        System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		        System.out.printf("%.2f",I);
	   		        System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			 break;
				 
			 case "december":
				   
				    P = 76.80;
				    I = (1.0/20.0)*(P*W);
				    
	   		        System.out.print("\nThe value of the Price Index, 'I', is: ");
	   		        System.out.printf("%.2f",I);
	   		        System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			 break;
				 
			 default:
				   //in case of wrong month input
	    			 System.out.println("Error: An invalid value has been entered for the 'Month' variable. Please retry again!\n\n"+
		                      "The value of the Price Index, 'I', is: 0.00\n"+
			            	  "Thank you for using Farms Distribution Center Price Index Program!");				
			}
		  
			  break;
			     
		  case "international": //cases for international market
			 
		    switch (Month) {
			  
			  case "january": //same pseudocode has been followed for every possible month-market combination
				  
				     P = 24.75; // particular P value for January international input
					 I = (1.0/20.0)*(P*W); //formula for calculating price index
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: "); //output printing
		   		     System.out.printf("%.2f",I); //printing up to 2 digits after decimal
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!"); //closing message
			  break;
					 
			  case "february":
				  
					 P = 37.14;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  case "march":
				  
					 P = 45.22;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  case "april":
				  
					 P = 31.54;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  case "may":
				  
					 P = 64.11;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  case "june":
				  
					 P = 71.06;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
		      case "july":
		    	  
					 P = 57.50;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  case "august":
				  
					 P = 13.90;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
		      case "september":
		    	  
					 P = 30.30;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  case "october":
				  
					 P = 14.60;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
		      case "november":
		    	  
					 P = 24.10;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
		      case "december":
		    	  
					 P = 23.20;
					 I = (1.0/20.0)*(P*W);
					 
		   		     System.out.print("\nThe value of the Price Index, 'I', is: ");
		   		     System.out.printf("%.2f",I);
		   		     System.out.print("\nThank you for using Farms Distribution Center Price Index Program!");
			  break;
					 
			  default:
				     // in case of wrong month input
		    		 System.out.println("Error: An invalid value has been entered for the 'Month' variable. Please retry again!\n\n"+
			                            "The value of the Price Index, 'I', is: 0.00\n"+
				                       	"Thank you for using Farms Distribution Center Price Index Program!");
			  }
			  break;
			  
		      default:
			         // in case of wrong market input
		             System.out.println("Error: An invalid value has been entered for the 'Market' variable. Please retry again!\n\n"+
			                            "The value of the Price Index, 'I', is: 0.00\n"+
			          	                "Thank you for using Farms Distribution Center Price Index Program!");
			  	
			  	  
		}
			   
		 
		 // closing the scanner
		 Keyboard.close();
		 
		 
		 
		 
		 }
			 
		  
		
		
}
		
		

	


