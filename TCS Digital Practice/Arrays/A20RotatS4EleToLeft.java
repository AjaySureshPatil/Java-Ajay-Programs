import java.util.*;
public class A20RotatS4EleToLeft {
    
  // Function to Reverse the array
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to left
  public static void Rotateeletoleft(int[] arr, int n, int k) {
    // Reverse first k elements
    Reverse(arr, 0, k - 1);
    // Reverse last n-k elements
    Reverse(arr, k , n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    Rotateeletoleft(arr, n, k);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
    
}


// For Rotating Elements to left
// Step 1: Reverse the first k elements of the array
// Step 2: Reverse the last n-k elements of the array.
// Step 3: Reverse the whole array.
// For Eg , arr[]={1,2,3,4,5,6,7} , k=2

// Output: After Rotating the k elements to left 3 4 5 6 7 1 2

// Time Complexity – O(N) where N is the number of elements in an array

// Space Complexity – O(1) since no extra space is required

