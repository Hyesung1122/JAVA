import java.util.Scanner;

public class sumEx01 {

	public static void main(String[] args) {
		
		//사용자의 입력을 받기위한 스캐너 클래스 변수 sc
		Scanner sc = new Scanner(System.in);
		
		//사용자 입력 숫자를 처리하기 위한 변수 두개 선언
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		//사용자의 숫자 입력을 받는 코드
		System.out.println("첫번째 숫자를 입력해 주세요.");
		firstNumber = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력해 주세요.");
		secondNumber = sc.nextInt();
		
		result = firstNumber + secondNumber;
		
		System.out.println("입력한 두 숫자의 합 : " + result);
		
		//스캐너 닫기
		sc.close();
	}

}