//-------------------------------------------------
//Assignment 4
//Written by: Miskat Mahmud ID# 40250110
//Date: 09 December 2022
//For COMP 248 Section RA - Fall 2022
//---------------------------------------------------

//class fund 
public class Fund {
	//setting up the values
	 static int loonies =1;
	 static int toonies = 2;
     static int fiveBill = 5;
	 static int tenBill = 10;
	 static int twentyBill = 20;
	
	
	//introducing variables
	int numberOfLoonies;
	int numberOfToonies;
	int numberOfFiveBills;
	int numberOfTenBills;
	int numberOfTwentyBills;

	
	
	//default constructor
	public Fund() {
		 numberOfLoonies = 0;
		 numberOfToonies = 0;
		 numberOfFiveBills = 0;
		 numberOfTenBills = 0;
		 numberOfTwentyBills =0;
		
	}
	
	//Constructor with 5 integer parameters to set the number of each fund type the household owns
	public Fund (int One, int Two, int Five, int Ten, int Twenty){
		this.numberOfLoonies = One;
		this.numberOfToonies = Two;
		this.numberOfFiveBills = Five;
		this.numberOfTenBills = Ten;
		this.numberOfTwentyBills = Twenty;
	}
	
//	copy constructor
	 public Fund (Fund A){
		 this.numberOfLoonies =A.numberOfLoonies;
		 this.numberOfToonies = A.numberOfToonies;
		 this.numberOfFiveBills = A.numberOfFiveBills;
		 this.numberOfTenBills = A.numberOfTenBills;
		 this.numberOfTwentyBills =A.numberOfTwentyBills;
		 
      }


//accessor and mutator methods for all
	public int getLoonies() {
		return this.numberOfLoonies;
	}
	
	public void setLoonies(int OneBill) {
		this.numberOfLoonies = OneBill;
	}
	
	public int getToonies() {
		return this.numberOfToonies;
	}
	
	public void setToonies(int TwoBill) {
		this.numberOfToonies = TwoBill;
	}
	
	public int getFiveBill() {
		return this.numberOfFiveBills;
	}
	
	public void setFiveBill(int FiveBill) {
		this.numberOfFiveBills = FiveBill;
	}
	
	public int getTenBill() {
		return this.numberOfTenBills;
	}
	
	public void setTenBill(int TenBill) {
		this.numberOfTenBills = TenBill;
	}
	public int getTwentyBill() {
		return this.numberOfTwentyBills;
	}
	
	public void setTwentyBill(int TwentyBill) {
		this.numberOfTwentyBills = TwentyBill;
	}
	
	
	
	//add fund method allows to add fund to household
	public void addFund(int plusOne, int plusTwo, int plusFive, int plusTen, int plusTwenty){
		setLoonies(this.numberOfLoonies + plusOne);
		setToonies(this.numberOfToonies + plusTwo);
		setFiveBill(this.numberOfFiveBills + plusFive);
		setTenBill(this.numberOfTenBills + plusTen);
		setTwentyBill(this.numberOfTwentyBills + plusTwenty);
		
	}
	
	//this method returns total fund of a househols
	public double fundTotal() {
		return (loonies*numberOfLoonies) + (toonies*numberOfToonies) + (fiveBill*numberOfFiveBills) + 
			   (tenBill*numberOfTenBills) + (twentyBill*numberOfTwentyBills);
		
	}

	//displays the type of fund a household has
	 public String toString() {
		return "("  + this.numberOfLoonies  + " x $1) +" + " ("  + this.numberOfToonies + " x $2)"
		     + " + ("  + this.numberOfFiveBills + " x $5) + ("  + this.numberOfTenBills + " x $10) + "
		 	+  "("  + this.numberOfTwentyBills + " x $20)" ;
		
		
	}

	 // it compares two obejcts and retrun true if Fund type is equals
	public boolean equals(Fund other) {
		//if ()
		return (this.numberOfLoonies == other.numberOfLoonies &&
				this.numberOfToonies == other.numberOfToonies &&
				this.numberOfFiveBills == other.numberOfFiveBills &&
				this.numberOfTenBills == other.numberOfTenBills && 
				this.numberOfTwentyBills == other.numberOfTwentyBills);	
	}
}
