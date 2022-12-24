import java.util.*;
public class Searching2DArray {
    public static void main(String [] args ){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Value of rows and Cols : ");
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The output array is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("enter A element which you want to search: ");
        int index=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(index==arr[i][j]){
                    System.out.println("the element "+index+" is Found at location "+ i+", "+ j);
                }
            }
        }

    }
    
}
