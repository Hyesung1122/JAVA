package com.arrayexam;
import java.util.*;
/*컴퓨터와 사용자 사이의 가위바위보
 * 사용자가 먼저 시작하고, 컴퓨터는 랜덤으로 가위, 바위, 보를 하나 선택
 * 사용자가 입력한 값과 랜덤으로 서택된 값을 비교하여 누가 이겼는지를 판정하는
 * 프로그램을 구현하되 단, 그만을 입력하면 게임이 종료된다.
 * 
 * 결과
 * 가위 바위 보: 바위
 * 사용자: 바위, 컴퓨터: 가위, 사용자가 이겼습니다.
 * 
 * 결과
 * 가위 바위 보: 바위
 * 사용자: 바위, 컴퓨터: 가위, 사용자가 이겼습니다.
 * 
 * 결과
 * 가위 바위 보: 그만
 *	게임을 종료합니다.
 * Sting[] str ={"가위","바위","보"};
 * 랜덤값 추출
 * int n = (int)(Math.random()*3);
 * 문자열비교 : equals()
 */

import java.util.Scanner;

public class ArrayEx13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        String s;
        
        while (true) {
            System.out.print("가위 바위 보: ");
            s = sc.next(); 
       
            if (s.equals("그만")) 
            {
                System.out.println("게임을 종료합니다.");
                break; 
            }
            
            int n = (int)(Math.random() * 3);
            String b = str[n];
            System.out.println("사용자:"+s+",컴퓨터:"+b);
            
            if (s.equals("가위")) 
            {
                if (b.equals("가위"))
                    System.out.println("비겼습니다.");
                else if (b.equals("바위"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else
                    System.out.println("당신이 이겼습니다.");
            }
            
            else if (s.equals("바위")) 
            { 
                if (b.equals("바위"))
                    System.out.println("비겼습니다.");
                else if (b.equals("보"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else
                    System.out.println("당신이 이겼습니다.");
            }
            
            else if (s.equals("보")) 
            {
                if (b.equals("보"))
                    System.out.println("비겼습니다.");
                else if (b.equals("가위"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else
                    System.out.println("당신이 이겼습니다.");
            }
            else 
            {
                System.out.println("다시하세요");
            }

        }

		
			
		
		
		
		
	
		
		
		
		
	
		
		
		
		
		
		
	}
}
