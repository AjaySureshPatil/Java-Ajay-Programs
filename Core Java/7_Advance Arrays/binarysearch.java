package Arrays;

import javax.naming.directory.SearchControls;

public class binarysearch {

    public static int search(int[] input, int elem){
        int start =0;
        int end = input.length -1;
        while(start <= end){
            int mid =(start + end) /2;
           
            if(elem == input[mid]){
                return mid;
            }
            else if(elem > input[mid]){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        } 
        return -1;
    }

    public  static void main(String[] args){
        int[] input = {2,4, 5, 8, 11, 14, 15, 21, 24, 28};
        int index = search(input, 15);
        System.out.println(index);
    }
    
}
