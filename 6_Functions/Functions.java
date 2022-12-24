import java.util.*;

public class Functions {
 
     //Multiply 2 numbers
        public static int multiply(int a, int b) {
         int c=a*b;
         return c;
}
  
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       sc.close();
        
       int c= multiply(a, b);
       System.out.println(c);
       
   }
}
