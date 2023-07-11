package sec2;

public class Example4 {
    public static void main(String[] args) {

        // 중첩
        for(int a = 1; a <= 5; a++) {
            for(int b = 1; b <= 4; b++) {
                System.out.print(b + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("---------------------");

        /*
        1	2	3	4	5	6	7
        8	9	10	11	12	13	14
        15	16	17	18	19	20	21
        22	23	24	25	26	27	28
        29	30	31
        */

        /* 강사님 방식
        int cnt = 0;
        for(int i = 1; i < 6; i++) {
            for(int j = 1; j <= 7; j++) {
                cnt++;
                if(cnt > 31) {
                    break;
                }
                System.out.printf("%2d \t", cnt);
            }
            System.out.println("");
        }
        */

        for(int i = 1;i <= 31; i++) {
            if(i % 7 == 0) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + "\t");
            }
        }

        System.out.println("\n---------------------");

        /*
        *
        **
        ***
        ****
        *****
        */

        /* 강사님 방식
        for(int i = 1; i < 6; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i >= j) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        System.out.println("---------------------");

        /*
        *****
        ****
        ***
        **
        *
        */

        /* 강사님 방식
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 6-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */

        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= 1; j--) {
                if(i <= j) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        System.out.println("---------------------");

        /*
        구구단
        2X1=2   3X1=3 ...... 9X1=9
        .................... 9X2=18
        ...........................
        2X9=18  3X9=27 ..... 9X9=81
        */
        for(int i = 1; i <= 9; i++) {
            for(int j = 2; j <= 9; j++) {
                System.out.printf("%dX%d=%d\t", j, i, (j*i));
            }
            System.out.println("");
        }
    }
}