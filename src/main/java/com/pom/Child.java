package com.pom;

import org.testng.annotations.Test;

public class Child extends Parent {
	
	@Test
	public void testb() {
		System.out.println("Child");
		super.testa();
	}

}	
