import java.util.*;
public class A18RepEleitsRankInArray {
    
  public static void main(String args[]) {
    int n = 6;
    int arr[] = {20,15,26,2,98,6};
    for (int i = 0; i < n; i++) {
      Set < Integer > s = new HashSet < Integer > ();
      for (int j = 0; j < n; j++) {
        if (arr[j] < arr[i]) {
          s.add(arr[j]);
        }
      }
      int rank = s.size() + 1;
      System.out.print(rank + " ");
    }
  }
}


// Solution 1:Naive approach

// Intuition: Use two for loops and calculate a rank for each element.

// Approach:
// Iterative over the array using a for loop.
// Now use another for loop to check the number of elements having value less than the current element.
// We can use a set to get the number of unique elements having value less than the current element.
// Number of such unique elements + 1 is the rank of that element.

// Output: 4 3 5 1 6 2

// Time Complexity: O(N*N) as we are using double for loop.
// Space Complexity: O(N) as we are using set.