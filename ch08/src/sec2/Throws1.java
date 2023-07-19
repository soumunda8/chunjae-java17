package sec2;

import java.util.Arrays;

// 모든 예외처리는 try~catch~finally 또는 throws 을 반드시 써야함
public class Throws1 {

    public static void main(String[] args) {

        String name = null;
        nullCheck(name);

        int[] arr = new int[4];
        otherCheck(arr);

        String data = "1004Imchangkyun";
        otherCheck(data);

    }

    public static void nullCheck(String a) throws NullPointerException {

        // 예외 상황이 되었을 경우 -> NullPointerException 가 처리함 = 강제로 떠넘기기
        System.out.println(a);

    }

    public static void otherCheck(int[] data) throws ArrayIndexOutOfBoundsException {

        System.out.println(data[5]);

    }

    public static void otherCheck(String data) throws ClassCastException {

        int intStr = Integer.parseInt(data);
        System.out.println(intStr);

    }

}