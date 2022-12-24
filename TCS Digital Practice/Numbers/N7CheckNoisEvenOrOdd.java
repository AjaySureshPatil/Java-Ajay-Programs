import java.util.*;
public class N7CheckNoisEvenOrOdd {

    public static void main(String []args){
        int n =4;
        if(reminder(n) == 0){
            System.out.println("This is Even No " + n);
        }
        else System.out.println("This is Odd Number" + n);
    }

    static int reminder(int n){
        return(n % 2);
    }
}
