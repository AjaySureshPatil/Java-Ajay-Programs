public class N13Greatestof3Noifelse {
    
    public static void main(String [] args){
        double a = 1.123, b = 1.124, c = 1.125;

        if (a > b && c > b){
            System.out.println("The greatest of the three no is " +a);
        }
        else if(b > a && b > c){
            System.out.println("The gretest of three is " +b);
        }
        else{
            System.out.println("The grestes of three is " +c);
        }
    }
}
