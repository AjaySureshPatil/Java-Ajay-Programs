import java.util.*;
import java.util.Map.Entry;

public class A15FindAllNonRepEleS3MapArray {

    static void findNonRepeatingElement(int nums[]){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i:nums){
            if(hashMap.get(i) == null){
                hashMap.put(i,1);
            }
            else{
                hashMap.put(i, hashMap.get(i)+1);
            }
        }

        for(Entry<Integer,Integer> entry:hashMap.entrySet()) {
	        if(entry.getValue()==1)
	            System.out.print(entry.getKey()+" ");
	    }
    }
    public static void main(String [] args){
        int nums[] = {1, 2, -1, 1, 3, 1};
        System.out.println("Non-Repeating Numbers are: ");
        findNonRepeatingElement(nums);
    }
}


// Solution 3: Using Maps
// Approach: Following are the steps to the approach:

// Declare a hashmap for storing elements as the key and their number of occurrences as value..
// Iterate through the array and store elements and their occurrences in the map.
// Print elements whose occurrences were equals to 1.

// Output:
// Non-repeating numbers are:
// -1 2 3

// Time Complexity: O(N)
// Reason: Iterating once through the array once.

// Space Complexity: O(N)
// Reason: Map is used to insert elements.