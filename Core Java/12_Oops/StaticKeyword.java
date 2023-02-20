class example{
    public int x;  //instance variable
    private static int y;  //static variable

    public void fun1(int z){   //instance function
        x=z;

    }
    public void show(){
        System.out.println("Value="+x);
    }

    public static void fun2(int m){
           //static function
        y=m;
    }
    
    public static void shows(){
        System.out.println("Y is ="+y);
    }
    static class test {
        public static String city ="Mumbai";

       
           //Static inner Class

    }
}

public class StaticKeyword {
    public static void main(String [] args){
        example a=new example();
        a.fun1(4);
        a.show();
        example.fun2(5);
        example.shows();
        System.out.println(example.test.city);

        
    }
    
}
