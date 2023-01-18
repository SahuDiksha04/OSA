package com.sample_package;

import org.testng.annotations.Test;

public class sampleclass1_Test {
	
	@Test(groups="smoke")
	
	public void createTest()
	{
		System.out.println("created");
	}
	
	@Test
	public void editTest()
	{
		System.out.println("edited");
	}

}
