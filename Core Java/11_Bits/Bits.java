//cheacking given bit is zero or 1. ex=5(101) 
//get bit
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.Position;


public class Bits {
    public static void main(String [] args){
        int n=4;
        int pos=1;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit is Zero");
        }
        else{
            System.out.println("Bit is  non Zero");
        }
        // setbit
        //set bit at any memory location.
         int a=5;
         int posi=1;
         int bitmask=1<<pos;

         int newNum  = bitMask | a;
         System.out.println(newNum);  

         //clearbit
         int b=5;//100
         int position=2;
         int biitmask= 1<<position;
         int nbitmask=~(biitmask);

         int newNo=nbitmask & b;
         System.out.println(newNo);

         //update bit 1or 0
         int no=5 ; //101
         int positi=1;
         int bitmaask=1<<positi;
         int negebit=~(bitmaask);
         int operation;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter operation: ");//0  or 1
         operation=sc.nextInt();
         if(operation==1){
             //set bit
             int d= bitmaask | no;
             System.out.println(d);
         }
         else{
             //clearbit
             int f=negebit & no;
             System.out.println(f);

         }

    }
    
}
