package JunitCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Junit.Sum;

public class testcasesum 
{
	@Before
	public void input()
	{
		System.out.println("this is before");
	}

	@Test
	public void test() 
	{
		Sum s1=new Sum();
		int a=s1.add(8, 9);
		assertEquals(17,a);
		System.out.println("this is test");
	}
	@After
	public void show()
	{
		System.out.println("this is after");
	}

}
