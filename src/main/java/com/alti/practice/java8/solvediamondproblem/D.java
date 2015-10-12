/**
 * 
 */
package com.alti.practice.java8.solvediamondproblem;


interface A{
	
	public default void defaultMethod(){
		System.out.println("I am interface A default method ...");
	}
}

interface B extends A {
	
	public default void defaultMethod(){
		System.out.println("I am interface B default method ...");
	}
}

interface C extends A {
	public default void defaultMethod(){
		System.out.println("I am interface C default method ...");
	}
}



/**
 * @author syandagudita
 * Solve diamond problem due to java 8 default method feature.
 */
public class D implements B, C{

	//In this context we must override default method in the implementation class.
	@Override
	public void defaultMethod() {
		C.super.defaultMethod();
	}
	
	public static void main(String... strings){
		D d = new D();
		d.defaultMethod();
	}
	
}

