import java.util.*;
public class transposeMatrix {
    public static void main(String [] args){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number Rows and Cols :");
        n=sc.nextInt();
        m=sc.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Required Matrix is ; ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
        System.out.println("The Transpose of Matrix is ; ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+ " ");
            }System.out.println();
        }
    }
    
}
