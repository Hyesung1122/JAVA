package com.whileex;
import java.util.*;
/*
 * 사용자로부터 하나의 숫자를 입력받은 다음 , 그 수만큼 4의 배수를 출력하는
 * 프로그램을 구현시오.
 * 정수 입력: 6
 * 4 8 12 16 
 * 
 * 
 */

public class DoWhileEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i=1,n=0, sum=0;
		System.out.println("정수입력");
		n=sc.nextInt();
		
		
		while(i<=n)
		{
			sum=i*4;
			i++;
			System.out.print(sum+"\t");
		}
		
		
		

	}

}
