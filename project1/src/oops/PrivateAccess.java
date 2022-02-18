package oops; //private access

class AA
{
	private int marks = 40;
	private void sms()
	{
		System.out.println(" Urwali");
	}
}

public class PrivateAccess {

	public static void main(String[] args) 
	{
		AA obj=new AA();  
		   System.out.println(obj.marks);  
		   obj.sms();  
	}

}
