public class A23CheckArrayIsSubsetOfAnotherArray {
    

  static boolean isSubset(int arr1[], int m, int arr2[], int n) {
    if (m > n) return false;
    for (int i = 0; i < m; i++) {
      boolean present = false;
      for (int j = 0; j < n; j++) {
        if (arr2[j] == arr1[i]) {
          present = true;
          break;
        }
      }
      if (present == false) return false;
    }
    return true;
  }

  public static void main(String[] args) {

    int arr1[]={1,3,4,5,2};
	int arr2[]={2,4,3,1,7,5,15};

    int m = arr1.length;
    int n = arr2.length;

    boolean ans = isSubset(arr1, m, arr2, n);

    if (ans == true)
      System.out.print("arr1[] is a subset of arr2[]");
    else System.out.print("arr1[] is not a subset of arr2[]");

  }
}

// Solution 1: Using two loops

// We can use two nested loops. The outer loop iterates over the elements of arr1[] and the inner loop checks for that element in arr2[] by simple linear search.

// Output:
// arr1[] is a subset of arr2[]

// Time Complexity: O(M*N)
// Reason: The outer loop runs for M times and for every iteration inner loop runs N times.

// Space Complexity: O(1)