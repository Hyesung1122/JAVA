package com.forexam;
import java.util.*;

/* 무한대로 정수를 입력받아 합을 구하는 프로그램 작성
 * 단, 0을 입력하면 프로그램을 종료하시오
 * 
 * 
 */

public class ForExam03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1,n2;
		
		// 무한대로 반복
		for ( ;  ; ) 
		{
			System.out.println("첫번째 정수 : ");
			n1 = sc.nextInt();
			
			//n1이 0이면 처음으로
			if(n1 == 0) return;
			
			System.out.println("두번째 정수 : ");
			n2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n\n",n1, n2,(n1+n2));
			
		}
		

	}

}
