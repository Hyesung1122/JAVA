package com.operex;
import java.util.*;
//이름, 국어, 영어, 수학 점수를 입력받아
//총점을 구하여
public class OperExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//과목 점수들 저장할 변수
		int kor, eng, mat, hap = 0;
		
		// 이름을 저장할 변수
		String name;
		
		System.out.print("이름:");
		//name = sc.next();
		//"Seaul Korea"와 같이 공백이 들어간 문자열을 입력받을 때는
		//nextLine을 이용하고, next()메소드로는 공백이 낀 문자열을 
		// 읽어 들일 수 없다. 공백 전까지만 읽는다
		name = sc.nextLine();
		
		
		System.out.print("국어:");
		kor = sc.nextInt();
		
		System.out.print("영어:");
		eng = sc.nextInt();
		
		
		System.out.print("수학:");
		mat = sc.nextInt();
		
		//각 과목 합계 계산
		hap= kor + eng + mat;
		System.out.println("합계:"+hap);
		
		System.out.println("이름은"+name+"이며, 총점은"+ hap+"입니다");
		sc.close();

	}

}
