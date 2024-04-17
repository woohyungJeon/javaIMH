package Variable;

public class FilesTest {
    int m = 3;  //필드
    int n = 4;  //필드

    void work1(){
        int k= 5;   //지역변수
        System.out.println(k);
        work2(3);
    }

    void work2(int i){  //지역변수
        int j = 4;
        System.out.println(i + j);
    }
}
