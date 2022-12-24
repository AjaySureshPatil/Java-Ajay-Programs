import java.io.*;
import java.util.*;

class N6CheckNoS2isPerfectOrNot {

  static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
       
        if (i * i == n || i == 1)
          sum = sum + i;
        else sum = sum + i + n / i;

      }
    }
    
    if (sum == n)
      return true;
    else return false;
  }

  public static void main(String[] args) {

    boolean ex1 = isPerfect(6);
    boolean ex2 = isPerfect(15);
    boolean ex3 = isPerfect(28);

    if (ex1 == true) {
      System.out.println("6 is a perfect Number");
    } else System.out.println("6 is a not perfect Number");

    if (ex2 == true) {
      System.out.println("15 is a perfect Number");
    } else System.out.println("15 is not a perfect Number");

    if (ex3 == true) {
      System.out.println("28 is a perfect Number");
    } else System.out.println("28 is not a perfect Number");

  }
}
