package com.oracle;

public class Test {

	public void m1() {
		System.out.println("no- arg");
	}
	
	public void m1(int i) {
		System.out.println("int arg");
	}
	public void m1(double i) {
		System.out.println("double arg");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();    // 
		t.m1(10);
		t.m1(10.5); 
	}
}
