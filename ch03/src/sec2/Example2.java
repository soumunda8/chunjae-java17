package sec2;

public class Example2 {
    public static void main(String[] args) {
        /*
        int 카운트 = 0; // 카운트 변수 선언 및 초기화
        while (조건식) {
            증감식;
            반복실행할 문장;
        }
        */
        int i = 0;
        int tot = 0;
        while (i <= 100) {
            i++;          // tot = 5151
            tot += i;
            //i++;        // tot = 5050
        }
        System.out.println("tot = " + tot);


        // 무한루프 : 끝이 없이 계속 반복 실행되는 문장 = 조건식이 항상 참일 경우
        i = 0;
        tot = 0;
        while (i >=0 ) {
            i++;
            tot += i;

            if(i >= 100) break;
        }
        System.out.println("tot2 = " + tot);
    }
}