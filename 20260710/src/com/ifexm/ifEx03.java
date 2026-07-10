package com.ifexm;
import java.util.*;
import java.util.Iterator;
//다중 if~ else
//	
//-if ~else 가 연속되는것을 의미한
//조건이 참인경우 달느 조건일 경우 다 조건식을 만든다.
/*형식
 * if(조건식1)
 * {
 * 		실행1
 * }
 * else if(조건식2)
 * {
 * 		실행2
 * }
 * else
 * {
 * 		위의 조건식이 모두 것짓일 경우 실행
 * }
 * 
 * a는 90점이상 , b는 80점 이상 , c는 70점 이상, d는 60점이상, f는 60점 이하 
 * 
 */
public class ifEx03 {

	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	//점수를 저장할 변수
	int score=0;
	
	//문자 하나(단어)만 받으므로
	char grade;
	
	System.out.println("점수 입력:");
	score=sc.nextInt();
	
	if(score>=90)
	{
		grade = '가';
	}
	else if(score>=80)
	{
		grade = '양';
	}
	else if(score>=70)
	{
		grade = '미';
	}
	else if(score>=60)
	{
		grade = '우';
	}
	else
	{
		grade = '수';
	}
	
	System.out.println("당신의 점수는"+score+"이고, 학점은"+grade+"입니다.");

	}

}
