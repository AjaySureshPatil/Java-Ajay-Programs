import java.util.*;
public class A20RotateArrayByKEle {
    
  public static void Rotatetoright(int[] arr, int n, int k) {
    if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
    int[] temp = new int[k];
    for (int i = n - k; i < n; i++) {
      temp[i - n + k] = arr[i];
    }
    for (int i = n - k - 1; i >= 0; i--) {
      arr[i + k] = arr[i];
    }
    for (int i = 0; i < k; i++) {
      arr[i] = temp[i];
    }
  }
  public static void main(String args[]) {
    int n = 7;
    int[] arr = {1,2,3,4,5,6,7};
    int k = 2;
    Rotatetoright(arr, n, k);
    System.out.println("After Rotating the elements to right ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

// Solution :

// Approach 1: Using a temp array 

// For Rotating the Elements to right
// Step 1: Copy the last k elements into the temp array.

// Step 2: Shift n-k elements from the beginning by k position to the right

// Step 3: Copy the elements into the main array from the temp array.

// Output: After Rotating the elements to right: 6 7 1 2 3 4 5

// Time Complexity: O(n)

// Space Complexity: O(k) since k array element needs to be stored in temp array