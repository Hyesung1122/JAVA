package com.whileex;
import java.util.*;
/* 
 * 입력된 정수의 평균을 구하는 프로그램을 작성하시오
 * 입력할 정수의 개수를 입력받은 정수만큼의 평균을 출력한다
 * 입력받은 정수 값은 정수이지만, 평균값은 실수가 될 것이다.
 * 
 * 결과 
 * 정수의 개수: 4
 * 정수 입력: 2
 * 정수 입력: 7
 * 정수 입력: 2
 * 정수 입력: 4
 * 입력 정수의 평균: 3.75
 */
public class WhileEx06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0,i=1,n1,n2;
		float avg = 0.0f;
		
		System.out.print("정수의 갯수 입력:");
		n1= sc.nextInt();
		
		while(i<=n1)
		{
			System.out.print("정수입력:");
			n2=sc.nextInt();
			sum+=n2;
			i++;
		}
		
		avg= (float)sum/n1;
		System.out.printf("입력한 점수의 평균: %.2f", avg);	
	
		

	}

}
