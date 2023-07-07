package sec1;

public class Example4 {
    public static void main(String[] args) {
        // 비트연산
        int a = 20; // 10100
        int b = 14; // 01110

        // 0 = 양수, 1 = 음수
        System.out.println("a & b : " + (a & b));   // 00100
        System.out.println("a | b : " + (a | b));   // 11110
        System.out.println("~a : " + (~a));         // 11011
        System.out.println("a ^ b : " + (a ^ b));     // 11010
        System.out.println("a >> 2 : " + (a >> 2));
        System.out.println("a << 2 : " + (a << 2));
        System.out.println("a >>> 2 : " + (a >>> 2));
        //System.out.println("a <<< 2 : " + (a <<< 2)); // <<<은 없음
    }
}