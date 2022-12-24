import java.util.*;
public class N8CheckNoisPosOrNegative {

    public static void check(int n){
        if(n>0){
            System.out.println(n +" Is Positive No");
        }
        else{
            System.out.println(n +" Is Negative Number");
        }
        
    }
    public static void main(String [] args){
        int n =5;
        check(n);

        int m = -6;
        check(m);
    }
}
