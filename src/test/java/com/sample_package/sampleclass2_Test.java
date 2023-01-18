package com.sample_package;

import org.testng.annotations.Test;

public class sampleclass2_Test {
	
	@Test(groups="smoke")
	public void createcategoryTest()
	{
		System.out.println("category created");
	}
	
	@Test
	public void subcategoryTest()
	{
		System.out.println("sub category created");
	}

}
