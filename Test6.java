package com.oracle;

class Animal {

	String s = "hello";
}

class Monkey extends Animal {
	String s = "hi";
}

public class Test6 {

	public void m1(Animal a) {
		System.out.println("animal");
		System.out.println(a.s);
	}

	public void m1(Monkey m) {
		System.out.println("monkey");
		System.out.println(m.s);
	}

	public static void main(String[] args) {
		Test6 t = new Test6();
		Animal a = new Animal();
		t.m1(a);
		Monkey m = new Monkey();
		t.m1(m);
		Animal a1 = new Monkey();
		t.m1(a1);
		
	}
}

/*
In Overloading -method resolution always taken care by compiler based on reference type.
Note-> in overloading , run time object won't play any role.'
*/