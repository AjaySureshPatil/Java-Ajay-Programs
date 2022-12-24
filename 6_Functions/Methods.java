import java.util.*;
public class Methods {
    public static void myname(String a){
        System.out.println(a);
        return;
    }
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        sc.close();
        myname(a);
    }
    
}
