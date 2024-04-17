package Static;

class Calculator {
    String color;   //계산기의 색깔 --> 다 다를수가 있음
    static double pi = 3.141592;    //계산기에서 사용하는 반지름 값은 반드시 동일함

    //인스턴스 메소드
    void setColor(String color){
        this.color = color;
    }

    //정적 메소드
    static int plus(int x, int y){
        return x+ y;
    }

    //정적 메소드
    static int minus(int x, int y){
        return x - y;
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result 1 = " + result1);
        System.out.println("result 2 = " + result2);
        System.out.println("result 3 = " + result3);
    }
}
