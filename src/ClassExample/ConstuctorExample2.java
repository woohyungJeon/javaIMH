package ClassExample;

class ConstructorA{
    int m1, m2, m3, m4;

    ConstructorA(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ConstructorA(int a){
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ConstructorA(int a, int b){
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print(){
        System.out.print("m1" + " ");
        System.out.print("m2" + " ");
        System.out.print("m3" + " ");
        System.out.print(m4);
        System.out.println();

    }
}

class ConstructorB{
    int m1, m2, m3, m4;

    ConstructorB(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ConstructorB(int a){
        this(); //이게 뭐냐 B() 생성자를 호출해줌
        m1 = a;
    }

    ConstructorB(int a, int b){
        this(a);    //B(int a)생성자를 호출함
        m2 = b;
    }

    void print(){
        System.out.print("m1" + " ");
        System.out.print("m2" + " ");
        System.out.print("m3" + " ");
        System.out.print(m4);
        System.out.println();
    }
}
public class ConstuctorExample2 {
    public static void main(String[] args) {
        //3가지 객체를 생성해줌
        ConstructorA ca1 = new ConstructorA();
        ConstructorA ca2 = new ConstructorA(10);
        ConstructorA ca3 = new ConstructorA(10, 20);
        ca1.print();
        ca2.print();
        ca3.print();
        System.out.println();

        //3가지 객체 생성해주는데 this를 사용해보기
        ConstructorB cb1 = new ConstructorB();
        ConstructorB cb2 = new ConstructorB(30);
        ConstructorB cb3 = new ConstructorB(30, 40);
        cb1.print();
        cb2.print();
        cb3.print();
    }
}
