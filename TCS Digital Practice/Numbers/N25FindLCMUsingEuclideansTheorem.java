public class N25FindLCMUsingEuclideansTheorem {
    
    static int gcd(int a, int b) {
        if (b == 0) {
          return a;
        }
        return gcd(b, a % b);
      }
      public static void main(String args[]) {
        int a = 4, b = 8;
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.print("The LCM of the two given numbers is "+lcm);
      }
}
