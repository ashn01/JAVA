public class Fibonacci {

	
	public static void main(String[] args) {
		int n = 30;
		for(int i=0;i<30;i++)
			System.out.printf("%d ",RecurFibo(i));
	}
	public static int RecurFibo(int n)
	{
		if(n == 0 || n == 1)
			return n;
		else
		{
			return RecurFibo(n-2)+RecurFibo(n-1);
		}
	}
}
