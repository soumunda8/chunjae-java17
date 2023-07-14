package sec2;

import sec1.Middle;
import sec1.Score;

public class Example2 {

    public static void main(String[] args) {

        Score el1 = new Score();
        el1.setNum(1001);
        el1.setName("박나연");
        
        // 오버로딩 사용 예시
        el1.prtNum(1004);
        el1.prtName("박나봉");

        System.out.println("번호 : " + el1.getNum());
        System.out.println("이름 : " + el1.getName());

        Middle st1 = new Middle();

    }

}