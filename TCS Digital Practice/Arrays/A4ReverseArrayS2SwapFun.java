import java.util.*;

public class A4ReverseArrayS2SwapFun{

    static void printArray(int arr[], int n){
        System.out.print("Reverse array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
    static void reverseArray(int arr[],int n){
        int p1 =0, p2 =n-1;
        while(p1<p2){                    //  p1 =0   <   p2= 4
            int tmp = arr[p1];           //  temp is empty so it take p1 value which is 0.
            arr[p1] = arr[p2];           //  So p1 empty so get tvalue of p2 which is 4.
            arr[p2] = tmp;               //  again p2 is empty so it tekaes from temp which is 0.
            p1++;
            p2--;                        // finaly p1 is 4 & p2 is 0 is swap 
        }
        printArray(arr,n);
    }
    public static void main(String [] args){
        int n =5;
        int arr[] ={5,4,3,2,1};
        reverseArray(arr,n);
    }
}