import java.util.*;

public class A3SecSmallAndLargeEleS2 {
    
    private static void getElements(int[] arr, int n)
    {
        if(n == 0 || n == 1){
            System.out.println(-1 +" "+ -1);
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
      
        int i;
        for(i=0; i<n; i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
            System.out.println(large);
        }
        for(i=0; i<n; i++){
            if(arr[i]< second_small && arr[i] != small){
                second_small = arr[i];
            }
            if(arr[i]> second_large && arr[i] != large){
                second_large = arr[i];
            }
        }

        System.out.println("Second smallest is:" +second_small);
        System.out.println("Second largest is: " +second_large);
    }
    public static void main(String [] args){
        int []arr = {1,2,4,6,7,5};
        int n = arr.length;
        getElements(arr,n);
    }
}
