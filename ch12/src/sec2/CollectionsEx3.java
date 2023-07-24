package sec2;

import java.util.Arrays;
import java.util.Calendar;

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
        int now_yy = c1.get(Calendar.YEAR);
        int now_MM = c1.get(Calendar.MONTH);
        int now_dd = c1.get(Calendar.DAY_OF_MONTH);
        /*
        int now_HH = c1.get(Calendar.HOUR);
        int now_mm = c1.get(Calendar.MINUTE);
        int now_ss = c1.get(Calendar.SECOND);
        */

        //int che = c1.get(Calendar.WEEK_OF_MONTH);       // 오늘이 몇번째 주에 잇는 지

        int lastDate = c1.getActualMaximum(Calendar.DAY_OF_MONTH);
        c1.set(now_yy, now_MM, lastDate);

        int week  = c1.getActualMaximum(Calendar.DAY_OF_MONTH);   // 월 마지막 일자 구하기

        int[][] intArr = new int[week][7];

        //c1.set(now_yy, now_MM, 1);      // 1일 요일 구하기 위해 셋팅

        // 일 = 1, 월 = 2, 화 = 3, 수 = 4, 목 = 5, 금 = 6, 토 = 7
        //int firstDateDay = c1.get(Calendar.DAY_OF_WEEK) - 1;     // 1일 요일 구하기
        //System.out.println(firstDateDay);

        /*
        for(int i = 0; i <= week; i++) {

            int weekInt = 0;
            int day = 1;

            c1.set(now_yy, now_MM, day);
            int firstDateDay = c1.get(Calendar.DAY_OF_WEEK) - 1;

            if(firstDateDay == 6) {
                weekInt++;
            }

            intArr[i][firstDateDay] = day;
            day++;
        }
        */

        //System.out.println(Arrays.deepToString(intArr));

        for(int i1 = 0; i1 < intArr.length; i1++) {
            for(int j1 = 0; j1 < intArr[i1].length; j1++) {
                System.out.print(intArr[i1][j1] + " ");
            }
            System.out.println("");
        }


        //System.out.println(che);

        //System.out.println("일\t월\t화\t수\t목\t금\t토");

    }

}