package com.forex;

/*
 * 문] 1 ~ 10까지의 합계를 구하되
 * 		1부터 10까지의 변화시키면 변수값과 합계에 대한 누적시킨 값을 출력하라.
 * 		1	1	=>1
 * 		1	2	=>3
 * 		1	3	=>6
 * 		1	4	=>10
 * 		
 */
public class ForEx03 {

	public static void main(String[] args) {
		//누적변수
		int sum= 0;
		
		for(int i =1; i<=10;i++)
		{
			sum+=i;
			System.out.printf("1부터 %2d까지의 합: %2d%n", i , sum);
		}
		
		
		
		
		
		
	}

}
