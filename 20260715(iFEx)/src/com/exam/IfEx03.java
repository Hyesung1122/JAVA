package com.exam;

import java.util.Scanner;

/*정수로 된 돈의 금액을 이어받아 오만원권, 만원권, 천원권, 500원짜리
 * 100원짜리 동전 , 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 
 * 동전의 각 몇개 인지를 변환하는 프로그램을 구현하시오,
 * 
 * 결과
 * 금액 입력:
 * 
 * 
 */

public class IfEx03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		int a,b,c,d,e,f ,won=0;
//		
//
//		System.out.print("금액 입력:");
//		won=sc.nextInt();
//		
//		a=won/50000;
//								//몫
//		System.out.println("5만원권"+a+"장");
//		
//		//나머지를 다시 나눔
//		
//		
//		b=won%50000/10000;
//		System.out.println("만원권"+b+"장");
//		
//		c=won%10000/1000;
//		System.out.println("천원권"+c+"장");
//		
//		d=won%1000/100;
//		System.out.println("100원동전"+d+"개");
//		
//		e=won%100/10;
//		System.out.println("10원"+e+"개");
//		
//		f=won%10/5;
//		System.out.println("5원"+f+"개");
//		
		
		int money=0;
		final int oman=50000;
		final int man=10000;
		final int cheon=1000;
		final int baek=100;
		final int ship=10;
		final int ill=1;
		int result = 0;
		
		System.out.println("돈 입력");
		money= sc.nextInt();
		
		
		
		result = money/oman;
		money = money %oman;
		if(result>0)
		{
			System.out.println("오만원권"+result+"매");
		}
			
		result = money/oman;
		money = money %oman;
		if(result>0)
		{
			System.out.println("오만원권"+result+"매");
		}
			
		result = money/man;
		money = money %man;
		if(result>0)
		{
			System.out.println("오만원권"+result+"매");
		}
			
		result = money/cheon;
		money = money %cheon;
		if(result>0)
		{
			System.out.println("천원권"+result+"매");
		}
		
		result = money/baek;
		money = money %baek;
		if(result>0)
		{
			System.out.println("100원 동전"+result+"개");
		}
		
		result = money/ship;
		money = money %ship;
		if(result>0)
		{
			System.out.println("10원 동전"+result+"개");
		}
			
		result = money/ill;
		money = money %ill;
		if(result>0)
		{
			System.out.println("1원 동전"+result+"개");
		}
			
		
		
		
	
		
		
		
			
			
		
		
	}

}
