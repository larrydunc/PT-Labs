package Week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] num = new int[6];
		num[0] = 1;
		num[1] = 5;
		num[2] = 2;
		num[3] = 8;
		num[4] = 13;
		num[5] = 6;
			
		// 2. Print out the first element in the array
		
		System.out.println(num[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println(num[5]);
		
		// 4. Print out the element in the array at position 6, what happens?
		
		//System.out.println(num[6]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
		//at Week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:32)
		
		// 5. Print out the element in the array at position -1, what happens?
		
		//System.out.println(num[-1]);Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
		//at Week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:37)
			
		// 6. Write a traditional for loop that prints out each element in the array
	
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array

		for (int i : num) {
			System.out.println(i);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

		double sum = 0;
		for (int i : num) {
			sum += i;
			
		}
		System.out.println(sum);
		
			
		// 9. Create a new variable called average and assign the average value of the array to it

		double average = sum / num.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

		for ( int i : num) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		
		// 12. Calculate the sum of all the letters in the new array

		int sumOfLetters =0;
		for (String name : names) {
			sumOfLetters += name.length();
		}System.out.println(sumOfLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greet("Larry");
		greet("Raleigh");
		greet("Anna");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String greeting = greet2("Dave");
		System.out.println(greeting);
		
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		//The first method prints but does not return anything. The returns something that can then be accessed outside the method itself.
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println(isStringLonger("helllo", 5));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		String[] game = new String[4];
		game[0] = "rock";
		game[1] = "scissor";
		game[2] = "paper";
		game[3] = "death ray";
		
		System.out.println(isStringInArray(game, "rock")); 
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		
		int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 6;
		numbers[2] = 12;
		numbers[3] = 2;
		numbers[4] = 16;
		
		System.out.println(isLowestValue(numbers));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] costs = new double[4];
		costs[0] = 59.72;
		costs[1] = 372.56;
		costs[2] = 98.77;
		costs[3] = 1500.02;
		
		System.out.println(average(costs));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		int[] nameLengths = wordLength(game);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

		System.out.println(isEvenLargerThanOdd(names));
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		System.out.println(isPalindrome("madam"));
		
	}
	

	
	// Method 13:
	
	public static void greet(String name) {
		System.out.println("Greetings, " + name +".");
	}

	// Method 14:

	public static String greet2(String name) {
		String greeting = "Hello, " + name + ".";
		return greeting;
		
	}
	
	// Method 15:
	
	public static boolean isStringLonger (String word, int number) {
		if (word.length() > number) {
			return true;
		} else {
			return false;
		}
	}

	
	// Method 16:

	public static boolean isStringInArray (String[] list, String item) {
		for (String itemInArray : list) {
			if (itemInArray.equals(item)) {
				return true;
			}
		}return false;
	} 
	
	// Method 17:

	public static int isLowestValue (int[] values) {
		int lowest = values[0];
		for (int i : values) {
			if (i < lowest) {
				lowest = i;
			}
		}return lowest;
	}
	
	// Method 18:

	public static double average (double[] values) {
		double sum = 0;
		for (double i : values) {
			sum += i;
		} return sum / values.length;
	}
	
	// Method 19:
	
	public static int[] wordLength (String[] words) {
		int[] results = new int [words.length];
		for (int i = 0; i < words.length; i++) {
			results[i] = words[i].length();
			
		}
		return results;
	}
	
	// Method 20:
	
	public static boolean isEvenLargerThanOdd (String[] strings) {
		int evenLetters = 0;
		int oddLetters = 0;
		for (String string : strings) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
				
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	// Method 21:
	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}