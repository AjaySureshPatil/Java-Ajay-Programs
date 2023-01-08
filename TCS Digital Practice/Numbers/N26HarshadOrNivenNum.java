public class N26HarshadOrNivenNum {
    
    public static void main(String args[]) {
        int n = 378;
        int temp = n;
        int sum = 0;
        while (temp != 0) {
          sum += temp % 10;
          temp /= 10;
        }
        if (n % sum == 0) {
          System.out.println("YES it is Harshad Number");
        } else {
          System.out.println("NO it is Harshad Number");
        }
    
      }
}
