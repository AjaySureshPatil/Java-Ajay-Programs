import java.util.*;
public class N6CheckNoisPerfectOrNot {

    public static boolean isPerfect(int n){
        int sum =0;
        for(int i=1; i<=n-1; i++){
            if(n%i == 0){
                sum = sum +i;
            }
        }
        if(sum == n){
            return true;
        }
        return false;
    }
    public static void main(String []args){
        
        boolean ex1 = isPerfect(6);
        boolean ex2 = isPerfect(15);
        boolean ex3 = isPerfect(28);

        if(ex1 == true){
            System.out.println("6 is a perfect Number");
        } else System.out.println("6 is not perfect Number");

        if(ex2 == true){
            System.out.println("15 is perfect Number");
        }else System.out.println("15 is not a perfect Number" );

        if(ex3 == true){
            System.out.println("28 is a perfect Number");
        }else System.out.println("28 is not a perfect Number");
    }
}
