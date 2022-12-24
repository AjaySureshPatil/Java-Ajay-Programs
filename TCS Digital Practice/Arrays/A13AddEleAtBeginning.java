import java.util.*;
public class A13AddEleAtBeginning {

    static void insertatbegin(int [] arr, int n, int value){
        for(int i=n-1; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = value;
    }
    
    public static void main(String [] args){
        int n=8;
        int arr[] = {10,9,14,8,20,48,16,9,0};
        int value = 40;

        System.out.println("Before inserting the value at beginning: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        insertatbegin(arr, n, value);       
        System.out.println("After inserting the value at beginning: ");
        for(int i=0; i<=n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

       
    }
}

// Approach: The approach is very simple for all three insertions.

// Insertion at beginning 
// For inserting the element at the beginning we should first shift all elements of the array to left by 1 index and then insert an element at the 0th position.

// Output:

// Before inserting the value at beginning:
// 10 9 14 8 20 48 16 9
// After inserting the value at beginning:
// 40 10 9 14 8 20 48 16 9

// Time Complexity: θ(n), since n iterations are required to shift the array element to right by 1 position

// Space Complexity: O(1)