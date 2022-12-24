import java.util.*;
public class example{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();

        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }else{
                System.out.println("");
            }
        }
    }
}