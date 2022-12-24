import java.util.Scanner;

public class pattern12 {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n;j++)
				System.out.print(j);
		}
		System.out.println();
	}

}
