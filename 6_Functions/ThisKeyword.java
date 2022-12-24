class calc
{
    int num1;
    int num2;
    int result;
    public calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.result=num1+num2;
    }
}

public class ThisKeyword 
{
    public static void main(String[] args) {
        calc obj=new calc(5,4);        
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println(obj.result);
        
    }
    
}
