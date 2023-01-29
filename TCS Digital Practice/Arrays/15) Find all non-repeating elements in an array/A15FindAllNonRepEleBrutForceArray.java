import java.util.*;

public class A15FindAllNonRepEleBrutForceArray {

    static void findNonRepeatingElement(int nums[]){
        boolean chk;
        for(int i=0; i<nums.length; i++){
            chk = false;
            
            for(int j=0; j<nums.length; j++){
                if(i !=j && nums[i] == nums[j]){
                    chk = true;
                    break;
                }
            }
            if(!chk){
                System.out.print(nums[i] +" ");
            }
        }

    }

    public static void main(String [] args){
        int nums[] = {1, 2, -1, 1, 3, 1};
        System.out.println("Non-Repeating Numbers are: ");
        findNonRepeatingElement(nums);
    }
}


// Solution 1: Brute-Force

// Approach: Following are the steps to the approach:

// Start iterating the array to pick an element.
// Use another nested loop to check if picked elements repeat in the array.
// If the inside nested loop reaches the end of the array for a picked element, it indicates it is a non-repeating element and we print it.
// If not, we move to pick another element.

// Output:
// Non-repeating numbers are:
// 2 -1 3

// Time Complexity: O(N2)
// Reason: We are using two loops nested.

// Space Complexity: O(1)
// Reason: No extra data structure is used for computation.