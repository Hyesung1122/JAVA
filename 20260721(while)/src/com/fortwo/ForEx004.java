package com.fortwo;

public class ForEx004 {

	public static void main(String[] args) {

//		for(char ch='a'; ch <='z'; ch++)
//		{
//			System.out.print(ch);
//		}
//		System.out.println();
//		
//		for(char ch =65; ch<=90; ch++)
//		{
//			System.out.print(ch);
//		}
//		System.out.println();
//		
//		for(char i =65; i<=90; i++)
//		{
//			System.out.print((char)i);
//		}
//		System.out.println();
		
		for(char a ='A'; a<='Z'; a++)
		{
			for(char b =a; b<='Z'; b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}

		for(char a ='A'; a<='Z'; a++)
		{
			for(char b =0; b<=(a-65); b++)
			{
				System.out.print("  ");
			}
			for(char b =a; b<='Z'-(a-65); b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	

}
