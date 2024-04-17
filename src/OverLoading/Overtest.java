package OverLoading;

class OverloadingTest{
    //이름이 cat인 메소드
    void cat(){
        System.out.println("매개변수 없음");
    }
    void cat(int a, int b){
        System.out.println("매개변수:"+a+","+b);
    }
    void cat(String c){
        System.out.println("매개변수:"+c);
    }

}

public class Overtest{
    public static void main(String[] args) {

        //OverloadingTest 객체 생성
        OverloadingTest ot = new OverloadingTest();

        ot.cat();

        ot.cat(2, 3);

        ot.cat("hello");

    }
}