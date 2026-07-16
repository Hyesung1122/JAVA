package com.exam;

import java.util.Scanner;

/*
 * 세 과목을 점수를 입력받아 총점과 평균을 구하고
 * 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오
 * 학점은 평균이 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60이상이면 D
 * 	60 이하는 F로 처리하시오
 * 
 * 단, switch ~ case 문을 활용하시오.
 * 
 * 
 */

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				char grade;
				int kor, eng, mat ,sum =0;
				
				float avg = 0.0f;
				
						
				System.out.println("국어점수 입력");
				kor=sc.nextInt();
				System.out.println("영어점수 입력");
				eng=sc.nextInt();
				System.out.println("수학점수 입력");
				mat=sc.nextInt();
				
				sum = kor + eng + mat;
				
				//소수 계산하기 위해서 
				avg = sum /3.0f;
				
				
		//소수를 정수형으로 변환
		switch((int)avg/10) {
		
		case 9:	
		grade= 'A';
		break;
		
		case 8:
		grade= 'B';
		break;
		
		case 7:		
		grade= 'C';
		break;
		
		case 6:		
		grade= 'D';
		break;
		
		default: 
		grade= 'F';
		
		}
			
		System.out.printf("당신의 총점은 %d점이며" +
											//소숫점 2자리까지 출력
										"평균은 %.2f이고 학점은 %c입니다", sum,avg, grade);
		

		
		
	}

}
