import java.util.*;

public class A11RemoveDupPlaceSortArray {
    public static void main(String []args){
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate element is: ");
        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr){
        HashSet < Integer > set = new HashSet < > ();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set){
            arr[j++] = x;
        }
        return k;
    }
}


// Remove Duplicates in-place from Sorted Array
// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

// Note: Return k after placing the final result in the first k slots of the array.

// Output: The array after removing duplicate elements is 1 2 3

// Time complexity: O(n*log(n))+O(n)

// Space Complexity: O(n) 