import java.util.*;

public class A5CountFreqElemS2Map {
    
    public static void main(String args[]){
        int arr[] ={10,5,10,15,10,5};
        int n  = arr.length;
        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) +1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        // Traverse through map and print frequencies
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
    }
}


// Solution 2: Using Map

// Intuition: We can use a map of value and frequency pair, in which we can easily update the frequency of an element if it is already present in the map, if it is not present in the map then insert it in the map with frequency as 1. After completing all the iterations, print the value frequency pair. 

// Approach:

// Take a unordered_map/HashMap of <Integer , Integer> pair.
// Use a for loop to iterate the array.
// If the element is not present in the map then insert it with frequency 1, otherwise increase the existing frequency by 1.
// Print the value frequency pair.
