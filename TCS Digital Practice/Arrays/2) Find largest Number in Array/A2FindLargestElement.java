import java.util.*;

public class A2FindLargestElement{

    // First Approach
    public static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String [] args){

        int arr1[] = {4,2,6,1,8,9};
        System.out.println("The Largests Element is: " +sort(arr1));

        int arr2[] = {3,5,2,8,20,15};
        System.out.println("The Largest Element is: " +sort(arr2));
    }
}