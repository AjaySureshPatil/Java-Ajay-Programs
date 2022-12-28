import java.util.*;
public class N11GPiteration {
    
    static double SumofGP(double a, double r, int n){
        double = 0.0;
        for(int i=0; i<n; i++){
            sum = sum + a;
            a = a * r;
        }
    }

    public static void main(String [] args){

        double a = 2.0; // first term of gp
        double r = 1.5; // common ratio of gp
        int n = 4;

        System.out.println("Sum of GP series is " +SumofGP(a, r, n));
    }
}
