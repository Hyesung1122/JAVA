package com.arrayexam;
import java.util.*;

/*	문]
 * 			알파벳 소문자를 하나 입력 받아 아래와 같이 출력하는 프로그램을 구현하시오.
 * 			알파벳 소문자 : e
 * 			
 *
 *
 *
 *
 *
 */


public class ArrayEx03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	
		System.out.println("알파벳입력:");
		char ch=sc.next().charAt(0);
		
		for (char i=ch; i>='a'; i--)
		{
			for (char j='a'; j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		

	}

}
