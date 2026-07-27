package com.arrayexam;
import java.util.*;
/*문제]
 * 		정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를
 * 		랜덤으로 생성하여 배열에 저장, 그 배열에 저장된 숫자들의 합과 평균을 
 * 		구하는 프로그램을 작성하시오.
 * 
 * 		1에서 10까지 범위 정수를 랜덤하게 생성하는 식
 * 		int i = (int)(Math.random()*10+1);
 * 		
 * 		
 * 
 * 
 * 
 */

public class ArrayEx06 {

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int arr[]= new int[10];
	int sum = 0;
	float avg=0.0f;
	
	for (int i =0; i<arr.length; i++)
	{
		arr[i] = (int)(Math.random()*10+1);
	}

	for (int i =0; i<arr.length; i++)
	{
		sum += arr[i];
		System.out.printf("%3d",arr[i]);
	}
	System.out.println();
	System.out.printf("합계 :%d%n",sum);
	avg= sum/(float)arr.length;
	System.out.printf("평균:%.2f",avg);
	
	
	
	}

}
