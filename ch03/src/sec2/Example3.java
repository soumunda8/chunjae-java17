package sec2;

public class Example3 {
    public static void main(String[] args) {
        /*
        int 카운트 = 0; // 카운트 변수 선언 및 초기화
        do {
            증감식;
            반복 실행할 문장;
        } while(조건식);
        */
        // 무조건 1회 이상 실행 보장
        // 실행 후에 조건판다을 하므로

        int i = 0;
        int tot = 0;
        do {
            i+=3;
            tot += i;
        } while (i >= 100);
        System.out.println("tot = " + tot);

        i = 0;
        tot = 0;
        while (i >= 100) {
            i+=3;
            tot += i;
        }
        System.out.println("tot2 = " + tot);
    }
}