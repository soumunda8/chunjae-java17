package sec2;

public class UserExceptionEx1 {

    public static void main(String[] args) {

        try {

            method1();

        } catch (RunException e) {

            System.out.println(e.getMessage());
            // e.getMessage();      // 웹에서만 메세지를 볼 수 있음
            e.printStackTrace();    // IDE 콘솔창에서 확인 가능

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static void method1() throws RunException {

        throw new RunException("실행");

    }

}