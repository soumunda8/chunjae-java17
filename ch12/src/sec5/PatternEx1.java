package sec5;

import java.util.regex.Pattern;

public class PatternEx1 {

    public static void main(String[] args) {

        // regist Expression : 등록시 갖추어야할 데이터의 검증식
        // (), [] : 그룹핑, w : 단어(숫자 포함됨), d : 정수, {글자수}, {최소글자수, 최대글자수}
        // ^ : 시작 문자(접두사), $ : 끝 문자(접미사)
        // ? : 유 또는 무, * : 유/무/하나이상, + : 하나이상
        String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";         // 검증식
        String tel1 = "(02)-1004-1234";
        String tel2 = "02-1004-1234";
        String tel3 = "010-1004-1234";
        String tel4 = "(010)-1004-1234";
        String tel5 = "(031)1231004";
        String tel6 = "0311231004";
        String tel7 = "031-123-1004";
        //전화번호 검증
        System.out.println("전화번호 검증 1 : " + Pattern.matches(regExp, tel1));
        System.out.println("전화번호 검증 2 : " + Pattern.matches(regExp, tel2));
        System.out.println("전화번호 검증 3 : " + Pattern.matches(regExp, tel3));
        System.out.println("전화번호 검증 4 : " + Pattern.matches(regExp, tel4));
        System.out.println("전화번호 검증 5 : " + Pattern.matches(regExp, tel5));
        System.out.println("전화번호 검증 6 : " + Pattern.matches(regExp, tel6));
        System.out.println("전화번호 검증 7 : " + Pattern.matches(regExp, tel7));
        System.out.println("-------------------");

        // [0-9a-zA-Z] : 영문대소문자숫자
        // [가-힣] : 한글만 입력가능
        // [a-z]{2,3}$ -> 끝이 a부터 z까지 2글자에서 3글자가 나와야됨
        regExp = "\\w+@\\w+.\\w+(\\.\\w+)?";
        regExp = "\\w+@\\w+.\\w*.[a-z]{2,3}$";
        String email1 = "kkt@gmail.com";
        String email2 = "kkt.naver.com";
        String email3 = "chunjae@nate.co.kr";
        String email4 = "chunjae.nate.com";
        String email5 = "chunjae@hotmail";
        //이메일 검증
        System.out.println("이메일 검증 1 : " + Pattern.matches(regExp, email1));
        System.out.println("이메일 검증 2 : " + Pattern.matches(regExp, email2));
        System.out.println("이메일 검증 3 : " + Pattern.matches(regExp, email3));
        System.out.println("이메일 검증 4 : " + Pattern.matches(regExp, email4));
        System.out.println("이메일 검증 5 : " + Pattern.matches(regExp, email5));

    }

}