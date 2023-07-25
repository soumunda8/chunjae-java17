package sec4;

import java.util.StringTokenizer;

public class StringEx2 {

    public static void main(String[] args) {

        String mem1 = "손현우/이민혁/유기현/채형원/이주헌/임창균";
        // String[] m1 로 분리
        String[] m1 = mem1.split("/");
        for (String name:m1) {
            System.out.println(name);
        }

        System.out.println("----------------------------");

        String mem2 = "손현우&이민혁,유기현,채형원,이주헌-임창균";
        String[] m2 = mem2.split("&|,|-");
        for (String name:m2) {
            System.out.println(name);
        }

        System.out.println("----------------------------");

        String mem3 = "손현우/이민혁/유기현/채형원/이주헌/임창균";
        StringTokenizer em3 = new StringTokenizer(mem3, "/");
        int cnt = em3.countTokens();        // 토큰에 의해 분리된 요소수
        for(int i = 0; i < cnt; i++) {
            String token = em3.nextToken();
            System.out.println(token);
        }

    }

}