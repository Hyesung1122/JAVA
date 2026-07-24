package com.arrayex;
/*
 * 2차원 배열
 * 배열선언:
 * 		자료형[][] 배열명; 또는 자료형 배열명[][]; 또는 자료형[] 배열명[];
 * 		자료형[][] 배열명 = new 자료형[행][열];
 * 
 * 		배열명 = new 자료형 [행][열];
 * 		배열명 = new 자료형[행][]; --> 가변배열, 레기드배열, 비정형 배열
 * 		배열의 초기화
 *		배열명 = {{1,2,3,4,5,},{1,2,3,4,5}}
 *		배열의 크기 = 행* 열
 *		 
 * 
 */

public class Arrayextwo {

	public static void main(String[] args) {
		// 방법1.
		// 배열선언
		int [][]arr1= new int[3][3];
		// 배열 초기화(값 할당)
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;
		
		// 배열에 저장된 값을 출력
		for(int i =0; i < arr1.length; i++)
		{
			//					행이 먼저.열의 길이
			for(int j = 0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		//방법2 
		int[][] arr2 = 
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11},
			};
		for(int i =0; i < arr2.length; i++)
		{
			for(int j = 0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//방
		int[][] arr3 = new int[3][3];
		int n = 1;

		for (int i = 0; i < arr3.length; i++)
		{
			for (int j = 0; j < arr3[i].length; j++)
			{
				arr3[i][j] = n;
				n++;
			}
		}
		
		for(int i = 0; i < arr3.length; i++)
		{
			for (int j = 0; j < arr3[i].length; j++) 
			{
				System.out.print(arr3[i][j] + "\t"); 
			}
			System.out.println(); 
		}
		
		
		
		
		
		
		
		
		
		
//		int n =1;//배열에 데이터 저장 (반복문)
//		for(int i =0; i < arr3.length; i++)
//		{
//			for(int j = 0; j<arr3[i].length; j++)
//			{
//				arr3[i][j] = n;
//				n++;
//			}
//			System.out.println();
//		}
//		//출력
//		for(int i =0; i < arr3.length; i++)
//		{
//			for(int j = 0; j<arr3[i].length; j++)
//			{
//				System.out.print(arr3[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	}

}
