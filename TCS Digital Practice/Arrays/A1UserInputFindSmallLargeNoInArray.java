import java.util.*;

public class A1UserInputFindSmallLargeNoInArray {

     static void sort(int []arr , int n){               // sort is method
        
        Arrays.sort(arr);                               // class.method(Parameters)
        System.out.print("Sorted Arrays is =>  ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Smallest Element => " +arr[0]);
        // int small = arr[0];
        // System.out.print("Smalles Element is: " +small);

        System.out.println("Largest Element => " +arr[arr.length-1]);
        // int large = arr[arr.length-1];
        // System.out.print(" Largest Element is: " +large);
                
    }

   
    static void reverse(int arr[], int n){

        System.out.print("Reverse Arrays is => ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int [n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("User Defined Arrays is => ");
        for(int i=0; i<n; i++){
            System.out.print( arr[i] +" " );
        }
        System.out.println();                               // New Line

        sort(arr, n);
        reverse(arr,n);
    
    }
}

