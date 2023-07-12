package sec2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        int a = 0;

        int[] intArr = new int[3];
        double[] doubleArr = new double[3];
        boolean[] boolArr = new boolean[3];
        String[] strArr = new String[3];    // String 은 초기화를 하지 않으면 null 이 들어가므로 nullPointerException 이 뜸. 그러므로  String 은 반드시 초기화를 해줘야 한다.

        System.out.println("a = " + a);
        System.out.println("intArr = " + intArr);   // 실제 저장된 위치의 주소가 나옴

        System.out.println("=========================");

        // 순회하면서 출력
        for (int i:intArr) {
            System.out.println(i);  
        }

        System.out.println("=========================");

        // 순회하지 않고 바로 출력
        System.out.println("intArr = " + Arrays.toString(intArr));
        System.out.println("doubleArr = " + Arrays.toString(doubleArr));
        System.out.println("boolArr = " + Arrays.toString(boolArr));
        System.out.println("strArr = " + Arrays.toString(strArr));

        System.out.println("=========================");

    }
}