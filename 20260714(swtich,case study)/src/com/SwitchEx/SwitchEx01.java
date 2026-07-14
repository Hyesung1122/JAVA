package com.SwitchEx;

import java.util.Scanner;

//1. 다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 여러개의 처리문을 한번에 수행한는데 유용하다
//2. if문은 조건값이 boolean형이다.
//3. long, string, boolean, float, double형은 사용안함
//4. 인자값 비교값이 일치하지 않으면 default문을 실행함
//주의사항
//case문 뒤에 오는 고건값이 중복되지않도록 해야함

/*형식
 * switch(인자값) {
 *case 조건 1 : 수행문장(처리문) : break;
 *case 조건 2: 수행문장 (처리문) : break;
 *case 조건 3: 수행문장 (처리문) : break;
 *default : 수행문장; break; 생략가능 
 *
 *문]
 * 현재 몇월인지를 입력받아 해당하는 계절을 출력하는 프로그램을 규현하시오
 */

public class SwitchEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력: ");
		
		int month = sc.nextInt(); 
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				
				// break를 만나면 남은 case를 확인 안하고 switch 밖으로 빠져나감
				break;
				
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
				
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
				
			case 12: case 1: case 2:
				System.out.println("현재 계절은 겨울입니다.");
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		
//		if (month == 3 || month == 4 || month == 5) 
//		{	
//			System.out.println("현재 계절은 봄입니다.");
//		}
//		
//		else if (month == 6 || month == 7 || month == 8) 
//		{
//			System.out.println("현재 계절은 여름입니다.");
//		}
//		
//		else if (month == 9 || month == 10 || month == 11) 
//		{
//			System.out.println("현재 계절은 가을입니다.");
//		}
//		
//		else if (month == 12 || month == 1 || month == 2) 
//		{
//			System.out.println("현재 계절은 겨울입니다.");
//		}
//		else 
//		{
//			System.out.println("잘못된 입력입니다. (1~12월만 입력해주세요)");
//		}
		
		sc.close(); 
	}
}