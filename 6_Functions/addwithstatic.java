import java.util.*;
public class addwithstatic {
    
    public static int add(int a, int b){    // static not need class and object varibal in main method
        int c= a+b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int res = add(a,b);                  // add method insert into local var int result(res)  
       System.out.println(res);             // after call result
    }
}
