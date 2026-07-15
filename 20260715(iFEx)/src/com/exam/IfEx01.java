package com.exam;
import java.util.*;
/*	문]
 *     원화를 입력받아 달러로 바꾸어 주는 프로그램을 구현하시오
 *     1$=1400
 * 
 *		원화 입력: 4200
 *		4200원은 $3.0입니다. 
 * 		
 */

public class IfEx01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		float won, bull=0;
//		
//		System.out.print("원화입력:");
//		won=sc.nextInt();
//		
//		bull= won/1400;
//		
//		System.out.println(won+"원은 $"+bull+" 입니다");
		
//		final: 변수 값을 고정값으로 저장함
		
		final double rate =1400.0;
	
		System.out.println("원화를 입력해주세요");
		int won=sc.nextInt();
		
		double dollor =won / rate;
		System.out.println(won+"원은 $"+dollor+"입니다.");
		
		
	}

}
