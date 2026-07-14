class Main {
    public static void main(String[] args) {
    
        int num = 20;

    //num+10 에서 num의 1자리수를 빼고 다시 num을뺀다
    //System.out.println((10+num-(num%10))-num);

     //짧게 수정
    System.out.println((10 - (num % 10)));
    }
}