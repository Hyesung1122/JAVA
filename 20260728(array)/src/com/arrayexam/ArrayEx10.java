package com.arrayexam;
/*
 * 4x4의 2차원 배열을 만들고, 배열에 1~10 까지 10개만 랜덤으로 생성하여
 * 임의의 위치에 저장하라. 동일한 정수가 있어도 무방하다. 나머지 6개의 숫자는
 * 모두 0이다. 저장된 2차원 배열에 값을 출력하시오
 * 
 * 6 0 1 8
 * 1 3 7 0
 * 8 0 5 0
 * 1 0 4 0
 */

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {

		int arr[][]= new int[4][4];
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr[i].length; j++)
			{
			//0으로 초기화
			 arr[i][j] = 0;
			}
		}
		
		int n=0;
		while(n<10)
		{
			int r= (int)(Math.random()*4);//행
			int c= (int)(Math.random()*4);//열
			//배열에 저장된 값이 0이 아니면 이미 값이 저장되었기 때문에 건너뜀
			if(arr[r][c] !=0)
				continue;
			else 
			{
				arr[r][c]=(int)(Math.random()*9+1);
				n++;
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
