import java.util.*;
public class example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int no = sc.nextInt();
        while(no>0){
        int remainder = no%10;
        if(remainder%2==0){
        count++;
        }
        no = no/10;
        }
        if(count>=3){
        System.out.println("TRUE");
        }else{
        System.out.println("FALSE");
        }
        
    }
}