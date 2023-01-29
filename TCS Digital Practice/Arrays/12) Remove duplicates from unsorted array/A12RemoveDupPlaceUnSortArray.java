import java.util.*;
public class A12RemoveDupPlaceUnSortArray {

    static void duplicate(int arr[] , int n){
        int mark[] = new int [n];

        for(int i=0; i<n; i++){
            mark[i] = 1;
        }

        for(int i = 0; i < n; i++){
            if(mark[i] == 1)
            {
                for(int j = i+1; j<n; j++)
                {
                    if(arr[i] == arr[j]){
                        mark[j] = 0;
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            if(mark[i] == 1){
                System.out.print(arr[i] +" , ");
            }
        }
    }
    public static void main(String [] args){
        int n = 9;
        int arr[] = {4, 3, 9, 2, 4, 1, 10, 89, 34};

        duplicate(arr, n);
    }
}


// Solution
// Disclaimer: Don’t jump directly to the solution, try it out yourself first.

// Solution 1: Brute Force Approach

// Intuition:
// -> We can use an array to store non-duplicate and will return this array
// -> This array will be a boolean array. Corresponding to each index, true means element is Unique else it’s duplicate.

// Approach: 
// -> We will place true from i to  n-1 in the mark array
// -> We will use a nested loop. In the outer loop, we will iterate the given array. Let the current number be ‘x’. Now in the inner loop, we will iterate from the given ‘x’ to the end of the array.
// -> If we find ‘x’, we will mark x as false
// -> Same can be done throughout for each element of the array

// Output: 3,9,2,4,1,10,89,34,

// Time complexity :  O(n*n) + O(n) 
// -> O(n*n) for updating boolean array
// -> O(n) for the printing of non-duplicates

// Space complexity: O(n) + O(n) 
// -> O(n) marking array 
// -> O(n) answer array