package com.ifexm;
import java.util.*;
/*
 * 임의의 정수를 입력받아 입력받은 정수가 짝수 인지, 홀수 인지,0인지, 아니면 판독 불가인지\
 * 
 * 판정하는 프로그램을 작성 하시오.
 * 
 * 
 */
public class ifExam02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//변수 num 생성, 초기화
		int num=0;
		
		//변수 문자 result 생성
		String result;
		System.out.print("숫자를 입력:");
		num=sc.nextInt();
		
		// 나머지가 0일때
		if (num==0)
			{
				System.out.println("0");
			}	
		
				// 나머지가 0이 아닐때
		else if(num%2 !=0)
			{
				System.out.println("홀수");
			}
		// 나머지가 0일때
		else if (num % 2 == 0) 
		{
		    System.out.println("짝수");
		}
		    //그 이외 확인불가
		else 
		{
			System.out.println("확인불가");
		}
		
		}
	

	}


