package com.oracle;

public class Test2 {

	public void m1(int i) {
		System.out.println("int arg");
	}
	public void m1(float i) {
		System.out.println("float arg");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1(10);    
		t.m1(10.5f);
		t.m1('a'); 
		t.m1(10l); 
	//	t.m1(10.5);
}
}
