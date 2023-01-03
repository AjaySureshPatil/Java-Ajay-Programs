import java.util.*;
public class N17FibonachiSeries {

    public static void main(String [] args){

        int first = 0;
        int second = 1;
        int no =10;

        for(int i=1; i<no; i++){
           System.out.print(first +" ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}

// Output:
// 0 1 1 2 3 5 8 13 21