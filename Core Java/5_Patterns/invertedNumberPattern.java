import java.util.*;
public class invertedNumberPattern {
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }  
      }
    
}
