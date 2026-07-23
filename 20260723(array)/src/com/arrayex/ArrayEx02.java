package com.arrayex;

public class ArrayEx02 {

	public static void main(String[] args) {
		//배열 선언 및 초기화
		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		int arr2[] = {1,2,3,4,5,6,7,8,9,0};
		
		//arr = new int[10]
		System.out.println("배열의 개수 (크기) :"+arr.length);
		System.out.println("배열의 개수 (크기) :"+arr2.length);
		
		//배열에 저장된 값 출력
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("arr["+i+"]:"+arr[i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.printf("arr2[%d]: %d\t", i, arr2[i]);
		}
	}

}
