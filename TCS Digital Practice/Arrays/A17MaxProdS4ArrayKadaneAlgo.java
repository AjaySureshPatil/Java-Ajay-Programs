import java.util.*;
public class A17MaxProdS4ArrayKadaneAlgo {
    
	static int maxProductSubArray(int arr[]) {
        int prod1 = arr[0],prod2 = arr[0],result = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1 = temp;
            
            result = Math.max(result,prod1);
        }
        
        return result;
        }
        public static void main(String[] args) {
            int nums[] = {1,2,-3,0,-4,-5};
            int answer = maxProductSubArray(nums);
            System.out.print("The maximum product subarray is: "+answer);
        }
}


// Solution: Kadane’s Algorithm

// Approach: The following approach is motivated by Kandane’s algorithm. To know Kadane’s Algorithm follow Kadane’s Algorithm

// The pick point for this problem is that we can get the maximum product from the product of two negative numbers too.

// Following are the steps for the approach:

// Initially store 0th index value in prod1, prod2 and result.
// Traverse the array from 1st index. 
// For each element, update prod1 and prod2.
// Prod1 is maximum of current element, product of current element and prod1, product of current element and prod2
// Prod2 is minimum of current element, product of current element and prod1, product of current element and prod2
// Return maximum of result and prod1

// Output: The maximum product subarray: 20

// Time Complexity: O(N)
// Reason: A single iteration is used.

// Space Complexity: O(1)
// Reason: No extra data structure is used for computation