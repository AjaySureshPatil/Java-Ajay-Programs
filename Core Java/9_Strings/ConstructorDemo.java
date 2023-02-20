class calc{
    int num1;
    int num2;
    int result;

    public calc(int n,int m){
        num1=n;
        num2=m;
    
    }

}
public class ConstructorDemo {
    public static void main(String[] args) {
        calc obj = new calc(5,4);
        System.out.println(obj.num1);
        System.out.println(obj.num2);


        
    }
    
}
