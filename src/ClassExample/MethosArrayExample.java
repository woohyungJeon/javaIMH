package ClassExample;

import java.util.Arrays;

//매게변수가 배열인 메서드 호출해주기
public class MethosArrayExample {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3};
        printArray(a);
        printArray(new int[] {2,3,4});
//        printArray({4,5,6});  //이건안됨
    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }


}
