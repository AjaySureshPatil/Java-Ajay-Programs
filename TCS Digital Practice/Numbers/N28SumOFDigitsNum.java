public class N28SumOFDigitsNum {
    
    static private int getSum(int n)
{
	int d;
	int sum = 0;
	while (n != 0)
	{
		d = n % 10;
		sum += d;
		n = n / 10;
	}
	return sum;
}
public static void main(String[] args)
{
	int n = 472;
	System.out.print("Sum of digits of the given number is "+getSum(n));
}
}
