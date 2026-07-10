package com.ifexm;

import java.util.*;

/*
 *사용자로부터 이름, 국어, 영어, 수학 점수를 입력받아 
 *총점과 평균을 구한후 학점을 판정하는 프로그램을 작성하시오 
 * 
 *결과
 *이름 : 홍길동
 *국어	:	10
 *영어 :	10
 *수학 :	10
 * 당신의 이름은 홍길동이며, 총점은 30점이고, 평균은 10점입니다.
 * 학점은 F입니다.
 *
 */
public class ifEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, grade;

		int kor, eng, mat = 0;

		System.out.print("이름:");
		name = sc.next();

		System.out.printf("국어 점수 입력:");
		kor = sc.nextInt();
		

		System.out.printf("영어 점수 입력:");
		eng = sc.nextInt();

		System.out.printf("수학 점수 입력:");
		mat = sc.nextInt();

		// 변수를 먼저 받고 다른 변수 선언하기
		int sum = kor + eng + mat;
		int avg = sum / 3;

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("名前は" + name + "이고,　합은" + sum + "이고, 평균은" + avg + "점 입니다. 학점은" + grade + "입니다" + grade
				+ "입니다" + grade + "입니다" + grade + "입니다");
	}
}

