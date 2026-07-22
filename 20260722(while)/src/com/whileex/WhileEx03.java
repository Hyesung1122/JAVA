package com.whileex;
import java.util.*;
/*
 * 사용자로부터 숫자 하나 입력받아서, 그 수 만큼" i love you"를 출력하는 프로그램을 구현하시오
 * 단 while 문을 사용
 * 
 * 결과
 * 숫자 입력: 6
 * i love you!!
 * 
 * 
 */

public class WhileEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,i=1;
		
		System.out.println("숫자 입력");
		n=sc.nextInt();
		
		while (i<=n)
		{
			System.out.println(i+ "love");
			i++;
		}
		

	}

}
