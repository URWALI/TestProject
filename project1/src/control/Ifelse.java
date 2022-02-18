package control;

import java.util.Scanner;
public class Ifelse   
{

	public static void main(String[] args)
	{
		int trees;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number Of Trees:");
		trees=in.nextInt();
		
		if(trees>=50)
		{
			System.out.println("We can form a nursery.");
		}
		else
		{
			System.out.println("We can not form a nursery.");
		}

	}

}
