package com.arrayexam;
import java.util.*;
/*문제]
 * 		정수를 몇개 저장할지 키보드로부터 개수를 입력받아 정수 배열을 생성하고,
 * 		1에서 100까지의 범위의 정수를 랜덤하게 저장하여라.
 * 		배열에는 중복된 값을 저장할수 없도록 하여 출력하라
 * 		정수 몇개: 10
 * 		
 * 
 * 
 */

public class ArrayEx07 {
	
	
	
	

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 몇개");
		int n = sc.nextInt();

		int arr[]=new int[n];
		for(int i =0; i<arr.length;i++)
		{
			int r = (int)(Math.random()* 100+1);
			if (exists(arr,i,r))
			{
				i--;
				continue;
			}
			arr[i]=r;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(i==0)
				System.out.print(arr[i]+" ");
			else {
				if(i%10 ==0)
					System.out.println();
				System.out.println(arr[i]+" ");
			}
			
		}
		
		
	}
	public static boolean exists(int a[], int from, int r){
		for(int i= 0; i<from ;i++)
		{
			if(a[i] == r)
				return true;
		}
		return false;
	}
	
	}