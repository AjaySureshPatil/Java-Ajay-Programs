package Arrays;

import java.util.*;

public class linearSearch {
	public static int linearsearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    

		public static void main(String [] args) {

			System.out.print("Enter the size of Array :- ");
			Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int input[] = new int [size];


			//for loop for talking inputs
			for(int i=0; i<size; i++ ) {
				input[i] = s.nextInt();
			}

			// for loops for showing output
			for(int i=0; i<size; i++) {
				System.out.print(input[i] +" " );
			}

			int lsearch = linearsearch();
		}
	}
