package com.example.test;
import com.example.math.Calculator;

public class MathTest {
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println("Sum="+c.add(5, 4));
	System.out.println("Sub="+c.sub(8, 5));
}
}
