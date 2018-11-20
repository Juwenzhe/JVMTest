package com.juwenzhe.jvm.test;

public class ReadOPENJDK9 {

	public void localvarGcTest1() {
		byte[] a  = new byte[6*1024*1024];
		System.gc();
	}
	public void localvarGcTest2() {

	}
	public void localvarGcTest3() {

	}
	public void localvarGcTest4() {

	}
	public void localvarGcTest5() {

	}
	
	public static void main(String[] args) {
		new ReadOPENJDK9().localvarGcTest1();
	}
}