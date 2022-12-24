import java.utl.*;
public class A21FindEquindexUseTotalSumArray {
    
  public static int findEquilibriumIdx(int nums[], int n) {
    int totalSum = 0;
    for (int i = 0; i < n; i++) {
      totalSum += nums[i];
    }
    int leftSum = 0, rightSum = totalSum;
    for (int i = 0; i < n; i++) {
      rightSum -= nums[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }
  public static void main(String[] args) {
    int n = 5;
    int nums[] = {2, 3, -1, 8, 4};
    int equilibriumidx = findEquilibriumIdx(nums, n);
    System.out.println(equilibriumidx);
 
  }
}

// Solution 2: Using Total Sum

// Calculate the sum = total sum of all the integers in the array.
// Keep leftSum = 0, rightSum = sum.
// leftSum = sum of all the integers to its left 
// rightSum = sum of all the integers to it’s right.
// At every index i rightSum would be rightSum excluding the current index value.now we will is Check if(leftSum == rightSum) If yes then return that index else keep moving forward.while moving forward it can be seen that we are considering that current index value to be on left so update the leftSum value. leftSum = leftSum + nums[i].
// If no such index is found return -1.

// Output: 3

// Time Complexity: O(N)

// Space Complexity: O(1)