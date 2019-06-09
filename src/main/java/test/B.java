package test;

import org.testng.annotations.Test;

public class B {
	@Test
	public void regre()
	{
		System.out.println("SAnity Testing");
		
	}
	@Test(groups= {"mansa"})
	public void smoketest()
	{
		System.out.println("Smoke Testing");
		
	}
	@Test
	public void regression()
	{
		System.out.println("Regression Testing");
		
	}
	@Test
	public void regressiontest()
	{
		System.out.println("Monkey Testing");
		
	}
}
