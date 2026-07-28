package com.arrayexam;
import java.util.*;
/*과목과 점수가 짝을 이루도록 2개의 배열을 작성하시오.
 * String[] course= {"HTML5","java","DataBase","JSP","SPRING"};
 * int score[]={95,88,76,62,55};
 * 
 * 아래와 같이 과목이름을 입력받아 점수를 출력하는 프로그램을 작성하고
 * 단, 그만을 입력받으면 프로그램을 종료한다.
 * 과목 이름 : jaba
 * 없는과목입니다.
 * 과목 이름 : JAVA
 * JAVA의 점수는 88

 */

import java.util.Scanner;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String[] course= {"HTML5","JAVA","DataBase","JSP","SPRING"};
		 int score[]={95,88,76,62,55};
		 String name;
		 
		 while (true) {
	            System.out.print("과목 이름 : ");
	            name = sc.next(); 
	            
	            if (name.equals("그만")) 
	            {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }
		 
		 int i;
		 for(i=0; i<score.length; i++)
		 {
			 if (course[i].equals(name))
			 {
				 System.out.println(name+"의 점수는"+score[i]);
				 break;
			 }
		 }
		
		 if(i==score.length)
			 System.out.println("없는 과목입니다.");
		
		
		
	}
	}
}
