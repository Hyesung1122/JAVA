package com.operex;
import java.util.*;
public class Switchcase {

	
	
	//숫자 4개중에 switch, case를 사용
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//정수 num 선언
		int num;
		
		System.out.println("1~4중에 하나입력:");
		num= sc.nextInt();
		
		//switch 1~4중에 하나 입력하면 
		switch(num)
		{
			case 1:
				System.out.println("1을 입력했다");
			//
			break;
			
			case 2:
				System.out.println("2를 입력했다");
				
			break;
			
			case 3:
				System.out.println("3를 입력했다");
				
			break;
			
			case 4:
				System.out.println("4를 입력했다");
				
			break;
				
			
			default:
				System.out.printf( "???" );

		
		}
		
							
		
	}

}



