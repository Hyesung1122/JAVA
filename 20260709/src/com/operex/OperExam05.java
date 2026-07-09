package com.operex;

public class OperExam05 {

	public static void main(String[] args) {
		int a=7, b=3, imsi;
		
		System.out.println("바꾸기 전 => a="+a+", b="+b);
//		//swap 연산 처리
//		
//		//imsi 7이 들어감
//		imsi =a;
//		
//		// a에 3이 들어감
//		a=b;
//		
//		//b에 imsi"7"이 들어감
//		b=imsi;
		
		
		// xor 연산처리
		// 2진수 변환후 xor연산 ( 같으면 0 다르면 1)
		a= a^b;
		b= b^a;
		a= a^b;
		
		System.out.println("바꾸기 후=> a=" +a+",b="+b);
	}

}
