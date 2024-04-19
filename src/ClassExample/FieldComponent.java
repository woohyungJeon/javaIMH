package ClassExample;

class Field {
    static int a = 10;  //클래스, 스태틱 변수 선언
    int b = 11; //인스턴스 변수 선언

    void example() {
        int i = 5;  //지역변수
        System.out.println(i);
        example2(3);
    }

    private void example2(int i) {
        int j = 4;  //지역변수
        System.out.println(i + j);
    }
}

public class FieldComponent {
    public static void main(String[] args) {
        System.out.println(Field.a); // 스태틱 변수 참조 출력

        Field f = new Field();  //객체 인스턴스 생성

        System.out.println(f.b);    //인스턴스 변수 참조 출력
        
        f.example();    //인스터스 메소드 호출
    }
}
