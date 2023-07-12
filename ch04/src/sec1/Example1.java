package sec1;

public class Example1 {
    public static void main(String[] args) {

        // 선언만 한 예시 - 메모리 할당X
        int[] a;    // 선언1 - 타입[] 배열명;
        int b[];    // 선언2 - 타입 배열명[];
        
        int[] c = new int[3];   // 선언 및 할당
        int d;

        //System.out.println("a[0] : " + a[0]); // a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에
        System.out.println("c[0] : " + c[0]);   // 참조형인 경우는 초기화를 안하면 기본 0 / "" 이 들어감
        //System.out.println("d : " + d);       // d는 primitive 타입이므로 반드시 초기화가 필요함

    }
}