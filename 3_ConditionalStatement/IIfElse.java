import java.util.*;
public class IIfElse {
    public static void main(String [] args){
        // int a,b;
        // a=10;
        // b=1;
        // if(n>=18){
        //     System.out.println("Adult!!");
        // }else{
        //     System.out.println("Non Adult!");
        // }
        // if(n%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd !!");
        // }
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is Greater than b");
        }
        else{
            System.out.println("a is less than b");
        }

    }


    
}
