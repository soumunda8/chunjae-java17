package sec2;

// Runnable : 실행 가능한 객체를 만들기 위한 인터페이스 -> 사용자 상속받아 새로운 클래스를 생성하여 활용
class SBRunnable implements Runnable {

    @Override
    public void run() {

        String[] strArr = {"손현우", "이민혁", "유기현", "채형원", "이주헌", "임창균"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 출석을 부르기
        for(String name:strArr) {
            System.out.println("출석 체크 : " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

class SCRunnable implements Runnable {

    @Override
    public void run() {

        String[] strArr = {"임창균", "이주헌", "채형원", "유기현", "이민혁", "손현우"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 퇴실체크하기 
        for(String name:strArr) {
            System.out.println("퇴실 체크 : " + name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    
}

public class Run1 {

    public static void main(String[] args) {

        // 부모 태그로 구현해야 자식 태그끼리 서로 호환이 가능 => 다형성
        Runnable sbRun1;            // 선언부
        sbRun1 = new SBRunnable();  // 생성부
        Thread t1 = new Thread(sbRun1); // 멤버 변수안에 실행시킬 변수명을 넣으면 됨.
        t1.start();
        
        sbRun1 = new SCRunnable();  // 재선언
        Thread t2 = new Thread(sbRun1);
        t2.start();

    }

}

/*

 -출력문-
                         wait time
 퇴실 체크 : 임창균         500
 출석 체크 : 손현우         1000
 출석 체크 : 이민혁         1000+1000                      = 2000
 퇴실 체크 : 이주헌         500+1500                       = 2000
 출석 체크 : 유기현         1000+1000+1000                 = 3000
 퇴실 체크 : 채형원         500+1500+1500                  = 3500
 출석 체크 : 채형원         1000+1000+1000+1000            = 4000
 출석 체크 : 이주헌         1000+1000+1000+1000+1000       = 5000
 퇴실 체크 : 유기현         500+1500+1500+1500             = 5000
 출석 체크 : 임창균         1000+1000+1000+1000+1000+1000  = 6000
 퇴실 체크 : 이민혁         500+1500+1500+1500+1500        = 6500
 퇴실 체크 : 손현우         500+1500+1500+1500+1500+1500   = 8000

*/