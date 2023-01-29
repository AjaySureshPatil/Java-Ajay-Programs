public class A4ReverseArrayS3Recursion {
 
    static void printArray(int arr[], int n){
        System.out.print("Reverse arrays is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }    
    }
    static void reverseArray(int arr[], int start, int end){
        if(start< end){             // start(0) is less(<) than end(1)
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start+1, end -1);
        }

    }
    public static void main(String [] args){
        int n = 5;
        int arr[] = {5,4,3,2,1};
        reverseArray(arr, 0, n-1);
        printArray(arr,n);
    }
}


// Solution 3: Recursive method

// Approach: The recursive method has an approach almost similar to the iterative one. The approach has been broken down into some steps for simplicity.

// Create a function that takes an array ,start index and end index of the array as parameters.
// Swap the elements present  at start and end index, 
// The portion of array left to be reversed is arr[start+1,end-1]. Make a recursive call to reverse the rest of array. While calling recursion pass start +1  and end – 1 as parameters for the shrinked array. Repeat step 2.
// Continue recursion as long as ‘start < end’ condition is satisfied. This is the base case for our recursion.