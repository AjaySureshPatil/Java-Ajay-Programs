// Fibonachi Series Means Addtion of last two digits
public class fibo{
    public static void main(String  [] args){
        int first=0;
        int sec=1;
        int n=10;
        for(int i=1; i<n; i++){
            System.out.print(first+" ");    // 0  1  1  2   3
            int temp=first+sec;             // 1  2  3  5
            first=sec;                      // 1  1  2  3
            sec=temp;                       // 1  2  3  5
        }
    }
}

// Output:
// 0 1 1 2 3 5 8 13 21