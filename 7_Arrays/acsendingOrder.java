import java.util.*;
public class acsendingOrder {
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int Number[]=new int[n];
        for(int i=0;i<n;i++){
            Number[i]=sc.nextInt();
        }
        boolean cheack = true;
        for(int i=0;i<Number.length-1;i++){
            if(Number[i]>Number[i+1]){
                cheack = false;
            }
        }
        if(cheack){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("not in Ascending Order");
        }

    }
    
}
