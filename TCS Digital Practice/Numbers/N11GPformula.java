public class N11GPformula {
    
    public static float SumofGP(float a, float r, int n){
        float sum = a * ((float) Math.pow(r, n) -1) / (r - 1);
        return sum;
    }
    public static void main(String [] arga){
        float a = 2;
        float r = 2;
        int n = 4;

        System.out.println("Sum of GP Series is " +SumofGP(a, r, n));
    }
}
