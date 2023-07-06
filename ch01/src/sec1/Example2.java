package sec1;

public class Example2 {
    public static void main(String[] args) {

        // 프리미티브(primitive) 타입변수 = 기본 타입 변수
        // 초기화 하지 않았을 때 = null

        // 논리형 변수
        boolean a = true;       // 1byte / 0 = false, 1 = true
        // 바이트 변수 : 문자, 숫자 상관없이 저장 가능
        byte b = 127;           // underflow < -128 <= byte 범위 <= 127 < overflow
        // 문자 변수 : 한 글자만 저장 가능
        char c = 'k';           // 2byte
        // 반정도정수 변수
        short d = 32767;        // 2byte / -32768 <= short 범위 <= 32767
        // 단정도정수 변수
        int e = 785367890;      // 4byte
        // 배정도정수 변수
        long f = 785367800;     // 4byte
        long g = 7853678000L;   // 4byte -> 8byte / L = 부동소수점을 의미 [348670.2478 => +/- 10^6 (기수부) X 3486702478 (가수부)]
        // 단정도실수 변수
        float h = 3.141592F;    // 4byte / F = 실수임을 의미
        // 배정도실수 변수 - double : 정밀성을 요구하거나, 아주 큰수, 아주 작은수에 적합
        double i = 3.141592;    // 8byte
        double j = 3.141592D;

        // byte 표현범위 : (-2^n-1) ~ (2^n-1) -1

        int k = 8;
        int l = k + 20;
        // 프리미티브(primitive) 타입변수는 표현범위가 있으며, 표현범위를 벗어나면 오류가 일어나고
        // 프리미티브(primitive) 타입변수 반드시 초기화가 되어야 한다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}