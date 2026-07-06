package com.operEx01;

public class OpenEx06 {

	public static void main(String[] args) {
		// 사칙연산의 피연산자는 숫자뿐이 아닌 문자도 가능하다
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two ='2';
		
		System.out.printf("'%c'-'%c' = %d%n",d,a,d-a);
		System.out.printf("'%c'-'%c' = %d%n",two, zero,two-zero);
		//												50-48 문자형식도 가능 
		System.out.printf("'%c'= %d%n",a, (int)a,);
		System.out.printf("'%c'= %d%n",a, (int)d);
		System.out.printf("'%c'= %d%n",zero,(int)zero);
		System.out.printf("'%c'= %d%n",two,(int)two);
		
	}

}
