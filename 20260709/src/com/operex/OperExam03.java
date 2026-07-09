package com.operex;
import java.util.*;

//사용자로부터 임의의 정수를 입력받아 짝수인지 홀수인지를 판정하는 프로그램을작성하시오
//단 삼항연산자를 이용하여
public class OperExam03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num=0;
		// result 변수를 생성
		String result;
		System.out.print("숫자를 입력:");
		num=sc.nextInt();
		
		//삼항연산자
		//if else 와 같다
					//if문의 (조건)  //true //false
		result = (num%2==0) ? "짝수" : "홀수";
		
		System.out.println(num+"=>"+result);
		
		
				
//		if (num%2==0)
//
//			{
//				//true일때
//				result = "짝수";
//				System.out.println("짝수");
//			}
//		else
//			{
//				//false 일때
//				result ="홀수";
//				System.out.println("홀수");
//			}
		
	}

}




