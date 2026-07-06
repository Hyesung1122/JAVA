package com.operEx01;

public class OperEx07 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char)(c1+1);
		char c3 = 'a'+1;
		
		//2(char) + 4(int) byte = 4byte 
		

		
		int i = c1 + 1;// 97 + 1= 98
		
		c3 = (char)(c1+1);  //98=b
		c2++;
		c2++;
		
		System.out.println(i);
		System.out.println(c2);
		System.out.println(c3);

	}

}
