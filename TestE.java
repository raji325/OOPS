package com.capgemini.oops;

public class TestE {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		System.out.println("**************************");
		Lion l=new Lion();
		l.eat();
		l.hunt();
		l.roar();
		System.out.println("**************************");
		Dog d=new Dog();
		d.eat();
		d.bark();
		d.bite();
	}

}
