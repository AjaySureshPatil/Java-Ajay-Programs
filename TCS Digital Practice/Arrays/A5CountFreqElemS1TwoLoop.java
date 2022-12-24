import java.util.*;

public class A5CountFreqElemS1TwoLoop {
    
    public static void main(String [] args){

        int arr[] ={10,25,10,15,25,10};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n){
        boolean visited[]= new boolean[n];

        for(int i=0; i<n; i++){
            // Skip this element if already processed
            if(visited[i] == true)
                continue;

            // Count frequency
            int count =1;
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}

// Solution 1: Use of two loops

// Intuition: We can simply use two loops, in which the first loop points to one element and the second loop finds that element in the remaining array. We will keep track of the occurrence of that same element by maintaining a count variable. We also have to maintain a visited array so that it will keep track of the duplicate elements that we already count.  

// Approach: 

// Make a visited array of type boolean.
// Use the first loop to point to an element of the array.
// Initialize the variable count to 1.
// Make that index true in the visited array.
// Run second loop, if we find the element then mark the visited index true and increase the count.
// If the visited index is already true then skip the other steps.