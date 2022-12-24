import java.util.*;
public class N5CheckNoisAmstrongNumOrNot {

    static boolean ArmstrongNumber(int n){
        int originalno = n;
        int count = 0;
        int temp = n;
        while(temp != 0){
            count++;
            temp = temp /10;
        }

        int sumofpower = 0;
        while(n != 0){
            int digit = n%10;
            sumofpower += Math.pow(digit, count);
            n /= 10;
        }
        return(sumofpower == originalno);

    }
    public static void main(String []args){
        int n1 = 153;
        if(ArmstrongNumber(n1)){
            System.out.println("Yes, it is an Armstrong Number \n");
        }
        else{
            System.out.println("No, it is not an Armstrong Number \n");
        }
    }

}
