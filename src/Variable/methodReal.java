package Variable;

class MethodTest {
    void print(){
        System.out.println("안녕");
    }

    int data(){
        return 3;
    }

    double sum(int a, double b){
        return a + b;
    }
}

public class methodReal{
    public static void main(String[] args) {

        MethodTest methodTest = new MethodTest();

        methodTest.print();
        int k  = methodTest.data();;
        methodTest.data();
        System.out.println(k);
        double result = methodTest.sum(3, 5.2);
        System.out.println(result);
    }
}
