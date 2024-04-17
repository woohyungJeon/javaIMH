package exteds;

class People{
    //필드(Feild)
    String name; //이름
    int age; //나이

    //메소드(Method)
    public void printMyself(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Student extends People{
    //필드(Field)
    int korean_scroe; //국어성적
    int math_score; //수학성적
    int english_score; //영어성적

    //생성자(Constrouct)
    Student(String name, int age, int kor_score, int mat_score, int eng_score){
        super.name = name; //부모 필드
        super.age = age; //부모 필드
        this.korean_scroe = kor_score;
        this.math_score = mat_score;
        this.english_score = eng_score;
    }

    //메소드(Method)
    public void printScore() {
        System.out.println("국어성적 : " + korean_scroe);
        System.out.println("수학성적 : " + math_score);
        System.out.println("영어성적 : " + english_score);
    }
}

public class extendsExample {

    public static void main(String[] args) {
        Student student = new Student("홍길동", 18, 100, 90, 80);
        student.printMyself(); //부모 메소드 호출
        student.printScore(); //자식 메소드 호출
    }
}
