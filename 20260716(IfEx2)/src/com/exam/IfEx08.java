package com.exam;
import java.util.*;
/*
 * 2차원 평면에서 직사각형을 나타내는 두점 x,y가 있다.
 * 직사각형 구성하는 두점 (x1,y1), (x2,y2)를 입력받아 (100,100)
 * (200,200)의 두 점으로 이루어진 직사각형
 * 충돌하는 프로그램을 만드시오
 * 
 * 아래의 메소드(함수를) 활용하시오.
 * public static boolean inRect(int x,int y, int rectx1, 
 * int recty1, int rectx2, int recty2) {
 * if((x>= rectx1&& x<=rectx2) &&(y> recty&&y<recty))
 * return true
 * else 
 * return false; 
 * 
 */
public class IfEx08 {

	public static void main(String[] args){
		
		public static boolean inRect(int x1, int y1, int x2, int y2)
		Scanner sc = new Scanner(System.in);
		

		
		System.out.print("x1 y1 x2 y2 입력 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		if
		(inRect(x1,y1,100,100,200,200)||
				inRect(x1,y1,100,100,200,200)||
				inRect(x1,y2,100,100,200,200)||
				inRect(x2,y1,100,100,200,200)
				//한꼭지점이라도 사각형안에 포함
				{
					System.out.println("사각형이 겹쳐있습니다");
				}
		
		else if
		(inRect(x1,y1,100,100,200,200)&&
				inRect(x1,y1,100,100,200,200)&&
				inRect(x1,y2,100,100,200,200)&&
				inRect(x2,y1,100,100,200,200)	&&
				// 모든 꼭지점이 사각형 안에
				{
					System.out.println("사각형이 겹쳐있습니다");
				}
			
		else if
		(inRect(100,100,x1,x2,y1,y2)&&
				inRect(100,200,x1,y1,x2,y2)&&
				inRect(100,200,x1,y1,x2,y2)&&
				inRect(100,200,x1,y1,x2,y2)	&&
				//사각형의 모든 꼭지점안에있는경우
				{
				System.out.println("사각형이 겹쳐있습니다");
				}
		else
			System.out.println("사각형이 겹치지 않습니다");
	}	
		
    
}
