public class N27AbundantNumOrNotOptimized {
    
    public static void main(String args[]) {
        int n = 18;
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
          if (n % i == 0) {
            if (n / i == i) {
              sum += i;
            } else {
              sum += i;
              sum += n / i;
            }
          }
        }
        sum -= n;
        if (sum > n) {
          System.out.print("Abundant Number");
        } else {
          System.out.print("Not Abundant Number");
        }
      }
}
