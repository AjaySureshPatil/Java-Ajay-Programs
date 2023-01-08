public class Delete {
    
// Find the Smallest Elemente using sort funtion
import java.util.*;
public class A1FindSmallestElement {
    
    public static void main(String [] args){
       
        int arr1[] ={2, 5, 1, 3, 0};
        System.out.println( "The Smallest Element in array is: " +sort(arr1));
    
        int arr2[] ={8, 10, 5, 7, 9};
        System.out.println("The Smallest Element in array is: " +sort(arr2));
    }
   
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
}

}
