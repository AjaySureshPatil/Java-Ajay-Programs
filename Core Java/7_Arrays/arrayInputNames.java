import java.util.*;
public class arrayInputNames {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       
       String names[] = new String[size];
       for(int i=0; i<size; i++) {                              // input
           names[i] = sc.next();2
       }
     
      for(int i=0; i<names.length; i++) {                       // Output           
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
       
    }
 }
 