package com.operex;
import java.util.*;
//사용자로부터 임의의 정수를 입력받아
//양수인지 음수인지 0인지를 판정
public class OperExam04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=0;
		// result 변수를 생성
		String result;
		System.out.print("숫자를 입력:");
		num=sc.nextInt();
		
		//삼항연산자
		
					// 0보다 크면 true(양수)  false(음수, 0)
												//0보다 작으면 true(음수) false(0)
		result = (num>0) ? "양수" :(num<0)?"음수":"0";		
		
		System.out.print(result);
		

	}

}
