package com.arrayex;
/* 1. 배열의 개념
 * 		- 배열은 같은 자료형 들끼리 모아두는 하나의 묶음이다.
 * 		- java에서 하나의 배열은 하나의 객체로 인식한다.
 * 	 	- 동일 자료형이 여러개 반복될때 이를 하나의 변수명으로 관리 하며,
 * 		 각각의 구분은 순차적인 첨자(인덴스)를 사용한다.
 * 		 인덱스의 시작은 무조건 0부터 시작한다.
 *  	 배열은 기본 자료형이 아닌 참조형 자료형이므로, 4byte 크기임
 *  
 * 2. 1차원 배열 
 * 		1차원 배열의 선언: int[] 배열명; 또는 int 배열명[];
 * 		배열의 초기화 : 배열명 = new 자료형 [개수];
 * 							배열명 = {값1,값2,값3};
 * 
 * 			new 연산자에 의해서 할당되면 자동으로 초기화된다. 
 * 
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		//이름이 ch인 char형 배열선언
		char[] ch;
		
		//배열을 4개로 초기화
		ch= new char[4];
		
		// 배열에 공간에 값을 저장(할당)
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A'; // 문자 4개를 ch 배열에 저장했다.
		
		//배열에 저장된 값을 출력
		for (int i=0; i<4; i++)
		{
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		//배열의 사용할때 반복문도 향상됨
		
		for ( char aa :  ch  )	
		{
			System.out.println("aa:"+aa);
		}

	}

}
