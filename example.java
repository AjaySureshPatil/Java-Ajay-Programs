import java.util.*;

public class example{       // find the sum of AP Series

    static double sumofAp(double a, double d, int n){
        double sum = 0.0;

        for(int i=1; i<=n; i++){
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }

    public static void main(String [] args){
        double a=1.5;
        double d=3;
        int n =5;

        System.out.println("Sum of Ap is: " +sumofAp(a, d, n));
    }
}