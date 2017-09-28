public class ToBinary {

	
	public static void main(String[] args) {
		int value = 324;
		String result="";
		System.out.print("convert "+value+" to binary is ");
		while(true)
		{
			result+=value%2==0?0:1;
			value/=2;
			if(value==0)
				break;
		}
		for(int i=result.length()-1;i>=0;i--)
			System.out.print(result.charAt(i));
	}
}
