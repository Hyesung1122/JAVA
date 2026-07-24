package com.arrayex;
/*
 * 2차원 배열을 활용하여 아래같이 출력되도록
 */
public class ArrayEx {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int n=1;
		for (int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				
						arr[i][j]=n++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
			
		
		
		
	}

}
