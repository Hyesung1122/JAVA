class Main {
    public static void main(String[] args) {
    
     int fahrenheit = 100;



                    //5/9는 실수이므로 float 형변환
                    //100을 곱하고 0.5f뺀다
                    //0.5f대신 0.5를 하면 괄호안이 float 하고 double로 계산되어서 double이 됨 
                    // 다시 int 정수로 형변환하고, 100f(소수로 출력해야함)
    float celcius = (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
            
            System.out.println("Fahrenheit:" + fahrenheit); 
            System.out.println("Celcius:" + celcius); 
    }
}