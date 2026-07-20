package com.forexam;
import java.util.*;

/* 3의 승수를 입력하여 값을 구하는 프로그램을 작성하시오
 * 결과
 * 승수 입력: 5
 * 3의 5승은 243입니다.
 * 
 */

public class ForExam04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//0으로 초기화하면 0으로 나옴
		int n,multi= 1;
		
		System.out.println("승수 입력 : ");
		n=sc.nextInt();
	
		for (int i = 1; i<=n; i++ ) 
		
			multi*= 3;
		
			System.out.printf("3의"+n+"승은"+multi+"입니다");
	
			
	
		
	}

}
