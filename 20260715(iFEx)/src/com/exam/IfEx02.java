package com.exam;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
//	문]
//		2자리 정수(10~ 99)를 입력받고, 십의 자리와 1의 자리가 
//		1의 자리가 같은지를 판별하는 프로그램을 구현하시오 
//		
//		결과
//		2자리 정수 입력 : 77
//		10의 자리와 1의 자리가 같습니다.
		
		Scanner sc= new Scanner(System.in);
		int n1=0;


		System.out.print("정수입력:");
		n1=sc.nextInt();
		
		
		if(n1<100)
		{
			if (n1/10==n1%10)
			{
				System.out.println("같습니다");
			}
			else
			{	
				System.out.println("틀립니다.");
			}	
		}
		else 
			System.out.println("10의 자리 정수가 아닙니다");

	}

}
