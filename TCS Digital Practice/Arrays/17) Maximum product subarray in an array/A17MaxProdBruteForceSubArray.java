import java.util.*;

public class A17MaxProdBruteForceSubArray {

    static int maxProductSubArray(int arr[]){
        int result = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int prod = 1;
                
                for(int k=i; k<=j; k++){
                    prod *= arr[k];
                    result = Math.max(result,prod);
                }
            }
            
        }
        return result;
    }
    public static void main(String [] args){
        int nums[] = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(nums);
        System.out.print("The maximum product subarray is: " +answer);
    }
}


// Solution: Brute Force

// Approach: Find all possible subarrays of the given array. Find the product of each subarray. Return the maximum of all them.

// Following are the steps for the approach:-

// Run a loop on the array to choose the start point for each subarray.
// Run a nested loop to get the end point for each subarray.
// Multiply elements present in the chosen range.

// Output: The maximum product subarray: 20

// Time Complexity: O(N3)
// Reason: We are using 3 nested loops for finding all possible subarrays and their product.

// Space Complexity: O(1)
// Reason: No extra data structure was used