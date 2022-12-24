import java.util.Scanner;
public class addwithoutstatic {
    
    public int add(int a, int b){       // (input int are directlecy called througth main Function)
        int c= a+b;                     // int is only declare for local method add
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       addwithoutstatic obj = new addwithoutstatic();   // class name , object name = new Constructer();
       int res = obj.add(a,b);          // create local variabal int result = for storing method with refernce into res
       System.out.println(res);         // syso the local var int result
    }
}
