import java.util.*;

public class N8CheckNoS2BitwiseisPosOrNegative {

  public static void main(String[] args) {

    int n = 5;
    check(n);
    n = -6;
    check(n);
  }
  public static void check(int n) {
   if (n >> 31 == 0) {
      System.out.println(n + " is positive.");
    } else if (n >> 31 == -1) {
      System.out.println(n + " is negative.");
    }

}
}