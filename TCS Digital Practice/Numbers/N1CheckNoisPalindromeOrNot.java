import java.util.*;
public class N1CheckNoisPalindromeOrNot {

    static int reverse(int x){
        int y =0;
        while(x>0){

            int digit = x % 10;              // Extract the last digit   System.out.println("Digit=> "+digit);
           
            y = y * 10 + digit;              // Appending last digit     System.out.println("New Y => "+y);    
            
            x = x /10;                       // Shrinkinng x by discarding the last digit    System.out.println("New X => "+x);
           
        }
        return y;
    }
    public static void main(String [] args){
        int x =123;
        int dummy = x;
        int c = reverse(x);
        if( dummy == c){
            System.out.print("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome No");
        }
    }
}