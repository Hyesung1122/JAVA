package com.ex;

import java.util.Random;
import java.util.Scanner;

public class Strproject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자를 무작위로 생성하기 위한 코드
		Random random = new Random();
	
        System.out.print("가위바위보 입력 : ");
        
        // 입력한 단어를 문자열로 받는다
        String user = sc.next();
        
      //컴퓨터의 선택
        int comChoice = random.nextInt(3);
        
        
        //숫자를 빈 문자열에 저장
        String com = "";
        
     // 0: 가위 1: 바위 2: 보 로 대응시킴
        if (comChoice == 0)
            com = "가위";
        else if (comChoice == 1)
            com = "바위";
        else if (comChoice == 2)
            com = "보";
        
        
     // 컴퓨터가 랜덤으로 낸 것 출력
        System.out.println("컴퓨터 : " + com);
        
        
      // 문자열끼리 비교해서 승패를 가림 
       //컴퓨터가 가위 출력하면
        if (com.equals("가위")) {
        	
        // user가 가위 내면 비김 출력
            if (user.equals("가위"))
                System.out.println("비김");
            
         // user가 바위 내면 이김 출력
            else if (user.equals("바위"))
                System.out.println("이김");
            
         // user가 보 내면 짐 출력
            else if (user.equals("보"))
                System.out.println("짐");
        }
        
        
        //컴퓨터가 바위 출력하면
        else if (com.equals("바위")) {
            if (user.equals("가위"))
                System.out.println("짐");
            else if (user.equals("바위"))
                System.out.println("비김");
            else if (user.equals("보"))
                System.out.println("이김");
        }
        
        
      //컴퓨터가 보 출력하면
        else if (com.equals("보")) {
            if (user.equals("가위"))
                System.out.println("이김");
            else if (user.equals("바위"))
                System.out.println("짐");
            else if (user.equals("보"))
                System.out.println("비김");
        }
		
		

	}

}
