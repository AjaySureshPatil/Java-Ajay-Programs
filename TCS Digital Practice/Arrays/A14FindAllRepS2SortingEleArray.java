import java.util.*;

public class A14FindAllRepS2SortingEleArray {

    static void findRepeatingElements(int arr[]){
        Arrays.sort(arr);

        System.out.print("The repeating elements are: ");
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i + 1]){
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void main(String [] args){
        int arr[] = {1, 1, 2, 3, 4, 4, 5, 2};
        findRepeatingElements(arr);
    }
}


// Solution 2: Sorting

// Approach:
// The process is as follows:-

// Sort the given array.
// Start iterating in the sorted array.
// If the current element and the next element are the same, return the repeating element.

// Output:

// The repeating elements are: 1 2 4

// Time Complexity: O(NlogN)+O(N)
// Reason: O(NlogN) for sorting. O(N) for iterating again in the array for finding a loop.

// Space Complexity: O(1)
// Reason: No extra spaces are used.