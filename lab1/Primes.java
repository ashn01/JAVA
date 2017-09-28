public class Primes {

	
	public static void main(String[] args) {
		int value=30;
		System.out.println("value is "+value);
		System.out.println("Prime numbers of "+value+"'s are " );
		
		loop:
		for(int i=2;i<value;i++)
		{
			for(int j=2;j<=(int)(Math.sqrt(i));j++)
			{
				if(i%j == 0)
					continue loop;
			}
			System.out.print(i + " ");
		}
	}
}
