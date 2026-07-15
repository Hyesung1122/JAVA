package com.exam;

import java.util.Scanner;

/*
 * 삼각형의 길이를 나타내는 정수 3개를 입력받고
 * 이 3개의 정수로 삼각형을 만들 수 있는 지를 판별 하는 프로그램 작성
 * 
 * 두변의 합이 다른 한변의 길이보다 커야함
 * 
 */
public class ifEx05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a, b, c=0;
		
		System.out.println("첫번째 변:");
		a=sc.nextInt();
		
		System.out.println("두번째 변:");
		b=sc.nextInt();
				
		System.out.println("세번째 변:");
		c=sc.nextInt();

		//두변의합이 나머지 변보다 클때 
		if (a+b>c||a+c>b||b+c>a)
		{
			System.out.println("삼각형입니다.");
		}
		else
			System.out.println("삼각형이 아닙니다");
	}

}
