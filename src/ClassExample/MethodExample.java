package ClassExample;

class Method{
    //리턴 타입 void, 입력 매게변수는 없음.
    void print(){
        System.out.println("하이요");
    }

    //리턴 타입 int, 입력매개변수 없음.
    int data(){
        return 3;
    }

    //리턴 타입 double, 입력매개변수 2개
    double sum(int a, double b){
        return a+ b;
    }

    //리턴 타입 void, 내부에 리턴 포함(함수 종료)
    void printMonth(int m){
        if(m < 0 || m > 12){
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m + "월입니다.");
    }
}

public class MethodExample {
    public static void main(String[] args) {
        //객체 생성
        Method method = new Method();
        //메서드 호출해주기
        method.print();
        int k = method.data();
        method.data();
        System.out.println(k);
        double result = method.sum(2, 5.5);
        System.out.println(result);
        method.printMonth(3);
        method.printMonth(11);
    }


}
