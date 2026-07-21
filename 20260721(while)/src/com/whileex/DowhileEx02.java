package com.whileex;
import java.util.*;

public class DowhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, sum = 0;
		char op=' ';
		System.out.println("첫번째 정수:");
		n1 = sc.nextInt();
		
		do 
		{
			System.out.print("연산자(+,-,*,/:");
			op = sc.next().charAt(0);
			
			// op가 +=*/가 아닐때 반복 
		}while(op!='+'&& op!='-'&& op!='*'&& op!='/');
		
		do
		{
		System.out.print("두번째 정수:");
		n2 = sc.nextInt();
		}
		//op가 /이고 n2가 0일때 반복
		while(op == '/' && n2 ==0);
		
		switch(op)
		{
		// n1 + n2 계산하고 빠져나감 
		case '+': sum = n1 +n2; break;
		case '-': sum = n1 - n2; break;
		case '*': sum = n1 * n2; break;
		case '/': sum = n1 / n2; break;
		}
		
		
		System.out.println(n1+" "+op+" "+n2+" = "+sum);
		
		

	}

}
