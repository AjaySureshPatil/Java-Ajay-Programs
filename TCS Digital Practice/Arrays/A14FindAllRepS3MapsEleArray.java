import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class A14FindAllRepS3MapsEleArray {
    
    static void findRepeatingElements(int arr[]){
        HashMap<Integer,Integer> elementCount = new HashMap<>();

        for(int i:arr){
            if(elementCount.get(i) == null){
                elementCount.put(i,1);
            } 
            else{
                elementCount.put(i, elementCount.get(i) + 1);
            }
        }

        System.out.print("The Repeating elements are: ");
        for(Entry<Integer, Integer> entry: elementCount.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey() +" ");
            }
        }
    }
    public static void main(String [] args){
        int arr[] = {1, 1, 2, 3, 4, 4, 5, 2};
        findRepeatingElements(arr);
    }
}


// Solution 3: Maps

// Approach: The process is as follows:-

// Store the elements in the hashmap with its frequency of occurrence.
// Iterate through the hashmap. If occurrence is more than 1, return the element.

// Output:
// The repeating elements are: 1 2 4

// Time Complexity: O(N)
// Reason: Entire array is traversed to insert them in the map.

// Space Complexity: O(N)
// Reason: Map is used to store the count of each element.