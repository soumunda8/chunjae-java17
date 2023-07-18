package sec1;

public class Example1 {

    public static void main(String[] args) {

        // 예외(Exception) : 문법 상의 오류(Syntax Error)가 아니며, 실행 중의 오류
        // 주요 예외 : NullPointer, Arithmetic, ArrayIndexBounds, ClassCast, NumberFormat, ClassNotFound
        // 모든 예외는 java.lang.Exception 의 서브 클래스로 구성된다.
        // 외부 자원(파일, 데이터베이스, 주변 장치) 등을 연동하거나 활용하기 위하여는 반드시 예외처리가 동반되어야 함.

        int no1 = 100;
        int no2 = 0;
        int res = 0;

        /*
        // 비효율적인 방법
        if(no1 != 0 && no2 != 0) {
            res = no1 / no2;    // ArithmeticException
        } else {
            System.out.println("둘 중의 하나의 수가 0 입니다.");
        }
        */

        try {                               // 예외 처리 대책이 필요한 문장을 try 구절로 묶음
            res = no1 / no2;
        } catch (ArithmeticException e) {   // 예외 사항이 발생하였을 경우 실행한 문장을 catch 구절로 묶음
            System.out.println("방법 : no2가 0으로 나누려고 시도하였음");
            System.out.println("방법 : " + e.getMessage());
            System.out.println("---------------------------------");
            e.printStackTrace();    // print 문이 아예 내장되어 있음 - 일반적 사용
        } catch (Exception e) {             // 다단계 catch 처리가 되는데, 마지막 catch 에서는 모든 예외처리에 대한 Exception 을 매개 변수로 받아야 함.
            System.out.println("---------------------------------");
            e.printStackTrace();
        } finally {                         // 실패든 성공이든 관계없이 무조건 실행해야 하는 문장
            System.out.println("연결 종료");
            System.out.println("닫기");
        }

        System.out.println("출력 완료");

    }

}