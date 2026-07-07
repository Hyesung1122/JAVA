package varEx01;

public class varEx01 {
//두 변수의 저장되어 있는 값 바꾸기
	public static void main(String[] args) {
		int x =10, y =20;
		int tmp = 0;
		//tmp 임의의 변수 생성
		System.out.println("x:"+ x +"y:"+y);
		
		tmp=x;
		//x를 tmp에 담기
		x=y;
		y=tmp;
		System.out.println("x:"+ x +"y:"+y);
	}
}
