package com.oracle;

public class Test4 {
	public void m1(String s) {
		System.out.println("String");
	}

	public void m1(StringBuffer sb) {
		System.out.println("stringbuffer");
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1("abcd");
		t.m1(new StringBuffer());
		t.m1(null);
	}
}
