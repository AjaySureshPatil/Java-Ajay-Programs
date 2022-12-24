import java.util.Arrays;

public class SmallestNoInArrayFind {
    
    public static void main(String args[]){

        int arr1[] = {2,5,1,3,0};
        System.out.println("The smallet element in array is: "+ sort(arr1));

        int arr2[] ={8,10,5,7,9};
        System.out.println("The smallest element in array is: "+ sort(arr2));

    }
    public static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
}
