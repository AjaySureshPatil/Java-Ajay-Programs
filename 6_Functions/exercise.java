import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;
public class exercise{

    public static int add(int a, int b){
        int c= a+b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int res = add(a,b);      
       System.out.println(res); 
    }
}