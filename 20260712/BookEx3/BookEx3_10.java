class Main {
    public static void main(String[] args) {
        char ch = 'A';

        //ch가 65보다 크거나 같고 97보다 작으면
        // true (ch+32) 실행
        // false ch 실행
        // 오답
        //char lowerCase = ('A' <= ch < 'Z')?ch+32:ch;



        
         //(수정) 부등호는 &&로 쪼개고, 2. 더한 결과는 (char)로 형변환
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;
        
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}