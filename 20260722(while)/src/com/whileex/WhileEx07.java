package com.whileex;
import java.util.*;
/* 
 * 2의 승수를 입력하여 값을 구하는 프로그램을 프로그램을 구현하시오
 * 단 while 문을 활용하시오
 * 결과
 * 승수 입력 : 10
 * 2의 10승은 1024입니다
 * 
 * 
 */
public class WhileEx07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i=1,n,sum=1;
		
		
		System.out.println("승수 입력");
		n=sc.nextInt();
		
		while(i<=n)
		{
			sum*=2;
			i++;
		}
		System.out.println(sum);
	
		

	}

}
