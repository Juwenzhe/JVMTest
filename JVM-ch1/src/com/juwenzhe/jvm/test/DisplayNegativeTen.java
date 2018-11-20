package com.juwenzhe.jvm.test;

/**
 * @author juwenzhe
 * @description 编程输出-10在JVM中的存储形式（即补码形式）
 * @date 2018年11月14日
 * --------------------------
 * @modifyauthor null
 * @modifydate null
 */
public class DisplayNegativeTen {

	public static void main(String[] args) {
		int a = -10;//首先要知道int是32位
		for(int i=32; i>0; i--) { 
			//运算顺序：淡云一笔，安洛三福
			int CurrentTemp = (a & 0x80000000 >>> (32-i)) >>> (i-1);
			System.out.print(CurrentTemp);
		}
		//对比一下
		System.out.println(Integer.toBinaryString(-10));
	}
}
