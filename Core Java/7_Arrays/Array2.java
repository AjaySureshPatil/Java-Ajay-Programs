import java.util.*;
public class Array2 {
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int marks[]=new int[n];                 // Declaration Type array name[] = new Type [Size]
       
        for(int i=0;i<n;i++){                   // Making blank array size of n
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){                   // Printing the array size
            System.out.print(marks[i]+ " ");
        }
    }
    
}


    // Same like as above just only modifiactions are here
    // public static void main(String[] args){
    //     Scanner sc =new Scanner (System.in);
    //     int n = sc.nextInt();

    //     int marks[] = new int [n];          // Declaration Type array name[] = new Type [Size]

    //     for(int i=0; i<n; i++){             // Taking index no inpute from  0 to n(which define by user)
    //         System.out.print("Index NO => "+i +") ");
    //         marks[i]= sc.nextInt();
    //     }
        
    //     for(int i=0; i<n; i++){
    //         System.out.print(marks[i]+" ");
    //     }
       
    // }

    // => Output
    //                  3
    //                  Index NO => 0) 5
    //                  Index NO => 1) 4
    //                  Index NO => 2) 6
    //                   5 4 6 