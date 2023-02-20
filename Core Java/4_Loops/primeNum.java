import java.util.*;
public class primeNum {
    public static void prime(int n){
        int flag =1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Non prime");
               
                flag=0;
                break;
            }
           
        }
        if(flag==1)
        {
            
            
                System.out.println("prime");
            }
        }
       
    
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        prime(n);
    }
    
}
