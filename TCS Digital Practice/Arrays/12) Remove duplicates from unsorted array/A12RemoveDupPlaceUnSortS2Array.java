import java.util.*;
public class A12RemoveDupPlaceUnSortS2Array {

    static void duplicate(int arr[] , int n){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!mp.containsKey(arr[i])){
                System.out.print(arr[i] + " ");
                mp.put(arr[i], 1);
            }
        }
    }
    public static void main(String [] args){
        int n=9;
        int arr[] = {4, 3, 9, 2, 4, 1, 10, 89, 34};

        duplicate(arr, n);
    }
}


// Solution 2:  Hashtable Method

// Intuition: 
// -> We can use Hashtable ( map in C++, HashMap in Java) to check duplicate elements of the array. 
// -> In Hashtable, insertion and searching in O(1) average.

// Approach:
// -> We will create a hash table of size n and store elements in it. Before inserting a new element in the hash table, if it already exists in the hash table.
// -> If the current element is not present we will print it else will move on. 

// Output: 4 3 9 2 1 10 89 34

// Time Complexity: O(n) + O(n) = O(n)
// Reason:Iteration in array , searching hash table

// Space Complexity : O(n) 
// Reason : Using hashing