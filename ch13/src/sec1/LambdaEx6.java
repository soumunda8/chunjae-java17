package sec1;

import java.util.Scanner;

@FunctionalInterface
interface MyLambda6<T, Q> {
    Q calc(T x, T y);
}

public class LambdaEx6 {

    public static void main(String[] args) {

        // 더하기 | 빼기 | 곱하기 | 나누기 구현체 작성
        MyLambda6<Integer, Integer> plus = (x, y) -> {
            return x+y;
        };

        MyLambda6<Integer, Integer> minus = (x, y) -> {
            return x-y;
        };

        MyLambda6<Integer, Long> mul = (x, y) -> {
            return (long) x*y;
        };

        MyLambda6<Integer, Double> div = (x, y) -> {
            return (double) x/y;
        };

        MyLambda6<Integer, Integer> mod = (x, y) -> {
            return x%y;
        };


        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("연산을 입력해주세요. [ + - * / % ]");
        String type = sc.next();

        if(type.equals("+")) {
            System.out.println("더한 결과 : " + plus.calc(a, b));
        } else if(type.equals("-")) {
            System.out.println("뺀 결과 : " + minus.calc(a, b));
        } else if(type.equals("*")) {
            System.out.println("곱한 결과 : " + mul.calc(a, b));
        } else if(type.equals("/")) {
            System.out.println("나눈 결과 : " + div.calc(a, b));
        } else if(type.equals("%")) {
            System.out.println("나머지 결과 : " + mod.calc(a, b));
        } else {
            System.out.println("잘못된 연산을 선택하셨습니다.");
        }

    }

}