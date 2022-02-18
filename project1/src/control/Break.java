package control;

public class Break {

	public static void main(String[] args) 
	{
		int var;
		   for(var=100;var>=10;var--)
		   {
			   System.out.println("var:"+var);
			   if(var==99)
			   {
				   break;
			   }
		   }

		}

	}
