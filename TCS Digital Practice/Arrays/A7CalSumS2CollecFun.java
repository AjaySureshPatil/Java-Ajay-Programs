import java.util.*;
import java.util.stream.IntStream;

public class A7CalSumS2CollecFun {
    
    public static void main(String [] args){

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int sum;

        sum = IntStream.of(arr).sum();
        System.out.print(" The Sum of Array is: " +sum);
    }
}

// Solution 2: Using collection in Java
// For Java: Instream sum() gives the sum of all the elements in the stream.
// Output:
// The sum of the elements of the array is 15
// Time Complexity: O(n).
// Space Complexity: O(1).