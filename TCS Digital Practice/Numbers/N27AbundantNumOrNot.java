public class N27AbundantNumOrNot {
    
    public static void main(String args[]) {
        int n = 18;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
          if (n % i == 0) {
            sum += i;
          }
        }
        sum-=n;
        if (sum > n) {
          System.out.print("Abundant Number");
        } else {
          System.out.print("Not Abundant Number");
        }
      }
}
