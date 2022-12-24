import java.util.*;
public class PrimeRange {

    public static boolean prime(int n){
        boolean check=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                check=false;
                return false;

            }
        }
       
        return true;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
            if(prime(i)==true){
                System.out.print(i+" ");
            }
            
        }
    }
}
