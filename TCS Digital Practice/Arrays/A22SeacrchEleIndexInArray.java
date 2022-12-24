public class A22SeacrchEleIndexInArray {
    public static void main(String args[]) {
        int arr[] = {6,7,9,5,3,10};
        int n = arr.length;
        int k = 10;
        int ans = -1;
        for (int i = 0; i < n; i++) {
          if (arr[i] == k) {
            ans = i;
            break;
          }
        }
        System.out.print("The element is present in "+ans+" index");
      }

}

// Solution 1: Linear Search

// Intuition: Simply traverse through the array and check if k matches the element of the array, if it matches return the index of that element.

// Approach:

// Traverse through the array.
// If arr[i] matches k then return i.

// Output: The element is present in 5 index

// Time Complexity: O(n)

// Space Complexity: O(1).