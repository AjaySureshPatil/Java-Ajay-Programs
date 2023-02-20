import java.util.*;

public class example{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int  a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a + b;
        int first = temp - b;
        int second = temp - a;

        System.out.println("Swap no are: " +second + "\n"+first);

    }
}