package operator;

public class Shift {

	public static void main(String[] args) 
	{
		int a=34;
		int b=-20;
		
		System.out.println("signed right shift 34 devide by 2="+(a>>1));
		System.out.println("signed right shift -20 devide by 2="+(b>>1));
		System.out.println("signed left shift 34 multiply by 2="+(a<<1));
		System.out.println("signed left shift -20 multiply by 2="+(b<<1));
		System.out.println("unsigned right shift of 34 ="+(a>>>1));
		System.out.println("unsigned right shift of -20 ="+(b>>>1));
		
		

	}

}
