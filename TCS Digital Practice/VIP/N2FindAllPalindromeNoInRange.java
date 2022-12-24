import java.util.*;
public class N2FindAllPalindromeNoInRange {
    
    static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp>0){
            reverse = reverse *10 + temp%10;    
             // temp%10 => removing last digit of 123 is 12.3 => 0.3 = 0.3 * 10 => 3
            temp = temp/10;
            // 123 => 3 removed, 12/10 => 1.2(temp) >(greater than) 0
        }

        // If n and reversse are same,
        // then n is palindrome
        if(n == reverse){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        int min = 100;
        int max = 150;
        for(int i=min; i<=max; i++){
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
}
