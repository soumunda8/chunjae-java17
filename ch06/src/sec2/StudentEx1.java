package sec2;

import sec1.Student;

public class StudentEx1 {

    public static void main(String[] args) {

        Student st1 = new Student();

        // 메서드1의 활용 (리턴 X, 매개변수 X)
        st1.method1();
        // 메서드2의 활용 (리턴 0, 매개변수 X)
        int a2 = st1.method2();
        System.out.println("메서드2의 return 값은 [" + a2 + "]입니다.");
        // 메서드3의 활용 (리턴 X, 매개변수 0)
        st1.method3(84);
        // 메서드4의 활용 (리턴 0, 매개변수 0)
        int a4 = st1.method4(10);
        System.out.println("메서드4의 return 값은 [" + a4 + "]입니다.");

    }

}