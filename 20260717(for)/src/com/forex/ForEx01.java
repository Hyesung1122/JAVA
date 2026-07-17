package com.forex;

/*
 * for, while, do ~ while
 * 
 * for
 * - 처음부터 반복횟수를 알수 있는 경우
 * 
 * while 문과 do ~while 문은 
 * - 반복횟수를 알 수 없고 조건에 따라 반복이 계속되거나 중단되는 경우 사용
 * 
 * while : 반복 조건을 처음부터 따지는 경우
 * do ~ while : 반복 조건을 나중에 따지는 경우 
 * 
 * for 문 형식
 * for(초기값 ; 조건식 ; 증감식)
 * {
 * 		반복적으로 수행할 문장;
 * {
 * 
 * 1. 초기값은 
 * 		-조건식에서 사용하는 변수를 초기화한다.
 * 			.초기문은 시작할때 한번만 수행됨
 *			.콤마로 분리하여 여러 문장을 나열할 수있음
 *			.초기문은 빈상태로 두어도 되지만 끝에 세미콜론은 있어야한다
 * 2. 조건식
 * 			조건식에는 논리형 변수 논리연산을 사용함
 * 			조건식의 결과 true 면 반복이 계속되면,false 이면 for문을 벗어남
 * 문] 1 ~ 10 까지의 덧셈으로 표시하고 합계를 출력하는 프로그램을 구현하시오 
 * 		
 */
public class ForEx01 {

	public static void main(String[] args) {
		int sum=0;
		int i;
		for(i=1; i<=10; i++)
		{
			// sum에 i를 더하고 i가 1증가됨
			sum+=i;
			System.out.print(i+"\t");
			if(i<10)
				System.out.print("+");
			else
			{
				System.out.print("=");
				System.out.println(sum);
			}
				
			
			
		}
		//System.out.println(sum);
		
	}

}
