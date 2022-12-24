import java.util.*;
public class ReverceString {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        String store="";
        for(int i=name.length()-1; i>=0; i--){
            store=store+name.charAt(i);

        }
        System.out.print(store);
    }
}
