package com.arrayexam;
import java.util.*;

/*	문]
 * 			양의 정수 10개를 입력받아 배열에 저장하고, 배열에 저장된 정수중 
 * 			3의 배수만 출력한는 프로그램을 작성하시오
 * 			
 * 			양의 정수 10개 입력: 1 5 99 22 345 15 154 
 * 			3의 배수는 99, 345, 2346
 *
 */


public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int[] arr= new int[10];
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("정수입력:");
			arr[i]=sc.nextInt();
		}
		System.out.println("3의 배수는");
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]%3==0)
			{
				System.out.print(arr[i]+"  ");
			}
		}
		
		
		
			
		
		
		

	}

}
