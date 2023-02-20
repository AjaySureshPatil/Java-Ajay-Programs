package Functions;

public class MoreOnFunctions {

// 1) Function for printing Even no from 1 to 100

	public static void printEvenNo() {
		for(int i=5; i<=50; i+=5) {
			System.out.print(i+" ");
		}
	}

// 2) Addition of two numbers Function

	public static int sum(int a, int b) {
		int add= a+b;
		return add;
	}
	
// Main code starts from here
	public static void main(String [] args) {

// (Funtion Callng) for printing Even no from 1 to 100
			printEvenNo();

// Addition of two numbers ( Function Calling )
		//		int num1=10;
		//		int num2=20;
		//		int c = sum(num1 , num2);
		//		System.out.println(c);
	}
}
