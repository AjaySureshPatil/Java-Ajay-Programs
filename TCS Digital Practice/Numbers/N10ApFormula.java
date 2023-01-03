import java.util.*;

public class N10ApFormula {
    
    static double sumofAp(double a, double d, int n){
        double sum = (n/2.0) * ( 2.0*a + (n - 1) * d);
        return sum;
    }

    public static void main(String [] args){
        double a = 1.5;
        double d = 3;
        int n =5;

        System.out.println("Ap Sum " +sumofAp(a,d,n));
    }
}
