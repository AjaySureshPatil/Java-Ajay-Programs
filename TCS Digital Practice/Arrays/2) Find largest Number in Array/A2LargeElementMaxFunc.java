import java.util.*;

public class A2LargeElementMaxFunc{

    static int max(int arr[]){
        int max = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String [] args){

        int arr1[] = {4,2,6,1,8};
        System.out.println("The Largest Element is: " +max(arr1));

        int arr2[] = {2,8,4,10,3};
        System.out.println("The Largest Element is: " +max(arr2));
    }
}