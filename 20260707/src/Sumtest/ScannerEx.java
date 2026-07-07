package Sumtest;

import java.util.Scanner;
//자바가 제공하는 Scanner class를 사용

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 												키보드에 입력
		
        System.out.print("a 입력하세요: ");
        int a = sc.nextInt();
       // Scanner 가 가진 메소드 -> 정수로변환시켜줌
        	

        System.out.print("b 입력하세요: ");
        int b = sc.nextInt();
        
        
        int sum= a+b;
        //a+b의 결과값을 sum에 저장
        
        System.out.print("결과값: "+sum);
        // 결과값 출력
        
        
        sc.close();
        //Scanner 종료

	}

}
