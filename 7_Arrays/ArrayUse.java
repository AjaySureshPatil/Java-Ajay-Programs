import java.util.*;
public class ArrayUse {

	/* Largest Number of Array function is called in the main Function and max value is return in the largestInArray(int input[]) */
	public static int largestInArray(int input[]){
		int max = Integer.MIN_VALUE;
		for(int i=0; i< input.length; i++) {
			if( input[i] > max) {
				max = input[i];

			}
		}
		return max;
	}

	/* This Function is used for the taking input from the user of largestInArray function and return input in takeInput()*/
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];

		for(int i=0; i<size; i++)  {
			input[i] = s.nextInt();
		}
		return input;
	}

	/* It is Printing the array which is has taken input from the user*/
	public static void print(int input[]) {
		int size = input.length;
		for(int i= 0; i<size; i++) {
			System.out.print(input[i] +" ");
		}          
		System.out.println();
	}

	/* This is the main Function where all the function are called here*/
	public static void main(String [] args) {

		int array[] = takeInput();
		print(array);
		int largest = largestInArray(array);
		System.out.println("Largest " + largest);
	}

}
