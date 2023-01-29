import java.util.*;

public class A11RemoveDupPlacS2TwoPointers {
    
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is: ");
        for(int i =0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr){
        int i =0;
        for(int j =1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i +1;
    }
}

// Solution 2: Two pointers
// Intuition: We can think of using two pointers ‘i’ and ‘j’, we move ‘j’ till we don’t get a number arr[j] which is different from arr[i]. As we got a unique number we will increase the i pointer and update its value by arr[j]. 

// Approach:
// Take a variable i as 0;
// Use a for loop by using a variable ‘j’ from 1 to length of the array.
// If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
//  After completion of the loop return i+1, i.e size of the array of unique elements.

//  Output:
//  The array after removing duplicate elements is 1 2 3
//  Time complexity: O(n)
//  Space Complexity: O(1)