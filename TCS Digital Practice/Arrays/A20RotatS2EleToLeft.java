import java.util.*;
public class A20RotatS2EleToLeft {
    
  public static void Rotatetoleft(int[] arr, int n, int k) {
    if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
    int[] temp = new int[k];
    for (int i = 0; i < k; i++) {
      temp[i] = arr[i];
    }
    for (int i = 0; i < n - k; i++) {
      arr[i] = arr[i + k];
    }
    for (int i = n - k; i < n; i++) {
      arr[i] = temp[i - n + k];
    }
  }
  public static void main(String args[]) {
    int n = 7;
    int[] arr = {1,2,3,4,5,6,7};
    int k = 2;
    Rotatetoleft(arr, n, k);
    System.out.println("After Rotating the elements to left ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}


// For Rotating the Elements to left
// Step 1: Copy the first k elements into the temp array.
// Step 2: Shift n-k elements from last by k position to the left
// Step 3: Copy the elements into the main array from the temp array.

// Output: After Rotating the elements to left 3 4 5 6 7 1 2

// Time Complexity: O(n)

// Space Complexity: O(k) since k array element needs to be stored in temp array