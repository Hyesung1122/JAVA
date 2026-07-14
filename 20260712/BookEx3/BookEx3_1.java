
class Main {
    public static void main(String[] args) {
    
        int x = 2;
        int y = 5;
        char c = 'A';

       //3<<33 (2진수 변환후 왼쪽으로 이동) 결과:6
        System.out.println(1 + x << 33);

        //or 계산은 앞에가 참이면 뒤에 연산을 무시하고 true 출력
        System.out.println(y >= 5 || x < 0 && x > 2);

        // 후위 연산자 -> 10-x 하고, y를 더함 연산 후 x가 증가되어 3이됨 결과: 13 
        System.out.println(y += 10 - x++);

        // 위에 라인 실행 한 후여서 x는 3 결과:5
        System.out.println(x += 2);

        // &&연산두개가 모두 참인데 !가 있으니까 결과  :False
        System.out.println(!('A' <= c && c <= 'Z'));

        //'C' =67 c='A' 65 결과: 2 
        System.out.println('C' - c);

        // 5 - 0 문자를 숫자로 바꿈 
        System.out.println('5' - '0');

        //char+int 는 int로 나옴 ( 더 byte가 큼) 결과: 66
        System.out.println(c + 1);

        //전위 연산자 c를 증가시키고 출력 결과: B
        System.out.println(++c);

        //B 출력 되고, c가 증가됨
        System.out.println(c++);

        //즉 c= 'C' 
        System.out.println(c);
    }
}