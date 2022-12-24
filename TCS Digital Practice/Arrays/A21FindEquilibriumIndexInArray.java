import java.util.*;
public class A21FindEquilibriumIndexInArray {
    
  public static int findEquilibriumIdx(int nums[], int n) {
    int leftSum, rightSum;
 
    for (int i = 0; i < n; i++) {
      leftSum = 0;
      for (int j = 0; j < i; j++) {
        leftSum += nums[j];
      }
      rightSum = 0;
      for (int j = i + 1; j < n; j++) {
        rightSum += nums[j];
      }
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int n = 5;
    int nums[] = { 2, 3, -1, 8, 4};
    int equilibriumidx = findEquilibriumIdx(nums, n);
    System.out.println(equilibriumidx);
 
  }
}


// Solution 1: Using Two Loops(Brute Force)

// Consider two variables leftSum and rightSum initialized to zero.Now for every index, i calculate the leftSum till that index and rightSum till that index.

// At any point if (leftSum == rightSum) return that index i.

// If equilibrium index not found return -1.

// Output: 3

// Time Complexity: O(N^2)

// Space Complexity: O(1)