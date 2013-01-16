package com.example.sampleapp;

public class MyStack {

	public final static int DEFAULT_MAX_STACK_SIZE = 10; 
	
	int maxStackSize = 0;
	int currentSize  = 0;
	
	String[] stack;

	public MyStack() {
		// TODO Auto-generated constructor stub
		this.maxStackSize = DEFAULT_MAX_STACK_SIZE;
		stack = new String[maxStackSize];
	}
	
	public MyStack(int maxSize) {
		maxStackSize = maxSize;
		stack = new String[maxStackSize];
	}
	
	public int getMaxStackSize() {
		return maxStackSize;
	}
	
	public void setMaxStackSize(int size) {
		maxStackSize = size;
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	
	public String pop() {
		if (currentSize < 0) return null;
		
		currentSize--;
		
		String ret = stack[0];
		
		for (int i = 0; i < currentSize; i++) {
			stack[i] = stack[i + 1]; 
		}
		
		return ret;
	}
	
	public void push(String str) throws Exception {
		if (currentSize > 10) throw new Exception();
		currentSize++;
		
		for (int i = 0; i < currentSize; i++) {
			stack[i + 1] = stack[i]; 
		}
		
		stack[0] = str;
	}
}
