package Variable;

public class Operator {
    public static void main(String[] args) {
        //산술 연산자
        int a = 3;
        ++a;
        System.out.println(a);

        int b = 3;
        b++;
        System.out.println(b);

        System.out.println("-------------------------");
        //전위, 후위 다른 결과 보기
        int a1 = 3;
        int b1 = ++a1;
        System.out.println(a1);
        System.out.println(b1);

        int a2 = 3;
        int b2 = a1++;
        System.out.println(a2);
        System.out.println(b2);

        //대입 연산자
        int num1 = 10, num2 = 10, num3 = 10, num4 = 10, num5 = 10;

        num1 += 5; //num1 = num1 + 5; 와 같음
        num2 -= 5; //num2 = num2 - 5; 와 같음
        num3 *= 5; //num3 = num3 * 5; 와 같음
        num4 /= 5; //num4 = num4 / 5; 와 같음
        num5 %= 5; //num5 = num5 % 5; 와같음

        System.out.println("+=연산자 결과 : " + num1);
        System.out.println("-=연산자 결과 : " + num2);
        System.out.println("*=연산자 결과 : " + num3);
        System.out.println("/=연산자 결과 : " + num4);
        System.out.println("%=연산자 결과 : " + num5);

        //증감 연산자
//        int num1 = 10, num2 = 10, num3 = 10, num4 = 10;
//
//        System.out.println("++i연산자 결과 : " + ++num1);
//        System.out.println("i++연산자 결과 : " + num2++);
//        System.out.println("--i연산자 결과 : " + --num3);
//        System.out.println("i--연산자 결과 : " + num4--);

        //비교연산자
        int i1 = 1, i2 = 2;

        System.out.println("==연산자 결과 : " + (i1 == i2));
        System.out.println("!=연산자 결과 : " + (i1 != i2));
        System.out.println(">연산자 결과 : " + (i1 > i2));
        System.out.println(">=연산자 결과 : " + (i1 >= i2));
        System.out.println("<연산자 결과 : " + (i1 < i2));
        System.out.println("<=연산자 결과 : " + (i1 <= i2));


//        삼항연산자
//        int a = 10;
//        int b = 7;
//
//        int result = (a > b) ? a - b : b - a;
//
//        System.out.println(result);
//
//        String res = (a > b) ? "a가 b보다 크다" : (a < b) ? "a가 b보다 작다" : "a와 b는 같다";
//        System.out.println(res);
    }
}
