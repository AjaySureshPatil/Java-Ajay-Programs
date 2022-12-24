import java.util.*;
public class factorialFunction {
    public static void factorial(int a ){
        int fact=1;
        for(int i=a;i>=1;i--){
            fact= fact*i;
            
        }
        System.out.println(fact);
        return;

    }
    public static void main(String [] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        factorial(a);

    }
    
}
