package org.testing.assertion;

public class Assertt {
	
	public static void assert1(String expected, String actual)
	{
		if (expected.equals(actual)) 
		{
			System.out.println("Assertion is getting passed");
		}
		else 
		{
			System.out.println("Assertion is getting failed");

		}
			
	}

}
