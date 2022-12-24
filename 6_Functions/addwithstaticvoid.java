import java.util.Scanner;
public class addwithstaticvoid {

    public static void add(int a, int b){    // static not need class and object varibal in main method
        int c= a+b;
        System.out.println(c);             // after call result
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        add(a,b);                  // add method   
      
    }
    
}
