package com.arrayexam;
import java.util.*;

/*
 * 문2]
 * 		정수를 입력받고 아래와 같이 *을 출ㄹ겨하는 프로그램을 
 * 		정수입력 :5
 */


public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	
		System.out.println("정수입력:");
		int n=sc.nextInt();
		
		for (int i=n; i>0; i--)
		{
			for (int j=0; j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}
