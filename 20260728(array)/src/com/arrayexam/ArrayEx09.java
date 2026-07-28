package com.arrayexam;
/*
 * 4x4의 2차원 배열을 만들고, 배열에 1~10 까지 정수를 랜덤으로 저장하고
 * 배열에 정수 16개를 출력하는 프로그램을 작성하시오.
 * 6 10 1 8
 * 1 3 7 2
 * 8 4 5 1
 * 1 8 4 4
 */

import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {

		int arr[][]= new int[4][4];
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr[i].length; j++)
			{
			 arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr[i].length; j++)
			{
			System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
