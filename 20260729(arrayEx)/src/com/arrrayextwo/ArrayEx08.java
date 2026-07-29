package com.arrrayextwo;
import java.util.*;
/*세명을 학생에서 한명당 세과목을 점수를 입력받아서
 * 총점, 평균, 석차를 구하는 프로그램을 작성하시오
 * 
 * 
 * 
 */
public class ArrayEx08 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String[] subname= {"국어", "영어", "수학"};
	
	int [][] sub = new int[3][subname.length+2];
	/*[3] => 3명 -> 0:첫번째사람, 1:두번째사람, 2:세번째 사람
	 * [subname.lenght+2];
	 * 국어, 영어, 수학, 합계, 석차
	 * 0		1		2	  +1    +2
	 * 
	 * 
	 */
	float[] avg = new float[3];
	
	//각 사람에 대한 과목별 점수를 입력 받는다.
	for(int k=0; k <sub.length; k++)
	{
		System.out.println((k+1)+"번째 사람");
		for(int i = 0; i<sub[k].length-2; i++)
		{
			do
			{
				System.out.println(subname[i]+"점수:");
				sub[k][i]=sc.nextInt();
			}while(sub[k][i]<0||sub[k][i]>100);
			
			sub[k][sub[k].length-2]	+= sub[k][i];
		}// 한사람의 과목 점수 입력작업이 끝남
		
		avg[k]=sub[k][sub[k].length-2]/(float)(sub[k].length-2);//합계
		sub[k][sub[k].length-1]= 1;//석차
	}	
	//석차
	for(int k = 0; k <sub.length; k++)
	{
		for(int i =0; i < sub.length; i++)
		{
			if(sub[k][sub[k].length-2]<sub[i][sub[k].length-2])
			{
				sub[k][sub[k].length-1]++;
			}
		}
	}
	
	//출력
	System.out.println();
	for(int k =0; k<sub.length; k++)
	{
		System.out.println(sub[k][sub[k].length-1]+"등");
		System.out.println("총점 :"+sub[k][sub[k].length-2]);
		System.out.printf("평균: %.2f",avg[k]);
	}
	
	}
}


