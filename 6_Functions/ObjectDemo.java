class calc{
    int num1;
    int num2;
    int result;

    public void perform(){
        result=num1+num2;
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
    calc obj= new calc();  //obj() is a constructor ,new assign a memory
        obj.num1=4;
        obj.num2=5;
        
        obj.perform();
    System.out.println(obj.result);
    }
    
}
