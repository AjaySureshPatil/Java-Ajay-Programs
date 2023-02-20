public class BoxConstructor {
    private int l,b,h;
    public BoxConstructor(){                // public private protected & Default are access modifiers
        l=10;                               // BoxConstructor is method without static
        b=3;
        h=7;

    }
    public BoxConstructor(int L,int B,int H){               
        l=L;
        b=B;
        h=H;
    }
    public void show(){
        System.out.println("Length is="+l);
        System.out.println("Breadth Is ="+b);
        System.out.println("Height is ="+h);
    }
    public static void main(String [] args){
        BoxConstructor b1=new BoxConstructor();
       // BoxConstructor b2=new BoxConstructor(3,5,7);
        b1.show();   //b1
    }
    
}
