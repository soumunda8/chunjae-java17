package sec1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        // 키보드로 학번과 세 과목 점수를 입력받아
        // 총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        // tot(총점), avg(평균), hak(학점), pan(판정), grd(등급)
        // 총점 = 전산 + PG + OA
        // 평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        // 학점은 평균이 96이상 A+, 93이상 A0, 90이상 A-
        //             86이상 B+, 83이상 B0, 80이상 B-
        //             76이상 C+, 73이상 C0, 70이상 C-
        //             66이상 D+, 63이상 D0, 60이상 D-
        //             60미만 F
        // 판정은 평균이 80이상이면서, 세 과목 모두 70이상이면 "합격" 아니면 "불합격"
        // 등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급, 3이면 3등급, 2이면 2등급, 1이면 1등급
        // 출력형식
        // 학번 전산점수 PG점수 OA점수 총점 평균 학점 판정 등급
        // 101   XX     XX     XX   X   X   X    X   X
        Scanner sc = new Scanner(System.in);

        System.out.println("학번(3자리) : ");
        int num = sc.nextInt();

        System.out.println("전산 점수 : ");
        int sub01 = sc.nextInt();

        System.out.println("PG 점수 : ");
        int sub02 = sc.nextInt();

        System.out.println("OA 점수 : ");
        int sub03 = sc.nextInt();

        int tot = sub01 + sub02 + sub03;
        float avg = tot / 3.0f;

        String hak = "";
        if(avg >= 96) hak = "A+";
        else if(avg >= 93) hak = "A0";
        else if(avg >= 90) hak = "A-";
        else if(avg >= 86) hak = "B+";
        else if(avg >= 83) hak = "B0";
        else if(avg >= 80) hak = "B-";
        else if(avg >= 76) hak = "C+";
        else if(avg >= 73) hak = "C0";
        else if(avg >= 70) hak = "C-";
        else if(avg >= 66) hak = "D+";
        else if(avg >= 63) hak = "D0";
        else if(avg >= 60) hak = "D-";
        else hak = "F";

        String pan = "";
        if(avg >= 80 && sub01 >= 70 && sub02 >= 70 && sub03 >= 70) pan = "합격";
        else pan = "불합격";

        String grd = "";
        switch ((int)(avg/20)) {
            case 1:
                grd = "1등급";
                break;
            case 2:
                grd = "2등급";
                break;
            case 3:
                grd = "3등급";
                break;
            case 4:
                grd = "4등급";
                break;
            case 5:
                grd = "5등급";
                break;
            default:
                grd = "판정불가";
        }

        System.out.println("학번\t\t전산점수\tPG점수\tOA점수\t총점\t\t평균\t\t학점\t\t판정\t\t등급");
        System.out.println(num + "\t\t" + sub01 + "\t\t" + sub02 + "\t\t" + sub03 + "\t\t" + tot + "\t" + avg + "\t" + hak + "\t\t" + pan + "\t\t" + grd);

    }
}