package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDemo {

	public static void main(String[] args) {
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("enter the number");
			String num=br.readLine();
			
			
			int n=Integer.parseInt(num);
			float f=Float.parseFloat(num);
			
			System.out.println("Integer"+n);
			System.out.println("Float"+n);
		}
	catch(IOException e)
		{
			e.printStackTrace();
		  }

	}

}
