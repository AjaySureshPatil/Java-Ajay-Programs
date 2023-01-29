import java.util.*;

public class A9AvgAllElemArray {
    
    public static void main(String [] args){
        int n= 5;
        int arr[] = {1,2,3,4,5};
        // using double as average can be in decimal.

        double sum =0;
        for(int i=0; i<n; i++){
            sum +=(double) arr[i];
        }
        double average = sum/n;
        System.out.println("The average is: " +average);
    }
}


// Solution Approach: Average of all the elements in the array

// Using for loop traverse through the array and while traversing  maintain  a variable for storing sum of the elements in the array.
// After completing the traversal simply divide the sum by no. of elements in the array.

// Output:
// The average is 3.0
// Time Complexity: O(n) As we are traversing the array once.
// Space Complexity: O(1).