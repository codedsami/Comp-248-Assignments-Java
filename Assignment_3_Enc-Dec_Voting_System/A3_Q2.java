//-------------------------------------------------
//Assignment 3
//Written by: Miskat Mahmud ID# 40250110
//For COMP 248 Section RA - Fall 2022
//------------------------------------------------
/* This program is developed for an electronic voting system. It has the capabilities of adding candidates' name and Id, vote for an 
 * candidate by inputting their id, adding more candidates after voting and displaying the result while showing by showing the number 
 * of votes and position for each candidates.
 */
import java.util.Scanner;

public class A3_Q2 {

	public static void main(String[] args) {

		//printing welcome message
		System.out.println("Welcome to the Simple Electronic Voting System (SEVS):\n"
				+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println ("Please enter a String collection of electoral candidates below:");

		//declaring scanner
		Scanner In = new Scanner (System.in);

		//taking the first input of names and Id 
		String input =In.nextLine().toUpperCase().trim();

		//Split the input at semicolons and putting them in a 2D array
		String []Name = input.split(";");
		String [][] Name_and_ID = new String[Name.length][2];
		
		//splitting at ',' to separate Id and name
		for (int i =0; i<Name.length; i++) {
			Name_and_ID [i]= Name[i].trim().split(","); 
		}

		
		
		//creating the vote array and making it global so that votes are saved
		int [] votes = new int[Name_and_ID.length];
		
		

		//initializing vote count
		int voteForIndex=0;


		//print output after the first input by user
		System.out.println("*************************************\n"
				+ "| Code >> Description               |\n"
				+ "*************************************\n"
				+ "|  1   >> Display candidates        |\n"
				+ "|  2   >> Vote a candidate          |\n"
				+ "|  3   >> Add new candidate(s)      |\n"
				+ "|  4   >> Display results           |\n"
				+ "|  0   >> End SEVS                  |\n"
				+ "*************************************");

		//prompting to get a code in order to start the votes
		System.out.print("\nEnter a code, from the aforementioned, that corresponds to your task: ");


		//whole program is inside a while loop, so that the user can continue to use it until they enter 0
		while (true) {

			// code for different capabilities of the program	
			String  code = In.next().trim();


			switch (code)
			{
			case "1": case "01" ://this case is designed to show the candidate's info that was entered by the user
			{ 

				//output for code = 1
				System.out.printf("*************************************%n"+
						"| ID >> Candidate's name            |%n"
						+"*************************************%n");

				//printing the respective id and name following a specified formation
				
				for (int i =0; i<Name.length; i++) {
					Name_and_ID [i]= Name[i].trim().split(","); //splitting at ',' to separate Id and name
				String IdCandidates=Name_and_ID[i][0].trim();
				String NameCandidates=Name_and_ID[i][1].trim();
				System.out.printf("| %2s >> %-16s %12s%n",IdCandidates,NameCandidates,"|");
				}
					
						
				System.out.println("*************************************");


				//re-prompting the user for a code
				System.out.print("\nKindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
				break;
			}



			case "2": case "02": // this case is designed to count and save votes for candidates

			{ System.out.print("\nPlease enter the ID of the candidate you wish to vote for: "); //asking the user for id
			int votefor= In.nextInt();

			//saving the votes in an array for candidates that are added in case 3
			int newVotes[] = new int[Name.length];
			    for(int i = 0; i<votes.length; i++) {
				    newVotes[i] = votes[i];

			}
			

			//this part is for taking the votes that user votes for a candidate
			for (int i =0; i<Name.length; i++) {
				Name_and_ID [i]= Name[i].trim().split(",");
				int voteForStringToIndex = Integer.parseInt(Name_and_ID[i][0].trim());
				    if (votefor == (voteForStringToIndex)) {
				    	
					//printing to let the user know that their votes have been registered
					System.out.print("Your ballot has been successfully casted for: "+ Name_and_ID[i][1].trim()+" bearing Candidate: " + votefor);

					for (int m=0; m < Name_and_ID.length; m++) {
						int stringToInt = Integer.parseInt(Name_and_ID[m][0].trim());
						if (stringToInt == votefor) {
							voteForIndex = m;


			 break;


						}
					}
					//adding 1 to vote count every time user vote for a candidate
					newVotes[voteForIndex] += 1;

					//merging the votes of new candidates in case 3
					votes = newVotes;


					//re-prompting the user for another code	
					System.out.print("\n\nKindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");


				}

			}


			break;
			}//if code 2

			
			
			case "3": case "03": // this case is designed for adding new candidates to the system
			{
				{ 
					System.out.println("\nPlease enter a String collection of the NEW electoral candidates below: "); //prompting user

					In.nextLine();

					String new_input =In.nextLine().toUpperCase().trim();

					//merging with the original input
					input = input+";"+new_input ;

					//following the same algorithm as case 1
					Name = input.split(";");
					
					Name_and_ID = new String[Name.length][2];
					    for ( int i =0; i<Name.length; i++) {
						    Name_and_ID [i]= Name[i].trim().split(",");
					}
				}



				//letting the users know that the newly added candidates were registered
				System.out.println("Succesfully added a NEW set of electoral candidates to the Simple Electronic Voting System (SEVS).");

				//re-prompting the user for another code
				System.out.print("\nKindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");



			break;

			}//id code3



			
			case "4": case "04": //this case is designed to show the vote counts and positions for each candidates


				//formation of the output
			{ System.out.printf("******************************************************************%n"
					+ "| Position | Votes/Ballots | ID | Candidate's Name               |%n"
					+ "******************************************************************%n");}

			
		
		    
			//creating a new array to store ID and votes
			int [][] voteCount= new int [Name_and_ID.length][2]; //saving votes in a 2D array
			for (int i=0; i<Name_and_ID.length;i++){
				voteCount[i][0] = Integer.parseInt(Name_and_ID[i][0].trim()); //1st element is ID
				voteCount[i][1] = votes[i];      //2nd element is votes
				
			}
			



			//sorting votes based on numbers of votes for each candidate using the voteCount array
			int temp=0;
			int tempId=0;

			for (int i=0; i < voteCount.length; i++){

				for (int j=i+1; j < voteCount.length; j++ ) {

					if  (voteCount[i][1] < voteCount[j][1]) {

						temp = voteCount[i][1];               //swapping the votes
						voteCount[i][1]= voteCount[j][1];
						voteCount[j][1]= temp;

						tempId = voteCount [i][0];             //swapping ID
						voteCount[i][0] = voteCount [j][0];
						voteCount[j][0] = tempId;
					}
				}

			}


			//creating position array to demonstrate sorting from previous step
			int[] position = new int[voteCount.length];
			
			position[0] = 1; //starting at position 1 for every candidate
			
			//finding positions based on number of votes
			int count = 1;
			  for (int y=0; y<voteCount.length; y++) {
				if (y+1 == voteCount.length) {
					break;	
				}
				
				if ((voteCount[y][1] > voteCount[y+1][1]) ) {

					count = count+1;
					position[y+1] = count;	
				}
				else  {
					position[y+1] = count;
				}

			}




			//bringing back the candidates' name based on their ID
			String name = "";
			for (int i = 0;i<voteCount.length;i++)
			{

				for (int j=0; j<Name_and_ID.length;j++) {
					if (voteCount[i][0] == Integer.parseInt(Name_and_ID[j][0].trim())) {
						name = Name_and_ID[j][1];
						break;

					}
				}




				//printing the output for case 4
				System.out.printf("| %8s | %13s | %2s | %-16s  %14s%n",position[i],voteCount[i][1],voteCount[i][0],name.trim(),"|");

			}

			System.out.print("******************************************************************\n");


			//re-prompting the user for another code
			System.out.print("\nKindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");

			
			break;



			case "0": //this case is designed to end the code
			{
				//closing message
				System.out.print("Thank you for using our Simple Electronic Voting System (SEVS).");
				System.exit(0);


			}
			
			default : //this is when user inputs code>5 or code<0 or a string
				System.out.print("\nKindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");




				
				

			} //switch statement ends




		}//while loop ends




	}

}
