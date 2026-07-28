package com.arrayexam;
/*주민번호를 입력받아 올바른 주민번호 인지를 검증하는 프로그램을 구현하시오.
 * 123456-abcdefg;
 * 12 -> 년도, 34 -> 월, 56 -> 일
 * a-> 9,1,3(남) 0,2,4(여)
 * b-> (0~9)지역
 * c, d -> 시도,구
 * e,f -> 해당 구의 동, 읍, 면
 * g -> 판별 공식(해당 번호가 맞는지 안맞는지를 판별)
 * 
 * 공식
 * int hap =0;
 * hap += 주민번호첫번째자리*2
 * hap += 주민번호두번째자리*3
 * hap += 주민번호넷번째자리*4
 * hap += 주민번호다섯번째자리*5
 * hap += 주민번호여섯번째자리*6
 * hap += 주민번호일곱번째자리*7
 * -:계산하지 않음
 * hap += 주민번호여덟번째자리(a)*8
 * hap += 주민번호아홉째자리(b)*9
 * hap += 주민번호열번째자리(c)*2
 * hap += 주민번호열하나째자리(d)3
 * hap += 주민번호열두번째자리(e)*4
 * hap += 주민번호열세번째자리(f)*5
 * 
 * float temp =(int)(hap/11.0f)*11.0f + 11.0f-hap;
 * float temp1 = temp - (int)(temp/10.0f
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.io.*;
import java.util.*;
public class ArrayEx14 {

	public static void main(String[] args)throws IOException  {
		 BufferedReader br=
				 new BufferedReader(new InputStreamReader(System.in));
		 String name="";
		 
		 int []jumin= new int[14];
		 boolean right =false;
		 System.out.println("이름: ");
		 name = br.readLine();
		 
		 do 
		 {
			 right = false;
			 System.out.println("주민번호:");
			 for(int i=0; i<jumin.length; i++)
				 jumin[i]= System.in.read()-48;
		 
		 System.in.read(); 
		 System.in.read();
		 
		 // 달은 12월 보다 크면 안됨
		 if(jumin[2]*10+jumin[3]>12)
		 {
			 System.out.println("태어난 달은12월보다 클수 없습니다.");
			 continue;
		 }
		 else if(jumin[4]*10+jumin[5]>12)
		 {
			 //일은 31일보다 크면 안됨
			 System.out.println("태어난 일은31일보다 클수 없습니다.");
			 continue;
		 }
		 else if(jumin[7]!=9 && jumin[7]!=0 && jumin[7]!=1&&
			 jumin[7]!=2 && jumin[7]!=3 && jumin[7]!=4)
		 {
			 System.out.println("성별을 나타내는 숫자는 9,0,1,2,3,4 중 하나여야만가능합니다.");
			 continue;
		 }
		 int hap = 0,cre=2;
		 float temp = 0.0f,temp1=0.0f;
		 
		 for(int i = 0; i<jumin.length-1; i++)
		 {
			 if(i == 6)
			 {
				 continue;
			 }
			 hap += jumin[i]*cre;
			 cre++;
			 if(cre == 10)
			 {
				 cre = 2;
			 }
		 }
		 
		 temp =(int)(hap/11.0f)*11.0f + 11.0f-hap;
		 temp1 = temp - (int)(temp/10.0f)*10.0f;
		 
		 if(temp1 !=jumin[13])
		 {
			 System.out.println("주민번호 검증 수가 올바르지 않습니다.");
			 continue;
		 }
		 right = true;
		 
		 }while(!right);
		 
		 System.out.println();
		 System.out.println("이름:"+name);
		 System.out.println("주민번호:");
		 for(int i=0; i<jumin.length; i++)
		 {
			 if(i== 6)
			 {
				 System.out.println("-");
				 continue;
			 }
			 System.out.println(jumin[i]);
		 }
		 
		 System.out.println();
		 System.out.println("생년월일:");
		 int year =0, month=0, day =0;
		 switch(jumin[7]) {
		 case 9:
		 case 0:
			 year=1800;
			 break;
		 case 1:
		 case 2:
			 year=1900;
			 break;
		 case 3:
		 case 4:
			 year=2000;
			 break;
		 }
		 year +=jumin[0] *10 + jumin[1];
		 month =jumin[2]*10 +jumin[3];
		 day =jumin[4] *10 +jumin[5];
		 System.out.println(year+"년"+month+"월"+day+"일");
		 System.out.println("성별: ");
		 System.out.println(jumin[7] %2==0 ? "여성 ": "남성");
		 System.out.println("태어난 시도:");
		 String area="";
		 switch(jumin[8]) {
		 case 0:
			 area = "서울";
			 break;
		 case 1:
			 area = "경기, 인천";
			 break;
		 case 2:
			 area = "부산";
			 break;
		 case 3:
			 area = "강원도";
			 break;
		 case 4:
			 area = "충청도";
			 break;
		 case 5:
			 area = "전라도";
			 break;
		 case 6:
			 area = "대구, 광주";
			 break;
		 case 7:
			 area = "경북, 경남";
			 break;
		 case 8:
			 area = "경남";
			 break;
		 case 9:
			 area = "제주";
			 break;			 
		 }
		System.out.println(area);
		System.out.println("나이:");
		Calendar ca = Calendar.getInstance();
		int age = ca.get(Calendar.YEAR)-year-1;
		System.out.println(age+"세");
		 
	}
	
	
}
