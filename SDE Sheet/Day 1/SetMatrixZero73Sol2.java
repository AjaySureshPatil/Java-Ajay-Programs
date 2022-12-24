import java.util.*;
class SetMatrixZero73Sol2{
static void setZeroes(int [][] matrix) {
  int rows = matrix.length, cols = matrix[0].length;    
  // matrix.length is used for ith Row & Matrix[0].length used for columns in 0th row
  int dummy1[]=new int[rows];
  int dummy2[]=new int[cols];
  Arrays.fill(dummy1,-1);
  Arrays.fill(dummy2,-1);
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if (matrix[i][j] == 0) {
        dummy1[i] = 0;
        dummy2[j] = 0;
        
      }
    }

  }
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if (dummy1[i] == 0 || dummy2[j]==0) {
        matrix[i][j] = 0;
      }
    }
  }
}

public static void main(String args[]) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}
}

// Time Complexity: O(N*M + N*M)

// Space Complexity: O(N)