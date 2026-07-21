package com.whileex;
import java.util.*;

public class DowhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum = 0;
		float avg = 0.0f;
		
		do
		{
			System.out.println("국어 점수:");
			kor =sc.nextInt();
		}
		while(kor < 0||kor>100);
		
		do
		{
			System.out.println("영어 점수:");
			eng =sc.nextInt();
		}
		while(eng < 0||eng>100);
		
		do
		{
			System.out.println("수학 점수:");
			mat =sc.nextInt();
		}
		while(mat < 0||mat>100);
		
		sum = kor + eng + mat;
		
		avg = sum/3.0f;
		
		System.out.println("총점:" +sum);
		System.out.printf("평균:%.2f",avg);
	


	}

}
