package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] arrg = new String[5];
		// 2. print the third element in the array
		System.out.println(arrg[2]);
		// 3. set the third element to a different value
		arrg[2] = "hi";
		// 4. print the third element again
		System.out.println(arrg[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int c = arrg.length - 1; c >= 0; c--) {
			System.out.println(arrg[c]);
		}

		// 6. make an array of 50 integers
		int[] numbers = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = numbers.length - 1; i >= 0; i--) {
			numbers[i] = rand.nextInt(100);
		}
		int s = 100;
		int l = 0;
		// 8. without printing the entire array, print only the smallest number in the
		// array
		for (int i = numbers.length - 1; i > 0; i--) {

			if (numbers[i] < s) {
				s = numbers[i];
			}
			System.out.println(numbers[i]);
		}
		// 9 print the entire array to see if step 8 was correct
		
		// 10. print the largest number in the array.
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] > l) {
				l = numbers[i];
			}
		}
		System.out.println(s);
		System.out.println(l);
	}
}
