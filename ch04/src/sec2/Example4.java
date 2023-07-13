package sec2;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {

        String code = "801225-1278000";
        char m = code.charAt(7);    // index 는 무조건 0부터 / 특정 인덱스에 있는 문자 반환
        String gender = (m == '1') || (m == '3') ? "남" : "여";
        System.out.println("성별 코도 : " + m);
        System.out.println("성별 : " + gender);

        // 80-12-25
        // substring(시작 인덱스, 끝 인덱스)
        // 특정 번째(begin index) 부터 특정 번째(end index)까지 추출 / end index 는 포함 X
        String yy = code.substring(0,2);
        String mm = code.substring(2,4);
        String dd = code.substring(4,6);

        System.out.println("생년월일 : " + (yy + "-" + mm + "-" + dd));

        String nick = "monstaX";
        int idx = nick.indexOf('g');    // 해당 문자의 인덱스를 반환
        System.out.println("g의 문자 인덱스 값 : " + idx); // 예외처리가 뜨지 않고 문자값이 없을 때 = -1
        idx = nick.indexOf('n');
        System.out.println("n의 문자 인덱스 값 : " + idx); // 중복되면 처음으로 찾은 글자의 인덱스를 가져온다
        idx = nick.lastIndexOf('n'); // 반복되는 문자의 마지막 인덱스를 가져온다.
        System.out.println("n의 마지막 찾은 경우의 인덱스 값 : " + idx);

        // 문자열 결합 연산
        String name1 = nick + " imperial";              
        String name2 = nick.concat(" imperial");     // 추천
        System.out.println("name1 : " + name1 + " / name2 : " + name2);

        // 문자열을 문자배열로 : toCharArray()
        // ★문자열을 바이트배열로 : getBytes() // 자주 사용
        char[] nArr = nick.toCharArray();       // 문자열을 => 문자배열로 m o n s t a X
        byte[] bArr = nick.getBytes();          // 아스킥코드값 / 유니코드값

        System.out.println("@ 2번째 : " + nArr[2]);
        System.out.printf("# 2번째 : %s\n", bArr[2]);

        int age = 20;
        float ht = 160.8f;
        boolean ps = true;

        // 특정 타입의 데이터를 문자열로 변환 => valueOf()
        String val1 = String.valueOf(age);  // 정수 -> 문자열로 변환
        String val2 = String.valueOf(ht);   // 실수 -> 문자열로 변환
        String val3 = String.valueOf(ps);   // 논리 -> 문자열로 변환

        System.out.println(val1 + " / " + val2 + " / " + val3);

        // ★equals()
        if(val1.equals("20")) System.out.println("문자열 변환 성공");
        else System.out.println("문자열 변환 실패");

        // 대문자로(toUpperCase()) / 소문자로 (toLowerCase())
        System.out.println("대문자로 변환 : " + nick.toUpperCase());
        System.out.println("소문자로 변환 : " + nick.toLowerCase());

        // ★해당 특정 문자(열)를 찾아 변경 => replace(찾는 문자, 바꿀 문자)
        String nick2 = nick.replace('m', 'M');
        System.out.println("m을 M으로 변경 : " + nick2);

        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "백준철|신승원|구예진|한선|박진관|박나연";
        String chunjae3 = "백준철-신승원|구예진-한선|박진관-박나연";

        // ★문자열배열을 특정 구분자로 요소 분리 => split()
        String[] strArr1 = chunjae1.split("/");
        String[] strArr2 = chunjae2.split("|");     // | 은 연산자이기 때문에 구분자로 사용하지 못한다! - 구분자가 없다고 생각해서 하나씩 구분해버림
        String[] strArr3 = chunjae3.split("/|-");   // regex / -는 |- / +는 |+

        // 문자열배열을 출력 => Arrays.toString(문자배열열)
        System.out.println(Arrays.toString(strArr1));
        System.out.println(Arrays.toString(strArr2));
        System.out.println(Arrays.toString(strArr3));

        String data1 = "               park                     ";
        String data2 = "na                     ";
        String data3 = "                       bong";

        System.out.println("글자수1 : " + data1.length());      // 문자열을 따질때 .length() / 배열을 따질땐 .length
        System.out.println("글자수2 : " + data2.length());
        System.out.println("글자수3 : " + data3.length());

        // 해당 문자열의 앞 뒤의 공백제거 => trim().

        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();

        System.out.println("글자수1 : " + trans1.length());
        System.out.println("글자수2 : " + trans2.length());
        System.out.println("글자수3 : " + trans3.length());

    }
}