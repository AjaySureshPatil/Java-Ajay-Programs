import java.util.*;
public class N18FactorialRecusive {

    public static int Factorial(int x){
        if(x == 0){
            return 1;           // 0 = True & 1 = False
        }
        return x * Factorial( x - 1);

    }
    public static void main(String [] args){
        int x = 5;

        System.out.println("The Factorial of " +x +" is " + Factorial(x));
    }
}
