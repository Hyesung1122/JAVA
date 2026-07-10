package com.ifexm;
import java.util.*;
public class ifEx02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=0;
		System.out.println("정수 입력하세요:");
		num=sc.nextInt();
		
		if(num % 2 == 0)
		
			System.out.println(num+"는 짝수");
		
		else
			System.out.println(num+"는 홀수");
		
		sc.close();
		
			
		
		
		
		
		

	}

}
