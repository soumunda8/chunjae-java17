package sec2;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {

        Date today = new Date();
        // new = 객체 생성

        // 문자열과 객체타입은 값이 같다고 하더라도 등호(==)로 비교할 수 없다.
        // 값 비교를 위해서는 equals() 를 사용하여 비교하여야 한다.

        String data1 = "2023-07-13";                        // 기본 변수 타입
        String data2 = new String("2023-07-13");     // 레퍼런스 타입 - 메모리에 주소가 저장됨

        // == 은 타입을 비교해버림 / 레퍼런스는 저장된 데이터를 가지는 주소를 가져오고, 기본 변수는 저장된 데이터를 가져와서
        if(data1 == data2) System.out.println("서로 같음");
        else System.out.println("서로 다름");

        // ★equals 는 저장된 데이터를 비교
        if(data1.equals(data2)) System.out.println("서로 같음");
        else System.out.println("서로 다름");

        String info = "";
        String name = "박나연";
        int age = 20;
        float ht = 160.8f;

        // 숫자에 문자 하나라도 더하기가 되면, 문자열로 변환된다.
        // 데이터 타입이 달라도 문자열 하나만 들어가면 문자열로 변경되서 저장됨
        info = name + age + ht;
        System.out.println("info = " + info);
    }
}