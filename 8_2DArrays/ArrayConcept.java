import java.util.*;

public class ArrayConcept {
    
  public static void main(String [] args){

    int row, cols;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No Rows: ");
      row= sc.nextInt();
    System.out.println("Enter No Columns: ");
      cols= sc.nextInt();

    int arr[][]=new int [row][cols];

    System.out.println("Enter the Matrix as per your Wish: ");
    // Input array
    for(int i=0; i<row; i++){
      for(int j=0; j<cols; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("Your Given matrix is as Below: ");
    //output print
    for(int i=0; i<row; i++){
      for(int j=0; j<cols; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println("Enter The Index No Which You Want To Find From The Matrix: ");
    int index=sc.nextInt();
    for(int i=0; i<row; i++){
      for(int j=0; j<cols; j++){
        if(index==arr[i][j]){
          System.out.println("The Row is: "+ i +" & Column is: "+ j +" Output => "+ "("+ i+ ","+ j+")");
        }
      }
    }

    System.out.println("The Tranpose Of Matrix Is: ");
    for(int i=0; i<row; i++){
      for(int j=0; j<cols; j++){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }

  }
}
