package com.operEx01;

// 산술연산자 : +,-,*,/,%
public class OperEx03 {

	public static void main(String[] args) {
	
		int a = 10, b=4;
		
		System.out.printf("%d + %d= %d%n", a, b, a+b);
									//a 		 b		a+b 줄바꿈	
		System.out.printf("%d - %d= %d%n", a, b, a-b);
		System.out.printf("%d * %d= %d%n", a, b, a*b);
		System.out.printf("%d / %.1f= %.1f%n", a, (float)b, a/(float)b);
//											          소숫점이하 1자리까지 출력
//														f는 소숫점 6개까지 무조건 출력
		System.out.printf("%d %% %d= %d%n", a, b, a%b);
									//	   서식,기호
		
		

	}

}
