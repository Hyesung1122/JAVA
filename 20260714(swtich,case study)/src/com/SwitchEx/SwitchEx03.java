package com.SwitchEx;
import java.util.*;
public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("주민변호 입력:");
						//7번째 숫자로 성별 구별
		char jumin=sc.next().charAt(7);
		
		switch(jumin)
		{
		case '1': case '3':
			System.out.println("남성 입니다.");
			break;
			
		case '2': case '4':
			System.out.println("여성입니다.");
			break;
		
		}
		

	}

}
