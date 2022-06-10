package com.oracle;

public class Test5 {

	public void m1(int s) {
		System.out.println("general");
	}

	public void m1(int... sb) {
		System.out.println("var-arg");   //call this method by passing any no.of arguments including 0
	}

	public void m1( int x , int y) {
		System.out.println("x and y");
	}
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.m1();
		t.m1(10, 20);
		t.m1(10);
		t.m1(10,20,30);
	}

}
