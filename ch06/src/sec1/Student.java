package sec1;

public class Student {

    private int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    // 접근제한자 반환타입 메서드명([타입 매개변수]) { return 해당반환타입의데이터또는변수; }
    // 1. 리턴 X, 매개변수 X
    public void method1(){
        System.out.println("메서드1입니다.");
    }

    // 2. 리턴 0, 매개변수 X
    public int method2(){
        int a = 1004;
        return a;
    }

    // 3. 리턴 X, 매개변수 0
    public void method3(int a){
        System.out.println("메서드3의 매개변수는 [" + a + "]입니다.");
    }

    // 4. 리턴 0, 매개변수 0
    public int method4(int a){
        return a*a;
    }

}