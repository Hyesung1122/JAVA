package com.arrrayextwo;
/*3차원 배열
 * 면, 행, 열로 이루어진 배열
 * 배열 선언
 * int [][][]arr = new int[2][3][4];
 * 
 * 면:2, 행:3, 열:4
 * 배열의 크기 :면*행*열=>24
 * 
 */
public class ArrayEx07 {

	public static void main(String[] args) {
	int [][][] arr= new int[2][3][4];
	int v=1;
	for(int k =0; k < arr.length; k++) 
	{
		for(int i =0; i < arr[k].length; i++)
		{
			for(int j =0; j < arr[k][i].length; j++)
			{
				arr[k][i][j]=v++;
			}
		}
	}
	
	
	
	for(int k =0; k < arr.length; k++) 
	{
		for(int i =0; i < arr[k].length; i++)
		{
			for(int j =0; j < arr[k][i].length; j++)
			{
				System.out.printf("%3d",arr[k][i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
		
	
	}

}
