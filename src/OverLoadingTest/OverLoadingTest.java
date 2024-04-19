package OverLoadingTest;

public class OverLoadingTest {

    public void print(){
        System.out.println("걍 프린트");
    }

    String print(Integer a){
        System.out.println("인트를 받아서 문자열로 출려");
        return a.toString();
    }

    void print(String a){
        System.out.println("스트링 받아와서 출려");
        System.out.println(a);
    }

    String print(Integer a, Integer b){
        System.out.println("인트형 2개 받아와서 연속해서 출력해주는거");
        return a.toString() + b.toString();
    }
}
