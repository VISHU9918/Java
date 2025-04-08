package com.example.shapes;
import com.example.utils.MathUtils;

public class Circle {
	
//	public Circle(int r) {
//		this.r=r;
//	}
	
	public double area(int r) {
		return MathUtils.getPi()*r*r;
	}

//	public void Display() {
//		System.out.println("Area"+area());
//	}
}
