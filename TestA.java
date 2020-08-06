package com.capgemini.oops;

public class TestA {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.subtract();
		SciCalculator scicalculator = new SciCalculator();
		scicalculator.cos();
		scicalculator.sin();
		scicalculator.add();
		scicalculator.subtract();
	}
}
