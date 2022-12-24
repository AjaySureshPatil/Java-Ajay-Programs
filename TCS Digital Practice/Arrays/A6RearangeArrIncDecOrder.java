import java.util.*;

public class A6RearangeArrIncDecOrder {
    
    public static void main(String args[]){
        int arr[] = {8,7,1,6,5,9};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n/2; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=n-1; i>=n/2; i--){
            System.out.print(arr[i] + " ");
        }
    }
}

// Solution:

// Intuition: Sort the whole array. Then print the first half of the array to get the first half in the ascending order and then print the rest of the array in the reverse order.

// Approach:
// Sort the given array.
// Print the first half of the array i.e from 0 to (n/2 -1)th index,to print the first half in the ascending order.
// Then print elements from n-1 to n/2th index to get the second half in the descending order.

// Output: 1 5 6 9 8 7

// Time Complexity: O(nlogn) +O(n), O(nlogn) for sorting the array and O(n) for printing the elements. 

// Space Complexity: O(1)