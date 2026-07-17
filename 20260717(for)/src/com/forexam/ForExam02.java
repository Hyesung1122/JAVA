package com.forexam;
import java.util.*;
/* 문] 
 * 		양의 실수만 입력받아 입력받은 수의 평균을 구하는 프로그램을 출력
 * 		단 음의 실수는 입력되면 계산하라. 
 * 		=> 음의 실수가 입력되면 종료하고 양의 실수 값만 계산하여 평균을 구한다.
 * 
 * 
 */

public class ForExam02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		
		
		float total, input;
		
		//몇번 입력했는지
		int cnt=0;
		
		//같은 자료형은 한번에 초기화가능
		total= input = 0.0f;
		
		for( ; input>=0.0; )
		{
			//input값을 더함
			total +=input;
			
			// 실수 입력받으면
			System.out.print("양의실수:");
			input = sc.nextFloat();
			
			// cnt 하나 증가시키고 다시 반복됨
			cnt++;
		}
		//음의 실수가 for문을 벗어나서 평균 계산
		System.out.println("현재까지의 평균은"+total/cnt+"입니다.");
		
		
		
	}

}
