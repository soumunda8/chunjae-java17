package sec1;

// 쓰레드(Thread) : 하나의 작업(Task) 또는 하나의 실행 프로그램(Process)
// Multi Thread : 여러 개의 쓰레드를 동시에 진행 또는 실행할 수 있도록 한 실행 환경
// Op-code(명령어코드) | Operand(데이터가 있는 주소) => Stack(스택 : LIFO)에 보관되어 처리 | 히프(큐와 같은 구조)
// 여러 일을 처리하려면 일의 순서를 정해야 함 -> 스케줄링
// 생성(Create) ->  실행대기(Wait) -> 실행(Run) -> 선점대기(Blocking) -> 재실행(WakeUp) -> 종료(Complete)

// Thread 클래스는 관리를 하기 위해서
public class Thread1 {

    public static void main(String[] args) {

        int[] arr = {95, 60, 85, 70, 90, 80};
        String[] str = {"손현우", "이민혁", "유기현", "채형원", "이주헌", "임창균"};

        for(int i = 0; i < str.length; i++) {

            // 전체 Single Thread 쓰레드는 6개 -> 동시에 불가
            System.out.println("이름 : " + str[i]);

            try {

                // 대기 시간 부여하고, 지정한 밀리초 만큼 Wait 되며, 그 시간이 지나면 자동으로 Wake Up 됨
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }
        }

    }
    
}