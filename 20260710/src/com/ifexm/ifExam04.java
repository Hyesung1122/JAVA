package com.ifexm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
///*
// * 사용자로부터 임의의 두 정수와 연산자를 입력받아
// * 해당 연산자를 처리하는 프로그램을 작성하시오.
// * 단, 모두 수는 정수 처리하시오.
// * 입력은 BufferedReader

// * 출력
// * 첫번 째 수: 10
// * 연산자[+-*/%]:+
// * 두번 째 수 : 14
// * 10 + 14 = 24

public class ifExam04 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int n2,n1,result;
		char op;
		System.out.print("첫번째 수:");
		n1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자:");
		op = (char)System.in.read();
		//엔터 넣기
		System.in.skip(2);
		
		System.out.print("두번째 수:");
		n2 = Integer.parseInt(br.readLine());
		
		if(op=='+')
		{
			result = n1 +n2;
			//System.out.println(n1+" "+op+" "+n2+" = "+result);
			System.out.printf("%d%c%d=%d", n1, op, n2, result);
		}
		
		else if(op=='-')
		{
			result = n1 -n2;
			//System.out.println(n1+" "+op+" "+n2+" = "+result);
			System.out.printf("%d%c%d=%d", n1, op, n2, result);
		}

		else if(op=='*')
		{
			result = n1 *n2;
			//System.out.println(n1+" "+op+" "+n2+" = "+result);
			System.out.printf("%d%c%d=%d", n1, op, n2, result);
		}
		
		else if(op=='/')
		{
			result = n1 /n2;
			//System.out.println(n1+" "+op+" "+n2+" = "+result);
			System.out.printf("%d%c%d=%d", n1, op, n2, result);
		}
		
		else if(op=='%')
		{
			result = n1 %n2;
			//System.out.println(n1+" "+op+" "+n2+" = "+result);
			System.out.printf("%d%c%d=%d", n1, op, n2, result);
		}
			
		else
		{
			System.out.println("잘못입력하셨ㅅ브니다");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
