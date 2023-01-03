import java.util.*;

public class N16FindMaxMinDigitInNo {
    
    public static void MinMax(int n){

        int digit;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while(n !=0){
            
            digit = n % 10;
            mini = Math.min(mini, digit);
            maxi = Math.max(maxi, digit);
            n = n / 10;
        }

        System.out.println("The minimun number is: " +mini);
        System.out.println("The maximax number is: " +maxi);
    }

    public static void main(String [] args){
        int n = 4726;
        MinMax(n);
    }
}
