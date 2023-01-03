public class N23CheckNoisAutomorphicOrNot {

    public static boolean isAutomorphic(int N) {
        int sq = N * N;
    
        while (N > 0) {
    
          // Check if last digit is equal or not
          if (N % 10 != sq % 10)
            return false;
    
          // Reducing the number and its square
          N /= 10;
          sq /= 10;
        }
    
        return true;
      }
      public static void main(String args[]) {
        int n = 25;
        if(isAutomorphic(n)==true)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not Automorphic Number");
      }
}