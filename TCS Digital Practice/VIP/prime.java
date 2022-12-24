import java.util.Scanner;
public class prime {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean check=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                check=false;
                System.out.println("Non Prime");
                break;
            }
        }
        if(check==true){
            if(n==0){
                System.out.println("Zero");
            }
            else if(n==1){
                System.out.println("Neigher prime nor composite");
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}
