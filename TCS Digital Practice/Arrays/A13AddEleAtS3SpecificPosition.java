import java.util.*;
public class A13AddEleAtS3SpecificPosition {

    static void insertatposition(int arr[], int n, int value, int pos){
        for(int i=n; i>= pos; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = value;
    }
    public static void main(String []args){
        int n=8;
        int pos=5;
        int arr[] = {10, 9, 14, 8, 20, 48, 16, 9, 0};
        int value=40;

        System.out.println("Before inserting the value at beginning:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        insertatposition(arr, n, value, pos);
        System.out.println("After inserting the value at beginning:");
        for(int i=0; i<=n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}


// Insertion at specific position
// For adding the element at a specific position, just shift array elements to right by one position, and after that add an element at the desired position.

// Output:

// Before inserting the value at beginning:
// 10 9 14 8 20 48 16 9
// After inserting the value at beginning:
// 10 9 14 8 40 20 48 16 9

// Time Complexity: O(n) since we need to shift the elements to right according to the position.

// Space Complexity: O(1)