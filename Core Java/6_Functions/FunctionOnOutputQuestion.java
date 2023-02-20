package Functions;

public class FunctionOnOutputQuestion {

	public static int c(int n) {
		n++;
		System.out.println("Increment of c " +n);
		return n;
	}
	public static void b(int n) {
		c(n);
		n++;
		System.out.println("Increment of b " + n);
	}
	
	public static void a(int n) {
		b(n);
		n++;
		System.out.println("Increment of a " + n);
		}
	
	public static void main(String [] args) {
		int n =10;
		a(n);
		System.out.println("Main Function  " +n);
		n= c(n);
		System.out.println("Main Function  " +n);
	}
}
