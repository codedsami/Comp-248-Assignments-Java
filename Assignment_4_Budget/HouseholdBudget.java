//-------------------------------------------------
//Assignment 4
//Written by: Miskat Mahmud ID# 40250110
//Date: 09 December 2022
//For COMP 248 Section RA - Fall 2022
//---------------------------------------------------

import java.util.Scanner;

//class householdBudget
public class HouseholdBudget {

	//constructor with parameters
	private Fund fund =  new Fund();
	private Expense[] Expenses;
	
	
	Scanner In = new Scanner(System.in);
	

	//default constructor
	public HouseholdBudget() {
		fund.setLoonies(0);
		fund.setToonies(0);
		fund.setFiveBill(0);
		fund.setTenBill(0);
		fund.setTwentyBill(0);
		
		for (int i=0; i<Expenses.length; i++) {
			Expenses[i].setDueDay(0);
			Expenses[i].setDueMonth(0);
		}
		}
	
	
	
       //constructor
		public HouseholdBudget(Fund newfund, Expense[] newExpenses) {
			
		this.fund = newfund;
		this.Expenses = newExpenses;
		

		}
		
		//getfund for fund
		public Fund getFund() {
			return this.fund;
			}
		
		
		//equal method comparison of total fund
		public boolean isTotalFundEqual(HouseholdBudget other) {

		return this.fund.fundTotal() == other.fund.fundTotal();

		}

		
	

		
		//equal method compares total fund type
		public boolean isFundTypeEqual(HouseholdBudget other) { 
				return	other.fund.equals(this.getFund());
				
		}
		
		
		//equal method compares total fund value
		public double totalValueOfFundOfAHousehold() {
			return this.fund.fundTotal();
		}
		
		public int numberOfExpensesOfAHousehold() {
			return this.Expenses.length;
		}
		
		
		
		//method to add expense in case 6
		public int addExpense() {
			Scanner In = new Scanner(System.in);
			
			Expense[] tempExpense = new Expense[Expenses.length +1];
			
			String type = "";
			double amount = 0;
			String businessName = "";
			int dueDay = 0;
			int dueMonth = 0;
			
			
			System.out.println("Please enter the following information so that we may complete the expense-");
			
			System.out.print("--> Type of expense (Bill, Purchase, etc ...): ");
			 type =  In.nextLine();
			
			System.out.print("--> Amount of expense: ");
			 amount = 0.0 + In.nextDouble();
			 
			 String junk1 = In.nextLine();
			
			System.out.print("--> Name of Business: ");
			 businessName = In.next();
			
			System.out.print("Payment due day number and month (Separated by a space): ");
			 dueDay = In.nextInt();
			 dueMonth = In.nextInt();
			 
			 String junk2 = In.nextLine();
			
			Expense newExpense = new Expense(type, amount , businessName , dueDay , dueMonth);
			
			for (int i = 0; i < Expenses.length; i++) {
				tempExpense[i] = Expenses[i];
			}
			
			tempExpense[tempExpense.length-1] = newExpense;
			Expenses = tempExpense;
			
			System.out.print("You now have " + Expenses.length + " expense(s)");
			return Expenses.length;
			}
		
		

		//method to remove expense case 7
		public boolean removeExpense(int rmvExp) {
			Expense[] tempExpense = new Expense[Expenses.length - 1];
			
			int count = 0;
			for (int i = 0; i < Expenses.length; i++) {
				if (i != rmvExp) {
					tempExpense[count] = Expenses[i];
					count++;
				}
			}
			Expenses = tempExpense;
			return true;
			
		}
		
		
		//method to update due
		public void updateExpense(int day, int month, int rmvExp) {

			this.Expenses[rmvExp].setDueMonth(month);
			this.Expenses[rmvExp].setDueDay(day);
			

			}
		

		//method to add fund to fundtotal
		public double addFundHousehold(int loonies, int toonies, int fiveBill, int tenBill, int twentyBill) {

			this.fund.setLoonies(this.fund.getLoonies() + loonies);
			this.fund.setToonies(this.fund.getToonies() + toonies);
			this.fund.setFiveBill(this.fund.getFiveBill() + fiveBill);
			this.fund.setTenBill(this.fund.getTenBill() + tenBill);
			this.fund.setTwentyBill(this.fund.getTwentyBill() + twentyBill);

			return this.fund.fundTotal();

			}
			
		 // compares two object
		public boolean equals(HouseholdBudget others) {

			return this.isTotalFundEqual(others) && 
				this.Expenses.length == others.Expenses.length;
			

			}
		
		
		//displays the expenses and fund type for case 1 and case 2 
		public String toString() {

		String str = this.fund.toString();
		String Exp = "";


		if (this.numberOfExpensesOfAHousehold() == 0) {
			Exp = "No expenses" + "\n";
			

		}
		
		else {
			for (int i = 0; i < this.Expenses.length; i++) {
				Exp = Exp + this.Expenses[i].toString()+"\n";
			}
		
		}

		return (  str  + "\n"+Exp );

		}

		

	

		

	
        //method for the fund break down
		public String getFundBreakdown() {

		return this.fund.toString();

		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
