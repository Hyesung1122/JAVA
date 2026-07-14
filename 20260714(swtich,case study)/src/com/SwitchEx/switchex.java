package com.SwitchEx;

import java.util.*;

///*사용자로부터 임의의 두 정수와 연산자를 입력받아
// * 해당 연산자의 처리 결과를 출력하는 프로그램을 구현하세요.
// * 단 switch~case 문으로 구현하시요.
// * 
// * 실행 결과
// * 첫번째 정수:
// * 연산자 입력[+-*/%]:
// * 두번째 정수:
// * 연산자 입력
// */
public class switchex {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2 =0;
		int result=0;
		// 연산자
		char op;
		
		System.out.println("첫번째 정수 입력:");
		num1=sc.nextInt();
		System.out.println("연산자 입력[+-*/%]");
		op=sc.next().charAt(0);
		System.out.println("두번째 정수 입력:");
		num2=sc.nextInt();
		
		//연산자를 조건으로 
		switch(op)
		{
		case '+':
			result = num1 + num2;
			break;
		
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
		case '%':
			result = num1 % num2;
			break;
			
		default :
			System.out.println("연산자가 아닙니다.");
			return;
		
		}
		System.out.println("결과는: "+result);
		
		//연산자를 조건으로 
//		switch(op)
//		{
//		case '+':
//			System.out.println(num1+num2);	
//			break;
//		
//		case '-':
//			System.out.println(num1-num2);	
//			break;
//			
//		case '*':
//			System.out.println(num1*num2);	
//			break;
//			
//		case '/':
//			System.out.println(num1/num2);	
//			break;
//			
//		case '%':
//			System.out.println(num1%num2);	
//			break;
//		
//		}
		
		
	}
}
