package sec1;

public class Example1 {
    public static void main(String[] args) {

        int a;      // 변수 선언
        a = 0;      // 변수 초기화

        int b = 0;  // 변수 선언 및 초기화

        int i = 0, j = 0, k = 0;    // 동일 타입 변수 다중 선언 및 초기화

        a = a + 5;
        i = a + 20;
        j = a - 20;

        System.out.println("a = " + a);
        System.out.print("i = " + i + "\n");    // = System.out.println("i = " + i);
        System.out.printf("j = %d \n", j);      // = System.out.println("j = " + j);

    }
}