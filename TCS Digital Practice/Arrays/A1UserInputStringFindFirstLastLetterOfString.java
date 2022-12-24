import java.util.*;

public class A1UserInputStringFindFirstLastLetterOfString{

    static void sort(String arr[], int n){
        Arrays.sort(arr);

        System.out.print("The Sorted String: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        System.out.print("First letter of String => " +arr[0]);
        //  No Need Of For Loop for Finding Single Letter
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[0]);
        // }
        System.out.println();

        System.out.print("Last Letter of String is => " +arr[arr.length-1]);
        //    No Need Of For Loop for Finding Single Letter
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[arr.length-1]);
        // }
        System.out.println();
    }

    static void reverseString(String arr[] , int n){
        System.out.print("The Reverse String is => ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        //    String arr[]={ a, c, b, d, f,}

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        System.out.print("Alfabetical Letters => ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        sort(arr, n);
        reverseString(arr, n);
    }
}