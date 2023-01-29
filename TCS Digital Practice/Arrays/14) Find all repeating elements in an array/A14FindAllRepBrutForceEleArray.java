import java.util.*;
public class A14FindAllRepBrutForceEleArray {

    static void findRepeatingElements(int arr[]){
        int cnt =0;
        int [] dup = new int[arr.length];
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])    dup[cnt++] = arr[i];
            }
        }

        System.out.print("The repeating elements are: ");
        for(int i=0; i<cnt; i++){
            if(dup[i] != dup[i+1]) {
                System.out.print(dup[i] +" ");
            }
        }
    }
    public static void main(String [] args){
        int[] arr ={1, 1, 2, 3, 4, 4, 5, 2};
        findRepeatingElements(arr);
    }
}

// Solution 1: Brute Force

// Approach: The process is as follows:-

// Use an array to store all repeating elements. These elements are not distinct in the array. This is because for every pair of repeating elements it will store elements in the array.
// Start iterating the array. This will pick up an element for which we want to find its duplicates.
// Iterate another nested loop for finding all pairs. Pairs which have both elements are repeating elements and store them in the array created in the initial step.
// Start iterating in the array containing repeating elements. 
// If the current element is not equal to the next element in the array then we print the current element. This is to ensure all unique repeating elements.

// Output:

// The repeating elements are: 1 2 4

// Time Complexity: O(N2)+O(N)
// Reason: We are taking one element and searching its repeating element again in the array. Also, iterating through the dup array which contains repeating elements to find unique repeating elements.

// Space Complexity: O(N)
// Reason: We are using an array for storing all repeating elements.