import java.util.*;
public class twoDArrays {
    public static void main(String[] args){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value Row And Columns: ");
        n=sc.nextInt();
        m=sc.nextInt();

        int matrix[][]= new int[n][m];
        System.out.println("enter Elements :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
