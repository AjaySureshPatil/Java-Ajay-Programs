import java.util.*;
public class A13AddEleAtS2Ending {

    static void insertatEnd(int arr[], int n, int value){
        arr[n] = value;
    }
    public static void main(String [] args){
        int n=8;
        int arr[]= {10, 9, 14, 8, 20, 48, 16, 9, 0};
        int value = 40;

        System.out.println("Before inserting the value at beginning: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        
        insertatEnd(arr, n, value);
        
        System.out.println("After inserting the value at beginning: ");
        for(int i=0; i<=n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}


// Insertion at Ending
// For adding the elements at the end, just add the element at the nth index.

// Output:

// Before inserting the value at beginning:
// 10 9 14 8 20 48 16 9
// After inserting the value at beginning:
// 10 9 14 8 20 48 16 9 40

// Time Complexity: θ(n), since n iterations are required to shiftθ(1) since we need to directly add an element at the end of the array

// Space Complexity: O(1)