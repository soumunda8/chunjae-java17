package sec1;

class SMThread extends Thread {

    @Override
    public synchronized void start() {  // 쓰레드 생성

        this.method1();                 // 동기화 블록에 기재된 쓰레드들은 병행 수행됨
        super.start();

    }

    @Override
    public void run() {                 // 쓰레드로 실행할 내용을 기술

        int[] arr = {95, 60, 85, 70, 90, 80};

        for(int i = 0; i < arr.length; i++) {

            System.out.println("점수 : " + arr[i]);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }
        }
        //super.run();

    }

    public void method1() {

        for(int i = 1; i < 7; i++) {

            System.out.println(i);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }

        }

    }
    
}

public class Thread2{

    public static void main(String[] args) {

        // 방법1 | 방법2 모두 사용가능, 생성자만 SMThread()로 하면 됨
        // SMThread th1 = new SMThread();   // 방법1
        Thread th1 = new SMThread();        // 방법2
        th1.start();                        // 쓰레드 생성 후 자동실행

    }

}