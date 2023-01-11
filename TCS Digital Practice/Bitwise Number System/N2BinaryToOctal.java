public class N2BinaryToOctal {
    
    public static void main(String args[]) {
        String s = "1100110";
        int n = s.length();
        //adding appropriate "0" to the left of
        //string to make the length divisible by 3.
        if (n % 3 == 1) {
          s = "00" + s;
        } else if (n % 3 == 2) {
          s = "0" + s;
        }
        n = s.length();
        String ans = "";
        for (int i = 0; i < n; i += 3) {
          int temp = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0') * 1;
          ans = ans + Integer.toString(temp);
        }
        System.out.print(ans);
      }
}
