
//Author: Luca Fulmor
//Program Description: Methods that take pre-made character arrays, 
//sets the data to 'a' for even and 'b' for odd positions, as well
//as organize them in ascending order using selection sort, 
//and a method that takes an int array and finds the factorial of the data
import java.lang.reflect.Array;

public class Homework {

	public static void main(String[] arg) {

		char[] a = { 'a', 'b', 'c', 'd', 'x', 'y', '1', '2', '3', '4' };
		char[] b = { 'p', 'q', '9', '8', '7', '6' };
		int[] c = { 6, 0, 1 };

		// Testing initializeArray
		printArray(a);
		initializeArray(a);
		printArray(a);

		// Testing selectionSort
		printArray(b);
		selectionSort(b);
		printArray(b);

		// Testing factorial
		System.out.println(factorial(5));
		System.out.println(factorial(c[0]));
		System.out.println(factorial(c[2]));

	}

	public static void initializeArray(char[] inputArray) {

		// replace characters of array with a in every even spot and b in every odd spot

		for (int i = 0; i < inputArray.length; i++) {
			// iterates over every position of the array, if the position itself is even
			// it sets the data in that position to 'a'
			if (i % 2 == 0) {
				Array.set(inputArray, i, 'a');
			} else if (i % 2 == 1) {
				// likewise if the position is odd it sets it to 'b'
				Array.set(inputArray, i, 'b');
				;
			}

		}
	}

	public static void printArray(char[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {

			// simply iterates over each position of the array
			// and prints the index in a for loop

			System.out.print(inputArray[i] + " ");
		}

	}

	public static void selectionSort(char[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			// iterating over each element
			int index = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				// going through them and finding the minimum element
				if (inputArray[j] < inputArray[index]) {

					index = j; // setting the minimum element to a stored variable
				}
			}
			// putting it at the beginning
			int smallerNumber = inputArray[index];
			inputArray[index] = inputArray[i];
			inputArray[i] = (char) smallerNumber;

			// repeats until its in ascending order
		}
	}

	public static int factorial(int n) {

		int i;
		int factorial = 1;
		// goes through each number smaller or equal to the entered parameter
		for (i = 1; i <= n; i++) {

			factorial = factorial * i;
			// stores the result in a factorial variable
			// that multiplies itself by the number each iteration
			// eventually ending after getting to a number
			// that is bigger than the entered one
		}
		// and thus returning the finished factorial
		return factorial;

	}

}