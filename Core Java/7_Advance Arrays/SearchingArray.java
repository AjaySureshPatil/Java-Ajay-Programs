import java.util.*;
public class SearchingArray {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        n=sc.nextInt();

        int marks[]=new int[n];
        System.out.println("Enter Elements of array: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Given array is: ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" \n");
        }
        int min=marks[0];
        int max=marks[0];
        for(int i=0;i<n;i++){
            if(min>marks[i]){
                min=marks[i];
            }
            if(max<marks[i]){
                max=marks[i];
            }
        }
        System.out.print("Min marks :"+ min);
        System.out.print("Max marks :"+ max);
        }

    }
    

