package sec2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class CollectionsEx3 {

    public static void main(String[] args) {

        // 과제
        // 입력한 월의 달력 출력하기
        // 만약, 7월의 경우
        /*
        7월
         일  월  화  수  목  금  토
                                 1
         2   3   4   5   6   7   8
         9  10  11  12  13  14  15
        16  17  18  19  20  21  22
        23  24  25  26  27  28  29
        30  31
        */

        Calendar c1 = Calendar.getInstance();
        //int now_yy = c1.get(Calendar.YEAR);       // 시스템에 설정된 년 가져오기
        //int now_MM = c1.get(Calendar.MONTH);      // 시스템에 설정된 월 가져오기

        /* 원하는 달 출력 */
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 년도를 입력하세요 :");
        int now_yy = sc.nextInt();
        System.out.println("원하는 달을 입력하세요[1월 ~ 12월] :");
        int now_MM = sc.nextInt() - 1;
        System.out.println("원하시는 달력은 [ " + now_yy + " ]년 [ " + (now_MM + 1) + " ]월 달력 입니다.");

        c1.set(now_yy, now_MM, 1);  // 해당 월 첫 일자로 설정

        // 자바 1.7이하에선 -> eDay.add(Calendar.DATE, -1); // 다음달에서 하루 빼면 원하는달의 마지막 날짜를 구할 수있다.
        int lastDate = c1.getActualMaximum(Calendar.DAY_OF_MONTH);  // 설정된 월 마지막 일자 구하기
        c1.set(now_yy, now_MM, lastDate);                           // 설정된 월 마지막 일자로 설정
        int week  = c1.get(Calendar.WEEK_OF_MONTH);                 // 설정된 월 마지막 일자의 주차 구하기

        String[][] strArr = new String[week][7];                    // 설정된 월을 달력모양으로 2차원 배열 설정

        int day = 1;                                                // 설정된 월의 1일로 설정하기 위한 변수
        int checkDay = 0;                                           // 요일을 숫자로 설정하기 위한 변수

        for(int i = 0; i < week; i++) {

            for(int j = 0; j < 7; j++) {

                c1.set(now_yy, now_MM, day);                        // 설정된 달의 1일로 날짜 셋팅
                checkDay = c1.get(Calendar.DAY_OF_WEEK) - 1;        // 해당일자 요일을 숫자로 가져옴

                if(day == (lastDate+1)) {                           // 마지막 날보다 하루 큰날이 day 랑 같으면 for 문 탈출
                    break;
                }

                if(checkDay == j) {                                 // j랑 요일 숫자가 같으면 2차원 배열이 입력 후 day 증가
                    strArr[i][j] = String.valueOf(day);
                    ++day;
                }

            }

        }

        // 달력 출력
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for(int i1 = 0; i1 < strArr.length; i1++) {
            for(int j1 = 0; j1 < strArr[i1].length; j1++) {
                if(strArr[i1][j1] != null) {
                    System.out.printf("%2s\t", strArr[i1][j1]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }

    }

}