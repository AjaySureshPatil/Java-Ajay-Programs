public class A22SeacrchS2EleIndexInArray {
    
  public static void main(String args[]) {
    int arr[] = {6,7,9,5,3,10};
    int n = arr.length;
    int k = 10;
    int low = 0, high = n - 1;
    int ans = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > k) {
        high = mid - 1;
      } else if (arr[mid] < k) {
        low = mid + 1;
      } else {
        ans = mid;
        break;
      }
    }
    System.out.print("The element is present in "+ans+" index");
  }
}


// Solution 2: Optimized solution(provided the array is sorted)

// Intuition: If the array is already sorted we can find the index of the element in O(logn).

// Approach:
// Use the binary search algorithm.
// Maintain two variables low and high.Initially low is 0 and high is n-1.low to high is the range of the index where the elements can possibly lie.
// Take another variable mid.mid = (low+high)/2.
// If the element at mid is less than k,then the required index should obviously be between mid+1 to r,so make l=mid+1.
// If the element at mid is greater than k,then the required index should obviously be between l to mid-1,so make r=mid-1.
// If the element at mid is equal to k then return mid.
// This way we go on reducing the range.If at some point r>l then the element is not present in the array.

// Output: The element is present in 5 index

// Time Complexity: O(logn).

// Space Complexity: O(1)