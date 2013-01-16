package com.example.sampleapp;

import junit.framework.TestCase;

public class MyStackTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMyStack() {
		MyStack stack = new MyStack();
		assertEquals(10, stack.getMaxStackSize());
	}

	public void testMyStackInt() {
		int expect = 7;
		MyStack stack = new MyStack(expect);
		assertEquals(expect, stack.getMaxStackSize());
	}

	public void testGetMaxStackSize() {
		int expect = 9;
		MyStack stack = new MyStack();
		stack.setMaxStackSize(expect);
		assertEquals(expect, stack.getMaxStackSize());
	}

	public void testGetCurrentSize() {
		MyStack stack = new MyStack();
		assertEquals(0, stack.getCurrentSize());
		try {
			stack.push("");
			assertEquals(1, stack.getCurrentSize());
			stack.push("");
			assertEquals(2, stack.getCurrentSize());
			stack.push("");
			assertEquals(3, stack.getCurrentSize());
			stack.push("");
			assertEquals(4, stack.getCurrentSize());
			stack.pop();
			assertEquals(3, stack.getCurrentSize());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testPop() {
		fail("Not yet implemented");
	}

	public void testPush() {
		fail("Not yet implemented");
	}

}
