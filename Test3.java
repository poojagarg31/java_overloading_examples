package com.oracle;

public class Test3 {

	public void m1(String s) {
		System.out.println("string");
	}
	
	public void m1(Object o) {
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1(new Object());
		t.m1("abcd");
		t.m1(null);
	}
}
