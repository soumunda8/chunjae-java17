package sec2;

import sec1.Qna;

public class Example4 {

    public static void main(String[] args) {

        Qna q1 = new Qna();
        q1.setTitle(q1.DUMMY);
        System.out.println("글 제목 : " + q1.getTitle());

        Qna q2 = new Qna();
        q2.setTitle(q2.DUMMY);
        System.out.println("글 제목 : " + q2.getTitle());

        q2.method1();
        q2.method2();
        q2.method3();
    }

}