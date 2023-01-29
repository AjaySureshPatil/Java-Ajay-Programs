import java.util.*;
public class A18RepEleS2itsRankInOptimizedArray {
    
  public static void main(String args[]) {
    int arr[] = {20,15,26,2,98,6};
    HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    int temp = 1;
    int n = arr.length;
    int brr[] = new int[n];
    for (int i = 0; i < n; i++) {
      brr[i] = arr[i];
    }
    Arrays.sort(brr);
    for (int i = 0; i < n; i++) {
      //if element is previously not store in the map
      if (mp.get(brr[i]) == null) {
        mp.put(brr[i], temp);
        temp++;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(mp.get(arr[i]) + " ");
    }
  }
}

// Solution 2: optimized

// Intuition: Sort the array and store the rank of the element in a map.

// Approach:
// Copy all the elements of the array in a dummy array.
// Sort the dummy array.
// Take a variable temp to calculate the rank of each element.Initially the value of temp is 1.
// Maintain a map to store the rank of each element.
// Now traverse through the dummy array,if element is previously not stored in map then store the value of element with the temp and then increament temp.
// Now traverse through the original array and print the rank of that corresponding element using map.

// Output: 4 3 5 1 6 2

// Time Complexity:O(n)+O(nlogn)+O(n). O(n) for copying the elements from the original to the dummy array, O(nlogn) for sorting the dummy array, and O(n) for printing the ranks.

// Space Complexity:O(N+N), for using dummy array and hashmap.