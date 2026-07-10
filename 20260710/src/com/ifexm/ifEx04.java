package com.ifexm;
import java.util.*;
import java.util.Scanner;

/* 중첩 if 
 * -if 문 안에 if 문을 포함하고 있는 문장을 의미함
 * 
 * 형식
 * if(조건이 참)
 *			조건이 참일대 안쪽 if문 수행
 * {
 * 		if(조건식)
 * 		{
 * 			조건이 참일때
 * 		}
 * 
 * 		else
 * 		{
 * 			조건이 거짓 일 때
 * 		}
 * }
 * 
 * 		else
 * 		{
 * 			조건이 거짓일때
 * 		}
 * 
 * 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
 * 단 학년이 4학년일 경우 70점 이상이어야 합격
 * 
 */
public class ifEx04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int score, year;
		
		System.out.println("점수:");
		score= sc.nextInt();
		
		System.out.println("학년:");
		year= sc.nextInt();
		
		// 60점 이상이면 합격
		if (year>60)
		{
			// 4학년이면 
			if(year !=4)
			{
				System.out.println("합격");
			}
			// 70점 이상이면 합격
			else if(score >= 70)
			{
				System.out.println("합격");
			}
			else
			{
				System.out.println("불합격");
			}
		}
		else
		{
			System.out.println("불합격");
		}
		
			
	}

}
