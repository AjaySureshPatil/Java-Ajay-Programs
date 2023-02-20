import java.util.*;
 
public class A3ChangeLetter {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String str = sc.next();
     String result = "";
 
     for(int i=0; i<str.length(); i++) {            
       if(str.charAt(i) == 'e') {                     // tejas => tpSjas
         result += 'p';
       } else {
         result += str.charAt(i);
       }
     }
 
     System.out.println(result);
   }
}
