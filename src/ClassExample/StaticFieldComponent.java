package ClassExample;

class Field2 {
    static int classVariable = 0; // 클래스/스태틱 변수 선언
    int instanceVariable;     // 인스턴스 변수 선언
}

public class StaticFieldComponent {
    public static void main(String[] args) {

        Field2 f2_1 = new Field2();   // 인스턴스 생성
        Field2 f2_2 = new Field2();   // 인스턴스 생성
        Field2 f2_3 = new Field2();   // 인스턴스 생성

        // 인스턴스 변수는 각 객체마다 개별적으로 저장된다
        f2_1.instanceVariable = 10;
        f2_2.instanceVariable = 20;
        f2_3.instanceVariable = 30;

        System.out.println( f2_1.instanceVariable ); // 10
        System.out.println( f2_2.instanceVariable ); // 20
        System.out.println( f2_3.instanceVariable ); // 30

        // 클래스(스태틱) 변수는 하나의 클래스의 값으로 공유되어 고정으로 저장된다
        f2_1.classVariable = 100;
        f2_2.classVariable = 200;
        f2_3.classVariable = 300;

        System.out.println( f2_1.classVariable ); // 300
        System.out.println( f2_2.classVariable ); // 300
        System.out.println( f2_3.classVariable ); // 300

        // 클래스 변수에 접근하려면 Field2.classVar 식으로 클래스명으로 바로 접근 해야 된다
        System.out.println( Field2.classVariable ); // 300
    }

}
