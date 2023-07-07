package sec2;

public class Example8 {
    public static void main(String[] args) {
        String name = "박*연";
        int age = 20;
        double wt = 45;
        System.out.print("이름 : " + name + "\n나이 : " + age + "\n체중 : " + wt);
        System.out.print("\n출력문 예시2\n");
        System.out.println("\"이름\" : " + name + "\t\"나이\" : " + age + "\t\"체중\" : " + wt);
        System.out.println("출력문 예시3");
        System.out.printf("이름 : \"%s\", \t나이 : \'%d\', \t체중 : %3.2f", name, age, wt);
        System.out.println("");

        int num1 = 127;
        // %b : 2진수, %o : 8진수, %x : 16진수 -> 파이썬, C언어
        // 각 진수에 해당하는 숫자를 문자열로 바꾸므로 나중에 숫자로 변환하면, 그 숫자 그대로 10진수로 표기된다.
        // 그러므로 절대 바꾼 데이터는 연산을 하지 않도록 해야한다.
        String bin = Integer.toBinaryString(num1);
        String oct = Integer.toOctalString(num1);
        String hex = Integer.toHexString(num1);
        System.out.println("2진수 : " + bin);
        System.out.println("8진수 : " + oct);
        System.out.println("16진수 : " + hex);
        System.out.println("10진수 : " + num1);

        int k = Integer.parseInt(bin) + Integer.parseInt(oct);
        System.out.println("더한 결과 1 : " + k);

        System.out.println(Integer.parseInt(bin));
        System.out.println(Integer.parseInt(oct));
        System.out.println(Long.parseLong(hex, 16));

        int b1 = 0b101111;
        int o1 = 0746;
        int x1 = 0x4fc;

        System.out.println("b1 = " + b1);
        System.out.println("o1 = " + o1);
        System.out.println("x1 = " + x1);

        int j = b1 + o1 + x1;
        System.out.println("j = " + j);
    }
}