package com.forexam;
import java.util.*;

/*사용자로부터 임의 정수를 입력받아 1부터 입력받은 정수까지의 
 * 전체의 합계, 짝수의 합계, 홀수의 합을 각각 출력하시오.
 * 단, 10단위로 출력하시오.
 * 
 * 정수 입력: 59
 * 1~10까지의 전체 합:
 * 1~10까지의 짝수 합:
 * 1~10까지의 홀수 합:
 * 
 * 1~20까지의 전체 합: 
 * 1~20까지의 짝수 합: 
 * 1~20까지의 홀수 합:
 *  
 * 1~30까지의 전체 합: 
 * 1~30까지의 짝수 합: 
 * 1~30까지의 홀수 합: 
 * 
 * 1~59까지의 전체 합: 
 * 1~59까지의 짝수 합: 
 * 1~59까지의 홀수 합: 
 */

public class ForExam08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		int n,sum = 0,odd = 0,even =0;
		
		System.out.printf("n입력:");
		n=sc.nextInt();
		
		
		for (int i=1; i<=n; i++) 
		{
			sum+=i;
			if (i%2==0)
			{
				even +=i;
			}
				else
				{
					odd+=i;
				}
		
		if (i ==n)
		{
			System.out.println("1~"+i+"까지의 전체의 합:" +sum);
			System.out.println("1~"+i+"까지의 짝수의 합:" +even);
			System.out.println("1~"+i+"까지의 홀수의 합:" +odd);
		}
		else if (i%10==0)
		{
			System.out.println("1~"+i+"까지의 전체의 합:" +sum);
			System.out.println("1~"+i+"까지의 짝수의 합:" +even);
			System.out.println("1~"+i+"까지의 홀수의 합:" +odd);
			System.out.println();
		}
		}
			
	
		
	}

}

