package sec1;

public class Example2 {
    public static void main(String[] args) {

        // 배열 = 꼭 선언된 갯수만 사용해야됨

        // 초기화 및 할당과 선언을 동시에 - 추가로 선언이 가능함
        int[] a = {90, 75, 80, 85};
        int b[] = {85, 100, 70, 90};

        // 초기화 및 할당 후 선언을
        int[] c = new int[4];
        c[0] = 100;
        c[1] = 100;
        c[2] = 100;
        c[3] = 100;
        //c[4] = 100;

        int[] d;    // 선언만
        d = new int[]{90, 80, 85, 60};  // 할당과 초기화
        // 추가할당시에는 오류가 없으나, 실제 할당이 되지 못해서 출력할 수 없음.
        //d[4] = 100;

        for(int i = 0; i < a.length; i++) {
            System.out.println("a 배열의 " + (i+1) + "번째 데이터 : " + a[i]);
        }

        System.out.println("=============================================");

        for(int i = 0; i < b.length; i++) {
            System.out.println("b 배열의 " + (i+1) + "번째 데이터 : " + b[i]);
        }

        System.out.println("=============================================");

        for(int p:c) {      // p=c[0], p=c[1], ...
            System.out.println(p);
        }

        System.out.println("=============================================");

        for(int p:d) {
            System.out.println(p);
        }

    }
}