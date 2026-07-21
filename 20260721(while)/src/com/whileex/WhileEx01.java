package com.whileex;

public class WhileEx01 {
/*while 문
 * 		1. for 문과 유사함. 특정 명령들을 반복적으로 처리
 * 		2. for 문은 반복횟수를 정확히 알고 있는 경우 사용, 
 * 			 while 문은 반복횟수를 정확히 알지 못할 경우
 * 		3. 무한 루프에 빠지기 쉽다.(주의)
 * 
 *  	형식
 *  	while(조건식)
 * 		{
 * 			반복수행 문장;
 * 		}
 * 1~100 까지의 합계를 구하시오
 *
 */
	
	public static void main(String[] args) {
	
	int i=1, sum= 0;	
	while(i<=100)//조건식
	{
		sum+=i;// 반복 수행문
		i++;// 증감식
	}
	System.out.println("1 ~ 100까지의 합계:"+sum);


	}

}
