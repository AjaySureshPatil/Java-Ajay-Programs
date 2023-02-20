import java.util.*;
public class addition {
    
    public static void sum(int a,int b){
        int c=a+b;
        System.out.println(c);
        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();

        sum(a,b);
        
    }
    
}
