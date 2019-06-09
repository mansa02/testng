package test;

import org.testng.annotations.Test;

public class C {
	@Test
	public void abc()
	{
		System.out.println("Hi ABC");
		
	}
	@Test
	public void def()
	{
		System.out.println("Hi DEF");
		
	}
	@Test(groups= {"mansa"})
	public void ghi()
	{
		System.out.println("Hi GHI");
		
	}
	@Test
	public void klm()
	{
		System.out.println("Hi KLM");
		
	}

}
