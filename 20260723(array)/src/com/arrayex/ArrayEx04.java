package com.arrayex;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayEx04 {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//과목명을 배열에 저장
		String[] subname = {"국어", "영어","수학"};
		//									0	     1		  2
				//sub[0]국어, sub[1]영어, sub[2]수학, sub[3] : 총점 
		
		int[] sub= new int[subname.length+2];
		
		float avg = 0.0f;

		for(int i = 0; i<sub.length-2; i++)
		{
			do {
					System.out.print(subname[i]+"점수 :");
					sub[i] = Integer.parseInt(br.readLine());
				}
		while(sub[i]<0||sub[i]>100);
		//각 과목 점수를 0
		// 총점을 sub[3]에 저장
		
		sub[3] += sub[i];
		System.out.println("i가 "+ i +" 일때 : " +sub[i]);
		System.out.println("총점 들어가는 순서 체크"+sub[3]);
		avg =sub[3]/(float)(sub.length-2);
		sub[4] = (int)avg;
		}
	

		System.out.println("총점:"+sub[sub.length-2]);
		System.out.printf("평균:"+sub[4]);
	}
} 
