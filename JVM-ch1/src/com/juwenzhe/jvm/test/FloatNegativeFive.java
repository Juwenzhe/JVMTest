package com.juwenzhe.jvm.test;

public class FloatNegativeFive {

	public static void main(String[] args) {
		float a = -5;
		System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));
		double b = -5.0;
		
		int c = -10;
		System.out.println(Integer.toBinaryString(c));
	}

}
