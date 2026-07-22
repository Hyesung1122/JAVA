package com.whileex;
import java.util.*;



public class DoWhileEx04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,i=1;
		
		System.out.println("숫자 입력");
		n=sc.nextInt();
		
		do
		{
			System.out.print(i*4+"\t");
			i++;
		}while (i<=n);
		

	}

}
