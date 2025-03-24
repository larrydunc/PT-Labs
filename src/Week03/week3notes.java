package Week03;

import java.util.Arrays;

public class week3notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data structures
		//arrays
		
		/*help
		 * length 4
		 * index holds data; starts at 0
		 * length is n; highest index value is n -1
		 *
		 *int a;
		 *int b;
		 *int c;
		 *
		 *two or three variable no big deal
		 *
		 *but hundreds or thousands of variables is unmanagable
		 *
		 *symbol for array []
		*/
		//old school
		/*int [] x = new int[10]; //the size or length is 10
		x[0] = 234;
		x[1] = 46734;
		x[9] = 893274;
		
		System.out.println(x[1]);
		
		// not given an value int or double is 0. cannot mix and match data types
		
		String [] names = new String[3];
		names[0] = "javy";
		names[1] = "susie";
		
		System.out.println(names[2]);
		System.out.println(names[1].length());
		
		// unintialized values in array is null for objects
		 */
		//on the fly method
		
		/*String [] days = {"monday", "tuesday", "wednesday", "thursday", "friday"};
		
		System.out.println(days[2]);
		*/
		
		//let say 100 random numbers
		/*int [] nums = new int[100];
		for (int j = 0; j < nums.length; j++) {
			nums[j] = (int)(Math.random() * 1000 +1);	
			
		}
		//for-each loop
		for(int k: nums) {
			System.out.println(k); //only temporarily intializes index
			
		}*/
		
		/*int nums [] = new int [10];
		
		for (int j = 0; j < nums.length; j++) {
			nums[j] = (int)(Math.random() * 10 + 1);
		}
		
		Arrays.sort(nums);
		System.out.println(Arrays.binarySearch(nums, 5));
		
		for(int i: nums) {
			System.out.println(i);
		}
		
		nums = new int [25]; //can't store values. they reset.
		*/
		/*int a = 3;
		int b = 4;
	return (a!=b) ? a + b : 2 * (a+b);*/
	}

}
