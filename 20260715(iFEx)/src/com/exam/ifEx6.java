package com.exam;

import java.util.Scanner;

/*3, 6, 9 게임을 구현 하시오.
 * 1 ~99 까지의 정수를 입력받고 3, 6, 9중 하나가 있는 경우는 
 *	 박수짝을 출력하고, 두개 있는 경우는 박수짝짝을 출력 
 *
 *13 = > 박수짝
 *36 => 박수짝
 *	1~ 99 사이의 정수 입력: 36
 *박수 작짝 
 * 
 * 
 */
public class ifEx6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int a=0;
		
		
//		System.out.println("정수 입력");
//		a=sc.nextInt();
//		
//
//		if (a<100)
//		{
//			if (a/10==3 || a/10==6 || a/10==9)
//			{
//				System.out.print("짝");
//			}
//			else
//				System.out.print("");
//				
//			if (a%10==3 || a%10==6 || a%10==9)
//			{
//				System.out.print("짝");
//			}
//			else
//				System.out.print("");
//		}
//		
//		else 
//		{
//			System.out.print("숫자의 범위가 벗어났습니다.");
//		}
		System.out.print("1~99 사이의 정수 입력 : ");
		int n = sc.nextInt();
		
		if (n >= 1 && n <= 99) {

		    int sib, il, cnt = 0;
		    //sib 10의 자리수 : 몫
		    sib = n / 10;
		    
		    // il 일의자리수 :나머지
		    il = n % 10;
		    
		    // sib 0이 아니고 sib은 3이면
		    if (sib != 0 && sib % 3 == 0)
		    	
		    // 박수 카운트 1늘리고 
		        cnt++;

		    if (il != 0 && il % 3 == 0)
		        cnt++;

		    // 박수 카운트가 2이면
		    if (cnt == 2)
		        System.out.println("박수짝짝");
		    
		    //박수 카운트가 1이면
		    else if (cnt == 1)
		        System.out.println("박수짝");
		    else
		        System.out.println("박수 없음");

		} else {
		    System.out.println("숫자의 범위가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
