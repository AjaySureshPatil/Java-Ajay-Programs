import java.util.*;

public class A4ReverseArrayS4LiabaryFun {

    static void printArray(Integer arr[], int n){
        System.out.print("Reversed array is: \n");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void reverseArray(Integer arr[]){
        Collections.reverse(Arrays.asList(arr));
    }

    public static void main(String [] args){
        int n =5;
        Integer arr [] = {5,4,3,2,1};
        reverseArray(arr);
        printArray(arr,n);
    }
}
