package com.whileex;
import java.util.*;
/* 사용자가 입력하는 정수를 계속해서 더함 
 * 만약 0이 입력되면 지금까지 입력한 정수의 합계를 
 * 출력하는 프로그램을작성하시오. 
 * 
 * 
 */
public class WhileEx05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0,n;
		
		while(true)
		{
			System.out.println("정수입력(0->종료):");
			n=sc.nextInt();
			sum += n;

			if(n==0)
				break;
		}
		System.out.println("정수들의 합계"+sum);
		
//		while(n!=0)
//		{
//			System.out.println("정수입력(0->종료):");
//			n=sc.nextInt();
//			sum += n;
//		}
//		System.out.println("정수들의 합계"+sum);
		

	}

}
