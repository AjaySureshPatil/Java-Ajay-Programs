import java.util.*;

public class A15FindAllNonRepEleS2SortinngArray {

    static void findNonRepeatingElement(int nums[]){
        Arrays.sort(nums);

        if(nums[0] != nums[1]){
            System.out.print(nums[0] +" ");
        }

        for(int i=1; i<nums.length-1; i++){
            if(nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                System.out.print(nums[i] +" ");
            }
        }

        if(nums[nums.length-2] != nums[nums.length-1]){
            System.out.print(nums[nums.length-1]);
        }
    }
    public static void main(String [ ] args){
        int nums[] = {1, 2, -1, 1, 3, 1};
        System.out.println("Non-Repeating Numbers are: ");
        findNonRepeatingElement(nums);

    }
}


// Solution 2: Using Sorting

// Approach: Following are the steps to the approach:

// Sort the given array.
// Iterate from 1st position to (n-2)th position(0-index). 
// If the previous element, current element and next element are totally different. It is a non-repeating element. 
// For edge cases, i.e, 0th and (n-1)th element. If the 0th element is not equal to the 1st element, then the 0th element is non-repeating. Similarly if (n-1)th element is not equal to (n-2)th element, (n-1)th element is non-repeating element. 

// Output:
// Non-repeating numbers are:
// -1 2 3

// Time Complexity: O(NlogN)+O(N)
// Reason: O(NlogN) for sorting the array. O(N) for iteration.

// Space Complexity: O(1)
// Reason: No extra data structure was used.