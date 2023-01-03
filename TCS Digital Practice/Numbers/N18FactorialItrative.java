import java.util.*;
public class N18FactorialItrative {

    public static int Factorial(int x){
        int ans = 1;
        for(int i=1; i<=x; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String [] args){

        int x = 5;

        System.out.println("The Factorial of " +x +" is " +Factorial(x));
    }
}
