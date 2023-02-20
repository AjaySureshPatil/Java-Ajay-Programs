import java.util.*;
public class SumOfNnumbers {
    public static void main(String [] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A Num : ");
        n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            
        }
        System.out.println("The Required Sum : "+sum);
    }
    
}
