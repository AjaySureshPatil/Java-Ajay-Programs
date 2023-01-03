public class N21PrintPrimeFactors {
    
    public static void primeFactor(int n) {
        System.out.print("Prime Factors : ");
        for (int i=2; n>1 ; i++) {
    
          if (n % i == 0) {
    
            while (n % i == 0) {
    
              System.out.print(i + " ");
              n = n / i;
            }
          }
    
        }
      }
      public static void main(String args[]) {
        int n = 60;
        primeFactor(n);
      }
}

