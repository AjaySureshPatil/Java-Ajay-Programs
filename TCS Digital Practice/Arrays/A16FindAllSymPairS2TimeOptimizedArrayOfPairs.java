import java.util.HashMap;
public class A16FindAllSymPairS2TimeOptimizedArrayOfPairs {
    
    public static void main(String args[]){
        int arr[][] = {{1,2}, {2,1}, {3,4}, {4,5}, {5,4}};

        HashMap<Integer, Integer> mp = new HashMap < Integer, Integer> ();
        System.out.println("The Symmetric Pairs are: ");
        for(int i=0; i<arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(mp.get(second) != null && mp.get(second) == first)
            {
                System.out.print("(" +first +" " +second +") ");
            }
            else{
                mp.put(first, second);
            }
        }
    }
}


// Solution: Time optimized

// Intuition: We will store the pairs in a hash map and then check if the symmetric pair exists or not.

// Approach:
// Store pairs in the hashmap.
// Let “first” be the first element of the pair and “second” be the second element of the pair.
// While iterating through the pairs we will check if {second,first} exists by using map.
// If {second,first} exists then print the pair,else store it in the map.

// Output: 
// The Symmetric Pairs are: (2 1) (5 4)

// Time Complexity: O(N).

// Space Complexity: O(N), for using a hashmap.