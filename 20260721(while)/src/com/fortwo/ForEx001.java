package com.fortwo;

public class ForEx001 {

	public static void main(String[] args) {
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println();
//		
//		for(int i =1 ; i <=5; i ++) 
//		{
//			System.out.println("**********");
//		}
//			
//	}
//	System.out.println();
//	for(int j =1; j<=10; j++)
//	{
//		//줄바꿈이 없음 옆으로 찍혀짐
//		System.out.print("*");
//	}
		for(int i =2 ; i <=9; i++)//행
		{
			for(int j =1 ; j <=10; j ++)//열
			{
				System.out.printf("%d*%d=%d\n",j,i,j*i);
			}
			System.out.println();// 열이 끝나고 줄을 바꾼다.
		
		}
		
		
		
		
		
		
		
}
	
	

}
