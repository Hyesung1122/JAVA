package com.exam;

import java.util.Scanner;
/*
 * 원의 중심을 나타내는 한점과 반지름을 입력받는다.
 * 두개의 원을 입력 받고 두 원이 서로 겹치는지 판별
 * 
 */

public class IfEx10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				System.out.println("첫번째원의 중심과 반지름입력:");
				
				double x1=sc.nextDouble();
				double y1=sc.nextDouble();
				double r1=sc.nextDouble();
				
				System.out.println("첫번째원의 중심과 반지름입력:");
				double x2=sc.nextDouble();
				double y2=sc.nextDouble();
				double r2=sc.nextDouble();
				
				double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				
				double rsum = r1 + r2;
						
				if(distance < rsum)
				{
					System.out.println("겹칩니다");	
				}
				else
				{
					System.out.println("안겹칩니다");	
				}
					

	}

}
