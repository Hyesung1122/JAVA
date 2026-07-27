package com.arrayexam;
import java.util.*;
/*정수로 된 돈의 금액을 이어받아 오만원권, 만원권, 천원권, 500원짜리
 * 100원짜리 동전 , 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 
 * 동전의 각 몇개 인지를 변환하는 프로그램을 구현하시오,
 * 
 * 결과
 * 금액 입력:
 * 
 * 
 */



public class ArrayEx05 {

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int[]unit = {50000,10000,1000,500,100,50,10,1};
	
	System.out.println("금액입력:");
	int money = sc.nextInt();

	for (int i = 0; i<unit.length; i++)
	{
		int result = money / unit[i];//동전 갯수
		
		if (result>0)
		{
			System.out.println(unit[i]+"원 짜리:"+result+"개");
			money %=unit[i];//남은돈
		}
	}
				
	
	
	
	}

}
