package com.exam;

import java.util.Scanner;

/*
 * 정수 3개를 입력받고 3개의 숫자 중
 * 중간 크기의 수를 출력하는 프로그램을 구현하시오.
 * 
 * 출력결과
 * 첫번째 수 : 20
 * 두번째 수 : 100
 * 세번째 수 : 33
 * 중간 값은 33
 * 
 */
public class ifEx04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1, n2, n3 ,middle, median=0;
		
		System.out.println("첫번째 수:");
		n1=sc.nextInt();
		
		System.out.println("두번째 수:");
		n2=sc.nextInt();
				
		System.out.println("세번째 수:");
		n3=sc.nextInt();

//		if (n1>n2)
//		{
//			middle = n2;
//		}
//		
//		if (n2>n3)
//		{
//			middle = n2;
//		}else 
//		{
//			middle = n3;
//		}
//		System.out.println(middle);
//		
		
		if ((n1 >= n2&&n1 <=n3)||(n1>= n3&& n1 <= n2))
			median = n1;
		else if	((n2 >= n1&&n2 <=n3)||(n2>= n3&& n2 <= n1))
			median = n1;
		else
			median = n3;
		
		System.out.println(median);
	}

}
