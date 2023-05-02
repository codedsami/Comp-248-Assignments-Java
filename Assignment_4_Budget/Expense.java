//-------------------------------------------------
//Assignment 4
//Written by: Miskat Mahmud ID# 40250110
//Date: 09 December 2022
//For COMP 248 Section RA - Fall 2022
//---------------------------------------------------

//Class Expense
public class Expense {
	private String type;
	private String businessName;
	private double amount;
	private int dueMonth;
	private int dueDay;
	

	//default constructor
	Expense(){
	type = "";
	businessName = "";
	amount = 0;
	dueMonth = 0;
	dueDay = 0;
		
	}

	//constructor with 5 integers
    Expense (String t, double amt , String NB, int DD,   int DM){
	this.type = t;
	this.businessName = NB;
	this.amount = amt;
	
	if (DD >= 1 && DD <= 31 ) {
	    this.dueDay = DD;}
	else {
		this.dueDay =  0;
    }
	
	if (DM >= 1 && DM <= 12 ) {
		this.dueMonth = DM;}
		else {
			this.dueMonth =  0;
		}
		
    }
	

      //copy constructor
      Expense (Expense A){
    	  this.type = A.type;
    	  this.businessName = A.businessName;
    	  this.amount = A.amount;
    	  this.dueMonth = A.dueMonth;
    	  this.dueDay = A.dueDay;
      }
      
      
      // Accessor methods for all attributes
      public String getType(){
          return this.type;
      }
      
      public String getbusinessName(){
          return this.businessName;
      }
      
      public double getAmount(){
          return this.amount;
      }
      
      public int getDueMonth(){
          return this.dueMonth ;
      }
      
      public int getDueDay(){
          return this.dueDay;
      }
      
      
      
   // Mutator method for due_month
      public void setDueMonth(int month){
          if(month >= 1 && month <= 12){
              this.dueMonth = month;
          }
          else{
              this.dueMonth = 0;
          }
      }
      
   // Mutator method for due_day
      void setDueDay(int day){
          if (day >= 1 && day <= 31){
              this.dueDay = day;
          }
          else{
              this.dueDay = 0;
          }
      }
      
    

      //tostring method to get the expense type of household, also formats date and time
      public String toString(){
          String dueDayString;
          String dueMonthString;
          
          
          if(dueDay<10){
              dueDayString = "0" + dueDay;
          }
          else dueDayString = Integer.toString(dueDay);
          
          
          if(dueMonth<10){
              dueMonthString = "0" + dueMonth;
          }
          else dueMonthString = Integer.toString(dueMonth);
          
          
        
          return (type + " - $" + amount + " - " + businessName + " - " + dueDayString + "/" + dueMonthString + ".");
      }
      
      
      // equal method compares two objects
     public boolean equals(Expense other){
    	 return other == this;

      }
      
  }













