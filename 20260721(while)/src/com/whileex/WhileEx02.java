package com.whileex;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("첫번째 정수:");
			int a = sc.nextInt();
			System.out.print("두번째 정수:");
			int b = sc.nextInt();
			System.out.printf("%d + %d = %d\n",a,b,(a+b));
			
			System.out.println("계속진행하시겠습니까?(y/n)");
			char ch = sc.next().charAt(0);
			if(ch=='N' || ch == 'n')
				break;
		}
	

	


	}

}
