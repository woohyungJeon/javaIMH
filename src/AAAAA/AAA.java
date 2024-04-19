package AAAAA;

public class AAA {
    //4가지 다 선언
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    //같은 클래스 내에서는 모든 접근지정자에 대해서
    //접근이 가능함
    public void print(){
        System.out.print(a + "");
        System.out.print(b + "");
        System.out.print(c + "");
        System.out.print(d);
        System.out.println();

    }
}
