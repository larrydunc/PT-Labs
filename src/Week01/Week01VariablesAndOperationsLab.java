//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 01 Lab");
		
		
		

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		int seatsAvailable = 61;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		
		double costOfGroceries = 262.89;

		// 3. Create a variable to hold a person's middle initial
		
		char middleIntial = 'R';
		
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
		
		boolean hotOutside = true;

		
		// 5. Create a variable to hold a customer's first name

		String firstName = "Larry";
		
		// 6. Create a variable to hold a street address
		
		String streetAddress ="1846 Bond Street";

		// 7. Print all variables to the console
		
		System.out.println("Seats Available:" + " " + seatsAvailable);
		System.out.println(costOfGroceries + " " + "is the price for groceries.");
		System.out.println("The person's middle intial is " + middleIntial);
		System.out.println("It is hot outside - " + hotOutside);
		System.out.println("The customer's first name is "+ firstName);
		System.out.println("They live at " + streetAddress);
		
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		
		seatsAvailable = seatsAvailable - 2;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		
		costOfGroceries = costOfGroceries + 2.15;


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		middleIntial = 'F';
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		
		hotOutside = false;


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		
		String lastName = "Mavromatis Duncan";
		String fullName = firstName + " " + middleIntial + " " + lastName;
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		System.out.println("Say hello to " + fullName + ". " + "They live at " + streetAddress + ".");
	}
}
