package com.operex;
import java.io.*;
import java.util.*;
public class OperExam01 {

	public static void main(String[] args) throws IOException{
	
		// 버퍼(임시저장)에 저장하고 빠르게 읽음
//	BufferedReader br =
//												//byte를 문자로 바꿈   byte단위로 받음
//		new BufferedReader(new InputStreamReader(System.in));									
					
		
		
	// 스캐너 객체 생성	
	Scanner sc = new Scanner(System.in);
	
	//변수 선언	
	int a, b, c, d, e, f, g;
	
	//입력 처리
	System.out.print("첫번째 정수 입력:");
	a=sc.nextInt();
	//a=Integer.parseInt(br.readLine());
			
	System.out.print("두번째 정수 입력:");
	b=sc.nextInt();
	//b=Integer.parseInt(br.readLine());
	
	c = a+b;
	d = a-b;
	e = a*b;
	f = a/b;
	g = a%b;
	
	//결과 출력
	System.out.printf("%d + %d=%d%n",a, b, c);
	System.out.printf("%d - %d=%d%n",a, b, d);
	System.out.printf("%d * %d=%d%n",a, b, e);
	System.out.printf("%d / %d=%d%n",a, b, f);
	System.out.printf("%d %% %d=%d%n",a, b, g);
	
	
	
		

	}

}
