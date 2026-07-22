package com.whileex;
import java.util.*;
/*-1^2 + 2^2 - 3^2 + 4^2 -5^2....+100^2의 합계
 * 의 프로그램 작성하시오.
 * 단 while 문 활용 
 *
 *
 *
 */
public class WhileEx08 {

	public static void main(String[] args) {
		
		int i=1 ,plus=1 ,sum=0;
		
		while(i<=100)
		{
			plus=-plus;
			sum +=plus*(i*i);
			i++;
			
		}
		System.out.println(sum);
		
		
	
		

	}

}
