package sec1;

public class Example1 {
    public static void main(String[] args) {
        // 연산 (Operation) : OPcode, Operand -> 명령코드, 데이터가 있는 메모리주소
        // 연산의 종류 : [산술연산, 대입연산, 증감연산], [관계연산, 논리연산], 비트연산, 기타연산
        //                     연산 값 : 수치      연산 값 : true, false

        // 산술연산 : +, -, *, /, %
        int a = 20;
        int b = 30;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.printf("a * b = %d\n", e);
        System.out.printf("b / a = %d\n", f);
        System.out.printf("b %% a = %d\n", g);
    }
}