package sec4;

import java.util.Arrays;

public class StringEx1 {

    public static void main(String[] args) {

        String str1 = new String("MonstaX");
        String str2 = new String("monstaX");
        System.out.println("name : " + str1);
        System.out.println("네 번째 글자 : " + str1.charAt(3));
        System.out.println("문자열 비교 : " + str1.equals(str2));

        byte[] bArr = str1.getBytes();      // 문자열을 바이트배열로 분리
        System.out.println("byte[] 의 출력 : ");

        // 첫 번째 방법 : 별도의 메소드를 호출하여 반복문으로 출력
        printArr(bArr);
        System.out.println("");

        // 두 번째 방법 : Arrays.toString(배열명);
        char[] cArr = new char[bArr.length];
        for(int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        System.out.println(Arrays.toString(cArr));

        System.out.println("x 는 몇 번째? : "+ (str1.indexOf("x")));        // 특정 문자의 인덱스 반환, 단어도 사용가능
        System.out.println("인덱스가 2부터 4전까지 출력 : " + (str1.substring(2, 4)));
        System.out.println("소문자로 : " + str1.toLowerCase());
        System.out.println("대문자로 : " + str1.toUpperCase());
        String data1 = str1.replace("a", "A");
        System.out.println("a 를 A 로 변경 : " + data1);

        String str3 = "             My name is XXX   ";
        System.out.println("str3의 글자수 : " + str3.length());
        System.out.println("공백 제거 전 : " + str3);
        System.out.println("공백 제거 후 : " + str3.trim());
        System.out.println("str3의 공백 제거 후 글자 : " + str3.trim().length());

        int k = 1004;
        String t1 = k + "";             // 코드 돌리면 올바른거 아니라고 막힘 -> 비추천
        String t2 = String.valueOf(k);  // 추천
        System.out.println(t1);
        System.out.println(t2);
        // System.out.println("k가 문자열 ? : " + (k instanceof Integer));      // 참조형만 사용 가능함
        System.out.println("t1이 문자열 ? : " + (t1 instanceof String));
        System.out.println("t2이 문자열 ? : " + (t2 instanceof String));

    }

    static void printArr(byte[] arr) {
        for(int i = 0; i < arr.length; i++) {
            char a = (char) arr[i];
            System.out.print(a + "\t");
        }
    }

}