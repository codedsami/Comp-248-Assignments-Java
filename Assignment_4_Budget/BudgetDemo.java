//-------------------------------------------------
//Assignment 4
//Written by: Miskat Mahmud ID# 40250110
//Date: 09 December 2022
//For COMP 248 Section RA - Fall 2022
//---------------------------------------------------
/* This program is developed for a household budget. It lets the user see funds, expenses and budget of a household. 
 * The user can also modify many components. Such as adding funds, modifying expenses, modifying budgets. 
 * It has 3 class files and 1 driver file. 
 */



import java.util.Scanner;
public class BudgetDemo {

	
	//main method
	public static void main(String[] args) {
		Scanner In = new Scanner (System.in);
		
		//array for houses
		HouseholdBudget[] array_for_Houses = new HouseholdBudget[5];
		
		
		//hardcode for 5 household
		//household #0
		Fund f0 = new Fund (0,1,0,2,1);
		Expense e0 = new Expense("Purchase" , 85.5 , "IGA",25,11);
		Expense e01 = new Expense("Bill",122.75,"Videotron",02,12);
		
		Expense[] expenses0 = {e0,e01};
		HouseholdBudget hhb0 = new HouseholdBudget(f0 , expenses0);
		
		
		//household #1
		Fund f1 = new Fund (0,1,0,2,1);
		Expense e1 = new Expense("Purchase" , 85.5 , "IGA",25,11);
		Expense e11 = new Expense("Bill",16.2,"Costco",23,11);
		
		Expense[] expenses1 = {e1,e11};
		HouseholdBudget hhb1 = new HouseholdBudget(f1 , expenses1);
		
		//household #2
		Fund f2 = new Fund (2,0,2,1,1);
		Expense e2 = new Expense("Purchase" , 50.75 , "Pharmaprix",1,12);
		Expense e21 = new Expense("Purchase ",16.2,"TheBay",16,12);
		Expense e22 = new Expense("Bill",65.85,"Fido",5,1 );
		
		Expense[] expenses2 = {e2,e21,e22};
		HouseholdBudget hhb2 = new HouseholdBudget(f2 , expenses2);
		
		//household #3
		Fund f3 = new Fund (2,1,2,1,5);
		
		Expense[] expenses3 = {};
		HouseholdBudget hhb3 = new HouseholdBudget(f3 , expenses3);
		
		//household #4
		Fund f4 = new Fund (2,1,2,1,5);
		
		Expense[] expenses4 = {};
		HouseholdBudget hhb4 = new HouseholdBudget(f4 , expenses4);
		
		
		
		//assigning array to each household
		array_for_Houses[0] = hhb0;
		array_for_Houses[1] = hhb1;
		array_for_Houses[2] = hhb2;
		array_for_Houses[3] = hhb3;
		array_for_Houses[4] = hhb4;
		
		
		
		
	      
		
		//welcome meesage
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+
	                       "Welcome to COMP248 Geek's HouseholdBudget_2022 Application\n"+
		                   "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		//repetitive instruction in a loop
		while (true) {
		System.out.println("What would you like to do?\n"
				  +"  1. See the possessions of all householdBudgets\n"
				  +"  2. See the possessions of one householdBudget\n"
				  +"  3. List householdBudgets with same total amount of fund\n"
				  +"  4. List householdBudgets with same total fund denomination(s)\n"
				  +"  5. List householdBudgets with same total amount of fund and same number of expenses\n"
				  +"  6. Add an expense to an existing householdBudget\n"
				  +"  7. Remove an existing expense from a householdBudget\n"
				  +"  8. Update the payment due date of an existing expense\n"
				  +"  9. Add fund to a householdBudget\n"
				  +"  0. To quit\n");

        System.out.print("Please enter your choice and press <Enter> :");
		
	
		int code = In.nextInt();
		
		//verifies valid code
	    if (code < 0 || code > 10) {
	    	System.out.println("Sorry that is not a valid choice. Try again.\n");
	    	continue;
	    }
		
		switch (code) {
		//case 0 quits the program
		case 0:
        	System.out.print("Thank you for using COMP248 Geek's HouseholdBudget application!");
        	System.exit(0);
        	break;
			
		
		
		
		//case 1 displays fund and expense breakdown
		case 1:
			System.out.println("Content of each HouseholdBudget:\n"+
		                       "---------------------");
			for (int i = 0 ; i < array_for_Houses.length; i++) {
				System.out.println("HouseholdBudget #" + i);
				System.out.println(array_for_Houses[i]);
			}
		
			break;
			
		
		//case 2 displays same as case 1 but only for 1 house
        case 2:
        	System.out.print("Which HouseholdBudget you want to see the possessions of? (Enter number 0 to 4): ");
        	int householdcase2 = In.nextInt();
        	while (householdcase2 < 0 || householdcase2 > 4) {
        		
            	System.out.println("Sorry but there is no HouseholdBudget number " + householdcase2);
            	System.out.print("--> Try again: (Enter number 0 to 4): ");
           		householdcase2 = In.nextInt();
     		}	
       			System.out.println(array_for_Houses[householdcase2]);
       			
        	continue;
        	
        	
        	

			
        
        //case 3 displays houses with same total fund
        case 3:
        	System.out.println("List of HouseholdBudgets with same total fund:\n");
        	
        	for (int i=0; i<array_for_Houses.length;i++) {
        		for (int j = i ; j<array_for_Houses.length;j++) {
        			if (i==j) 
        			{
        			continue;
        			}
        	if (array_for_Houses[i].isTotalFundEqual(array_for_Houses[j])) {
        	System.out.println("        HouseholdBudgets "+ i + " and " + j + " both have " 
        	                   + array_for_Houses[i].totalValueOfFundOfAHousehold());	
        			}
        		}
        	}
        	System.out.println();
			continue;
		
			
			
        //case 4 displays household with same fund
        case 4:
        	System.out.println("List of HouseholdBudgets with same Fund:\n");
        	for (int i=0; i<array_for_Houses.length;i++) {
        		for (int j = i ; j<array_for_Houses.length;j++) {
        			if (i==j) 
        			{
        			continue;
        			}
        	if (array_for_Houses[i].isFundTypeEqual(array_for_Houses[j])) {
        	System.out.println("        HouseholdBudgets "+ i + " and " + j + " both have " 
        	                   + array_for_Houses[i].getFundBreakdown());	
        			}
        		}
        	}
        	System.out.println();
		continue;	
		
		
		
		//case 5 displays same amount and fund type
        case 5:
        	System.out.println("List of HouseholdBudgets with same amount of money and same number of expenses:\n");
        	for (int i=0; i<array_for_Houses.length;i++) {
        		for (int j = i ; j<array_for_Houses.length;j++) {
        			if (i==j) 
        			{
        			continue;
        			}
        	if (array_for_Houses[i].equals(array_for_Houses[j])) {
        	System.out.println("        HouseholdBudgets "+ i + " and " + j );	
        			}
        		}
        	}
        	System.out.println();
        	
		continue;
		
		
		//case 6 lets the user add expense
        case 6:
        	System.out.println("Which HouseholdBudget do you want to add an Expense to? (Enter number 0 to 4): ");
		int householdcase6 = In.nextInt();
		
		
		while (householdcase6 < 0 || householdcase6 > 4) {
		System.out.println("Sorry but there is no householdBudget number: " + householdcase6);
		System.out.println("Try again: (Enter number 0 to 4): ");
		householdcase6 = In.nextInt();
		}
		System.out.println(array_for_Houses[householdcase6].addExpense());
		continue;
		
		//case 7 lets the user remove expense
        case 7:
        	System.out.print("Which HouseholdBudget do you want to remove an expense from? (Enter number 0 to 4) ");
        	int householdcase7 = In.nextInt();
        	while (householdcase7 < 0 || householdcase7 > 4 ) {
        		System.out.print("Sorry but there is no householdBudget number: " + householdcase7);
        		System.out.print("Try again: (Enter number 0 to 4): ");
        		householdcase7 = In.nextInt();
        	}
        		//if (code7 == 0) {
        	if (array_for_Houses[householdcase7].numberOfExpensesOfAHousehold() != 0) {
        		System.out.print("(Enter number 0 to " + (array_for_Houses[householdcase7].numberOfExpensesOfAHousehold()-1) + "): ");
        		int householdExpense = In.nextInt();
            if (array_for_Houses[householdcase7].removeExpense(householdExpense) == true) {
            	System.out.println("Exepnse was removed successfully");
            }
        	}
        	else {
        		System.out.println("Sorry, that householdBudget has no expenses");
        	}
        	continue;	
        			
        			
        		
        	
        	
			
		
		//case 8 lets the user update due date
        
        case 8:
        	System.out.print("Which HouseholdBudget do you want to update an expense from? (Enter number 0 to 4): ");
        	int householdcase8 = In.nextInt();
        	while (householdcase8 < 0 || householdcase8 > 4 ) {
        		System.out.print("Sorry but there is no householdBudget number: " + householdcase8);
        		System.out.print("Try again: (Enter number 0 to 4): ");
        		householdcase8 = In.nextInt();
        	}
        	System.out.println("Which expense do you want to update? (Enter number 0 to " + (array_for_Houses[householdcase8].numberOfExpensesOfAHousehold()-1) + ")");
			int householdExpense = In.nextInt();
			while (householdExpense > array_for_Houses[householdcase8].numberOfExpensesOfAHousehold() || householdExpense < 0) {
			System.out.println("Sorry, there is no expense number " + householdExpense);
			System.out.println(" --> Try again:" + "\n" + "(Enter number 0 to " + (array_for_Houses[householdcase8].numberOfExpensesOfAHousehold()-1) + ")");
			householdExpense = In.nextInt();
			}
			System.out.print(" --> Enter new payment due day number and month (separate by a space): ");
			int newdueDay = In.nextInt();
			int newdueMonth = In.nextInt();
			array_for_Houses[householdcase8].updateExpense(newdueDay, newdueMonth, householdExpense);
			System.out.println("Due Date updated.");
			continue;
        	
			
		
		//case 9 lets the user add fund to a house
        case 9:
        	System.out.print("Which HouseholdBudget do you want to add Fund to? (Enter number 0 to 4): ");
			int householdcase9 = In.nextInt();
			// ensure valid household is chosen
			while (householdcase9 < 0 || householdcase9 > 4) {
			System.out.println("Sorry, but there is no householdBudget number: " + householdcase9);
			System.out.println("Try again: (Enter number 0 to 4): ");
			householdcase9 = In.nextInt();
			}
			System.out.println("How many loonies, toonies, $5, $10 and $20 bill do you want to add?");
			System.out.println("Enter 5 numbers separated by a space: ");
			int addOne = In.nextInt();
			int addTwo = In.nextInt();
			int addFive = In.nextInt();
			int addTen = In.nextInt();
			int addTwenty = In.nextInt();
			
			double newfundTotal = array_for_Houses[householdcase9].addFundHousehold(addOne, addTwo, addFive, addTen, addTwenty);
			System.out.println("You now have: " + newfundTotal);
			continue;
			
		
		
        
        
        
		
		
		
		
		
		
		
		}//switch statement
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	In.close();
		
		
		
		}//while statement
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main method

}//end of class
