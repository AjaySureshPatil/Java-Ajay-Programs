import java.util.*;

public class A10FindMedianArray {

    private static void getMedian(int[] arr, int n){
        Arrays.sort(arr);
        if(n%2 == 0)
        {
            int ind1 = (n/2) -1;
            int ind2 = (n/2);
            System.out.print((double)(arr[ind1] + arr[ind2]) /2);
        }
        else{
            System.out.print(arr[(n/2)]);
        }
    }
    public static void main(String [] args){
        int [] arr = {4,7,1,2,5,6};
        int n = 6;
        System.out.print("The Median of the Array is: ");
        getMedian(arr, n);
    }
}



// What is a Median?
// Median is defined as the value which is present in the middle for a series of values. Note, in order to find the median of an array of integers, we must make sure they are sorted.

// Mathematically, Intuition : 
// The problem requires us to simply implement the mathematical formula programmatically. Hence, we need to make sure that the array is sorted and calculate the answer based on whether n is odd or even.

// Approach : 
// Sort the array in ascending order
// Check whether n is odd or even
// Calculate the median accordingly. Here’s a quick demonstration of the same

// Output:
// The median of the array is: 4.5

// Time Complexity: O(N*log N), Sorting of array

// Space Complexity: O(1)