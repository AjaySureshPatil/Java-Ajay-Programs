import java.util.*;
public class A17MaxProdS3TwoTraversalArray {
    
	static int maxProductSubArray(int arr[]) {
	    int maxLeft = arr[0];
	    int maxRight = arr[0];
	    
	    boolean zeroPresent = false;
	    
	    int prod = 1;
	    
	    for(int i:arr) {
	        prod *= i;
	        if(i == 0) {
	            zeroPresent = true;
	            prod = 1;
	            continue;
	        }
	        maxLeft = Math.max(maxLeft,prod);
	    }
	    
	    prod = 1;
	    
	    for(int j=arr.length-1;j>=0;j--) {
	        prod *= arr[j];
	        if(arr[j] == 0) {
	            zeroPresent = true;
	            prod = 1;
	            continue;
	        }
	        maxRight = Math.max(maxRight,prod);
	    }
	    
	    if(zeroPresent) return Math.max(Math.max(maxLeft,maxRight),0);
	    return Math.max(maxLeft,maxRight);
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}

// Solution: Two Traversals

// Approach: Idea is to find the maximum product from both sides,i.e, once in a forwarding direction and another in the backward direction.

// Following are the steps for the approach:

// Iteration from left to right once to get maximum product for forward direction.
// If zero is encountered, we set all variables again to initial value.
// Iteration from right to left once again to get maximum product for backward direction.
// If zero is encountered, we set all variables again to zero to find a new subarray with maximum product.
// Once both iterations are completed, the overall result for the maximum product subarray of the given array is the maximum product obtained from both the iterations. 

// Output: The maximum product subarray: 20

// Time Complexity: O(N)
// Reason: O(N) iteration two times for computing maximum product.

// Space Complexity: O(1)
// Reason: No extra data structures are used for computation.