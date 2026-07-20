package com.forexam;
import java.util.*;

/* 사용자로부터 원하는 단을 입력받아 구구단을 출력하는 프로그램
 * 단 1~9까지의 수만 입력받는다. 범위를 벗어나면 종료한다.
 * 원하는 단 입력: 7
 * 7*1 = 7
 * 7*2 = 14
 * 7*3 = 21
 * 7*4 = 28
 * 7*5 = 35
 * 7*6 = 42
 * 7*7 = 49
 * 7*8 = 56
 * 7*9 = 63
 */

public class ForExam07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		int n=1;
		
		System.out.printf("원하는 단 입력:");
		n=sc.nextInt();
		
		if(n>=2&& n <=9)
		{
			for(int i = 1; 1<= 9; i++)
				System.out.println(n+"*"+i+"="+n*i);
		}
		else {
			System.out.println("범위를 벗어났습니다");
		}
		
		
	
	
		
	}

}

