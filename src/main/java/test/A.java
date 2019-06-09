package test;

import org.testng.annotations.Test;

public class A {

	@Test(groups= {"mansa"})
	public void mobileTest()
	{
		System.out.println("Hi Mobile Test");
		
	}
	@Test
	public void gametest()
	{
		System.out.println("Hi GameTest");
		
	}
	@Test
	public void datatest()
	{
		System.out.println("Hi datatest");
		
	}
	@Test
	public void wireTest()
	{
		System.out.println("Hi Wire test");
		
	}
}
