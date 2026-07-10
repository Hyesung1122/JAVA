package com.ifexm;

import java.util.*;

/*
 * 사용자로부터 임의의 연도를 입력받아 윤년인지, 평년인지를 판별하는 프로그램 구현하시오.
 * 
 */
public class ifExam03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year=0;
		
		String str;
		
		System.out.println("년도 입력:");
		year=sc.nextInt();
		
//		//먼저 4로 나누어 떨어지고,
//		if (year%4==0)
//			
//		{	
//			//400으로 나누었을때 나머지가 0이면
//			if (year%400==0)
//			{
//				System.out.println("윤년");
//			}
//			
//			//100으로 나누었을때 나머지가 0이 아니면
//			else if (year%100!=0)
//			{
//				System.out.println("윤년");
//			}
//			
//			//나머지는 아님
//			else
//			{
//				System.out.println("아님");
//			}
//	
//		}
//		//
//		else
//		
//		{
//			//나머지는 아님
//			System.out.println("아님");
//		}
		
		
//		if((year % 4== 0)%%(year%100!=0)||(year%400==0))
//		{
//			System.out.println(윤년);
//		}
//		else
//		{
//			System.out.println(윤년);
//		}
		
		
		
		str = ((year % 4== 0)&&(year%100!=0)||(year%400==0))?"윤년":"평년";
		System.out.println(year+"년은"+str);
	}

}
