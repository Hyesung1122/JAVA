package com.operEx01;

public class OperEx05 {

	public static void main(String[] args) {
		int a= 1_000_000; // 백만 : 1,000,000
		int b= 2_000_000; // 이백만 : 1,000,000
		
		// int = (int*int) = > 결과가 int형이기 때문에 (-14547599336)
		
		// 변수 a 또는 b의 타입을 long으로 형변환 해야한다.
		//int= int*int
		
		//long c = (long)a*b;
		long c = 1000000L*b;
		//long c = a*2000000L;
		
		System.out.println(c);		
		//long c= a*b;
		//형변환 해야함
		
		long k = 1_000_000*1_000_000;
		// long 형변환 없어서 오버플로우됨 int계산되어서
		long m = 1_000_000*1_000_000L;
		System.out.println(k);
		System.out.println(m);
		


	}

}
