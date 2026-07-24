package com.arrayex;
import java.util.*;
/*
 * 2차원 배열을 활용하여 아래같이 출력되도록
 * 
 * 
 * 
 * 
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		String[][] words = 
			{
					{"chair","의자"},
					{"computer","컴퓨터"},
					{"integer","정수"}
			};
		Scanner sc=new Scanner(System.in);
	
			for (int i = 0; i < words.length; i++)
		{
				System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
				String str = sc.nextLine();
				if (str.equals(words[i][1]))
				{
					System.out.println("정답입니다.");
				}
				else
				{
					System.out.printf("틀렸습니다. 정답은%s입니다.\n",words[i][1]);
				}	
		}
		
		
		
		
	}

}
