package control; //sum of first 10 odd no.

public class Dowhile {

	public static void main(String[] args) 
	{
		int i=1;
		int sum=0;
		do
		{
			sum=sum+i;
			i=i+2;
			
		}
		while(i<=20);
		System.out.println("the sum is " +sum);

	}

}
