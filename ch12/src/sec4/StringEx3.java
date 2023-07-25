package sec4;

import java.util.Arrays;

public class StringEx3 {

    public static void main(String[] args) {

        String str1 = new String();
        str1 += "손현우";
        str1 += "/";
        str1 += "이민혁";
        str1 += "/";
        str1 += "유기현";
        str1 += "/";
        str1 += "채형원";
        str1 += "/";
        str1 += "이주헌";
        str1 += "/";
        str1 += "임창균";
        System.out.println(str1);

        System.out.println("-----------------------------------");

        StringBuffer str2 = new StringBuffer();
        str2.append("손현우");
        str2.append("/");
        str2.append("이민혁");
        str2.append("/");
        str2.append("유기현");
        str2.append("/");
        str2.append("채형원");
        str2.append("/");
        str2.append("이주헌");
        str2.append("/");
        str2.append("임창균");
        System.out.println(str2);
        str2.replace(4, 7, "이민혁군바");
        System.out.println(str2);
        System.out.println(str2.toString());

        System.out.println("-----------------------------------");

        StringBuilder str3 = new StringBuilder();
        str3.append("손현우");
        str3.append("-");
        str3.append("이민혁");
        str3.append("-");
        str3.append("유기현");
        str3.append("-");
        str3.append("채형원");
        str3.append("-");
        str3.append("이주헌");
        str3.append("-");
        str3.append("임창균");
        System.out.println(str3.toString());
        str3.insert(7, "군바");
        System.out.println(str3.toString());
        System.out.println(str3.substring(7, 9));
        System.out.println(str3.reverse());         // 스트링 거꾸로 출력
        System.out.println(str3.reverse());
        String str4 = str3.toString();              // split 을 사용하기 위해서 [StringBuilder -> String] 으로 형변환 하는 방식
        String[] str5 = str4.split("-");
        System.out.println(Arrays.toString(str5));

    }

}