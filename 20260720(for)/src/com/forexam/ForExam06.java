package com.forexam;
import java.util.*;

/* 계승을 계산하는 프로그램 작성
 *	n의 계승 n!를 계산
 *	n! = 1* 2* 3* ...... xn
 *
 *	결과
 *	정수 입력: 7
 *	7의 팩토리얼은 5040입니다.
 * 
 * 
 */

public class ForExam06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		int n, fac= 1;
		
		System.out.printf("정수n입력:");
		n=sc.nextInt();
		
		for (int i = 1; i<=n; i++)
		{
			fac *=i;			
		}
		
		System.out.printf(n+"의 팩토리얼은"+fac+"입니다.");
		
	}

}
