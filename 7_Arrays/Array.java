import java.util.*;
public class Array {
    public static void main(String [] args){

        // Method 1                             // Syntax
        int marks []= new int [4];              // dataType ArrayName [] = new dataType[size]
        marks[0]=45;
        marks[1]=87;
        marks[2]=90;
        marks[3]=56;
         System.out.println(marks[1]);
         System.out.println(marks[0]);
         System.out.println(marks[3]);
         System.out.println(marks[2]);

        // Method 2 (Taking input from user)
        // int n;
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        // sc.close();
        // int marks[]=new int[n];                  // 1st Declrated the Array

        // for(int i=0;i<n;i++){
        //     System.out.println(marks[i]);        // 2nd Filling Values in Array
        // }\

        // Methid 3
        // int marks[]={12,13,14,15};
        // for(int i=0;i<4;i++){
        //     System.out.println(marks[i]);
        // }
    }
    
}
