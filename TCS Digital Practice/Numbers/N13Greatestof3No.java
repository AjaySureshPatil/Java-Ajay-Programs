import javax.print.DocPrintJob;

public class N13Greatestof3No {
    
    public static void main(String []args){

        double a = 50.0;
        double b = 20.0;
        double c = 30.0;

        double d = Math.max(a, Math.max(b, c));
    
        System.out.println("Greates of 3 is " +d);
}
}
