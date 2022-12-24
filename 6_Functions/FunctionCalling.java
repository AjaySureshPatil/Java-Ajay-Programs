

public class FunctionCalling {

	public static void increment(int n) {
		n++;
		System.out.println("Increment Function "+ n);
	}
	public static void main(String [] args) {
		int n;
		n=10;
		increment(n);
		System.out.println("Main Function "+ n);
		
		
	}
}
