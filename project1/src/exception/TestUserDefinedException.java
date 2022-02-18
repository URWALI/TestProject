package exception;

class InvalidMarks extends Exception 
{
	public InvalidMarks(String str) 
	{

		super(str);
	}
}

public class TestUserDefinedException 
{

	static void pass(int marks) throws InvalidMarks 
	{
		if (marks < 50) 
		{

			throw new InvalidMarks("Marks are not enough to pass the exam ");
		} 
		else 
		{
			System.out.println("you have passed the exam");
		}
	}

	public static void main(String args[]) 
	{
		try 
		{

			pass(13);
		} 
		catch (InvalidMarks ex) 
		{
			System.out.println("Caught the exception");

			System.out.println("Exception occured: " + ex);
		}

		System.out.println("rest of the code...");
	}
}