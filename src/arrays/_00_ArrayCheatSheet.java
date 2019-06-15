package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		//1. make an array of 5 Strings
		String[] names = {"Bob","Joe","Ken","Lon","Kob"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Owo";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<names.length;i++) {
		     System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int [] names2 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
	 for (int i = 0; i < names2.length; i++) {
		 names2[i] = rand.nextInt(50);
		
	}
	 int smollest = 50;
	 for (int j = 0; j < names2.length; j++) {
		if (names2[j] < smollest) {
			smollest = names2[j];

		}	
		}
	 System.out.println("smallest" + " = "+ smollest);
	 for (int i = 0; i < names2.length; i++) {
		System.out.println(names2[i]);
	}
	 int lorgest = 0;
	 for (int i = 0; i < names2.length; i++) {
		if (names2[i] > lorgest) {
			lorgest = names2[i];
			
		}
	}
	 System.out.println("largest" + " = " + lorgest);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
	
		//10. print the largest number in the array.
	}
}
