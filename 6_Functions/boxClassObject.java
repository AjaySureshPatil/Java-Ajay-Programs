class box {
    private int length , breadth, height;
    public void setDimensions(int l,int b,int h){       //pu
        length=l;
        breadth=b;
        height=h;

    }
    public void showDimensions(){
        System.out.println("Length="+length);
        System.out.println("Breadth="+breadth);
        System.out.println("Height="+height);
    }
    
}
public class boxClassObject{
   public static void main(String[] arg){
    box s=new box();                                     // another class name , object name = new constructer
    s.setDimensions(9,3,7);
    s.showDimensions();
   }
}