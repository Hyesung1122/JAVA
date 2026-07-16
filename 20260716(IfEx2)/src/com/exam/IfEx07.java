package com.exam;
import java.util.*;
/*
 * 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의
 * 두점으로 표현한다. (100,100)과 (200,200) 의 두 점으로 이루어진 사각형이 있을때
 * x,y값을 입력받고 점(x,y)가 이 직사각형안에 있는지를 판별하는
 * 
 * 
 */
public class IfEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y=0;
		
		System.out.println("x,y의 좌표 입력:");
		x=sc.nextInt();
		y=sc.nextInt();
//		
//		if (100<=x&&x<=200)
//		{
//			if(100<=y&&y<=200)
//				System.out.println("("+x+","+y+")"+"는 사각형안에있습니다");
//			else
//				System.out.println("벗어났습니다");
//		}
//		else
//			System.out.println("벗어났습니다");
		
		
		if((100<=x&&x<=200) && (y>=100&& y<=200))
			System.out.println("("+x+","+y+")"+"는 사각형안에있습니다");
		else
			System.out.println("("+x+","+y+")"+"는 사각형안에없습니다");
			
	}

}
