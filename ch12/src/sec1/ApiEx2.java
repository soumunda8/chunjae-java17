package sec1;

import java.text.SimpleDateFormat;      // java.text = 표시 형식
import java.util.Calendar;
import java.util.Date;

public class ApiEx2 {

    public static void main(String[] args) {

        /* java.util 패키지 : java.lang 패키지의 추가 기능판으로 대부분 import 가 필요한 클래스로 구성된다. */
        // Arrays           : 배열을 효율적으로 다루기 위한 클래스
        // Calendar         : 날짜(달력)과 관련된 데이터를 다루기 위한 클래스 => 복수형
        // Date             : 날짜과 관련된 데이터를 다루기 위한 클래스 => 단일형
        // Objects          : 여러 객체를 한 번에 다루기 위한 클래스
        // StringTokenizer  : 문자열 객체들을 다루기 위한 클래스
        // Random           : 난수들을 다루기 위한 클래스
        // Collection       : List, Set, Map, Stack, Queue, Deque, ...
        // ...

        Date now = new Date();
        System.out.println(now);

        // 날짜를 String 으로 변환
        String strNow = now.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");       // 월은 MM, 분은 mm 으로 구분
        // String today1 = sdf.format(strNow);      // java 1.8 이전에는 반드시 문자열로 변경 후 진행해야 함. + 자바 8 이상부터 에러남
        String today2 = sdf.format(now);            // java 1.8 부터 가능 + 자바 8 이상부터 사용
        //System.out.println("문자열에 표시형식 날짜로 표시 : " + today1);
        System.out.println("날짜에 표시형식 날짜로 표시 : " + today2);

        int y = now.getYear() + 1900;       // 기준이 1900부터 시작되서 +1900을 해줌
        int M = now.getMonth() + 1;         // 기준이 0부터 시작해서 +1을 해줌
        int d = now.getDate();
        int w = now.getDay();               // 요일 표현
        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();

        System.out.println(y + "년" + M + "월" + d + "일");
        System.out.println(h + "시" + m + "분" + s + "초");

        // 자바 8 이상은 Calendar 이 추상체와 정적 구조로 구성되어 있으므로 별도의 객체를 생성하지 않는다.
        // Calendar cal = new Calendar();           // 오버라이딩 해야 할게 많아서 상수만 사용
        Calendar n = Calendar.getInstance();     // 자바 1.7 에서 사용
        
        // 자바 8 이상은 LocalDate 을 활용하여 시간대나 지역의 지역성을 나타냄

    }

}