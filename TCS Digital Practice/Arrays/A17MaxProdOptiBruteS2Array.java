import java.util.*;
public class A17MaxProdOptiBruteS2Array {
    static int maxProductSubArray(int arr[]) {
	    int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	            result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;     
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}

// Solution: Optimised Brute Force

// Approach: We can optimize the brute force by making 3 nested iterations to 2 nested iterations
// Following are the steps for the approach:

// Run a loop to find the start of the subarrays.
// Run another nested loop
// Multiply each element and store the maximum value of all the subarray.

// Output: The maximum product subarray: 20

// Time Complexity: O(N2)
// Reason: We are using two nested loops

// Space Complexity: O(1)
// Reason: No extra data structures are used for computation