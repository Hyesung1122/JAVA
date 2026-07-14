package com.SwitchEx;
import java.util.*;
/*
 * 커피 메뉴의 가격을 알려주는 프로그램 구현하시오.
 * 에스프레소, 카푸치노, 카페라떼는 3500,
 * 아메리카노는 2000원 
 * 그 외 커피 메뉴 없습니다
 */
public class SwitchEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String order;
		System.out.print("커피 메뉴 입력: ");
		//String order= sc.next();
		
		order= sc.next();
		
		//int price=0;
		switch(order) {
			case "에스프레소": case"카푸치노": case"카페라떼":
			
				System.out.println("3500원 입니다");
				break;
			
			case "아메리카노":
			
			System.out.println("2000입니다");
			break;		
				
			default:
			System.out.println("메뉴에 없습니다.");
		}
//			switch(order) 
//			{
//			case "아메리카노":
//				price = 2000;
//				break;
//			
//			case "에스프레소": case "카푸치노": case "카페라떼":
//				price = 3500;
//				break;
//				
//			default:
//				System.out.println("메뉴에 없습니다.");
//				
//		}
//		
//
//		if (price != 0) {
//			System.out.println(order + "는 " + price + "원 입니다.");
		
		}
	}


