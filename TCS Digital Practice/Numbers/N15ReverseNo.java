public class N15ReverseNo {
    
    public static int reverse(int no){
        int y=0;
        while(no > 0){
            int digit = no % 10;
            y = y * 10 + digit;
            no = no /10;
        }
        return y;
    }
    public static void main(String [] args){

        int no = 472;
        int a = reverse(no);
        System.out.println("Reverse no is : " +a);
    }
}
