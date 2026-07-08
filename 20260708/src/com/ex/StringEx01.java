package com.ex;

public class StringEx01 {

	public static void main(String[] args) {
		String str1= "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\",?%b%n","abc"=="abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");
		
		// 다른 이유? 내용은 같지만 서로 다른 객체로 인식하기 때문
		
		System.out.printf("str1.equals(\"abc\")? %b%n",str1.equals("abc"));
											//equals안에 있는 문자열과 비교
		System.out.printf("str2.equals(\"abc\")? %b%n",str2.equals("abc"));
											//
		System.out.printf("str2.equalsIgnoreCase(\"abc\")? %b%n",
									str2.equalsIgnoreCase("abc"));
	}

}
