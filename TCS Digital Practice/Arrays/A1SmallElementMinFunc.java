import java.util.*;
public class A1SmallElementMinFunc {
    public static void main(String [] args){

        int arr1[] ={2, 1, 5, 3, 0};
        System.out.println("The Smallest Element is: " + smallestelement(arr1));

        int arr2[] ={3, 6, 4, 1, 9};
        System.out.println("The Smallest Element is: " +smallestelement(arr2));
    }

     static int smallestelement(int arr[]){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}
