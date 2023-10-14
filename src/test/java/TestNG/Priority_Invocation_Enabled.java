package TestNG;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {
	
	//default priority is 0. It will execute from lowest to highest. e.g. -6, -4, -1
	// if priority is same then it will check method name alphabetically 
	// less priority will execute first like 1, 2, 3
	
	@Test(priority=3, invocationCount=2)    
	
	public void demo1()
	{
		System.out.println("Hi TestNG demo1");
		
	}
	
	@Test(priority=2, invocationCount=3)
	public void demo2()
	{
		System.out.println("Hi TestNG demo2");
	}

	@Test(priority=1, invocationCount=4,enabled=true)
	public void demo3()
	{
		System.out.println("Hi TestNG demo3");
	}
	
	
}
