import java.util.*;
public class A16FindAllSymmetricPairArrayOfPairs {
 
    public static void main(String [] args){
        int n = 5;
        int arr[][] = {{1,2}, {2,1}, {3,4}, {4,5}, {5,4}};
        System.out.println("The Symmetric pairs are: ");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++)
            {
                if(arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]){
                    System.out.print("(" +arr[i][1] +" " +arr[i][0] +")" +" ");
                    break;
                }
            }
        }
    }
}


// Solution 1: Brute force
// Intuition: For every pair check in the vector pair if the symmetric pair is present or not.

// Approach:
// First use a for loop and traverse through every pair in the vector.
// Then use another for loop and check if the symmetric pair of that pair is present in the rest of the vector or not.
// If the symmetric pair is present print the pair and break from the second for loop.so as to avoid repetitive printing of answers in case of duplicate pair.
// If the symmetric pair is not present,move to the next pair.

// Output:
// The Symmetric Pairs are: (2 1) (5 4)

// Time Complexity: O(N*N).
// Space Complexity: O(1).