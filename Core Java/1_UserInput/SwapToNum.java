import java.util.*;
public class SwapToNum{
     public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Numbers: ");
      int x=sc.nextInt();
      int y=sc.nextInt();
      sc.close();
      int temp=x+y; //5+6 =11
      int C=temp-y; // 11-6=5
      int D=temp-x;  //11-5=6
      System.out.println("First num is : "+D);
      System.out.println("Sdcond Num is : "+C);


        
     }
    }

   
   