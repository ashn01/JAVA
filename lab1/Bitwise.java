public class Bitwise {

	
	public static void main(String[] args) {
		int op1 = 19;
		int op2 = 23;
		System.out.println("op1 = "+op1+", op2 = "+op2);
		System.out.println("op1 in binary is "+Integer.toBinaryString(op1));
		System.out.println("op2 in binary is "+Integer.toBinaryString(op2));
		System.out.println("op1&op2 in binary is "+Integer.toBinaryString(op1&op2));
		System.out.println("op1&op2 in decimal is "+(op1&op2));
		System.out.println("op1&op2 in hexadecimal is "+Integer.toHexString(op1&op2));

		System.out.println("op1|op2 in binary is "+Integer.toBinaryString(op1|op2));
		System.out.println("op1|op2 in decimal is "+(op1|op2));
		System.out.println("op1|op2 in hexadecimal is "+Integer.toHexString(op1|op2));

		System.out.println("op1^op2 in binary is "+Integer.toBinaryString(op1^op2));
		System.out.println("op1^op2 in decimal is "+(op1^op2));
		System.out.println("op1^op2 in hexadecimal is "+Integer.toHexString(op1^op2));

		System.out.println("~op2 in binary is "+Integer.toBinaryString(~op2));
		System.out.println("~op2 in decimal is "+(~op2));
		System.out.println("~op2 in hexadecimal is "+Integer.toHexString(~op2));
	}
}

/*
 * Convert to Binary.
 * A 	0101
 * B	1001
 *
 * A&B	0010
 * A|B	1101
 * A^B	1100
 * ~A	1010
*/