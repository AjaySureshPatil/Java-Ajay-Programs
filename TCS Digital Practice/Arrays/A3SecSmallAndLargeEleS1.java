import java.util.*;

public class A3SecSmallAndLargeEleS1{

    private static void getElements(int[] arr, int n){
        if(n == 0 || n == 1){
            System.out.println(-1 + " " + -1);            
        }

        Arrays.sort(arr);
        int small = arr[1];  // 2nd Smallest No
        System.out.println("The Second Smallest No is: " +small);
        int large = arr[arr.length-2];  //2nd Largests NO
        System.out.println("The Second Largest No is: "  +large);
    }
    public static void main(String [] args){
        int [] arr ={1,2,4,6,7,5};
        int n = arr.length;
        getElements(arr,n);
    }
}