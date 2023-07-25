package sec3;

public class SystemEx3 {

    public static void main(String[] args) {

        // 성능 평가 기준 : 처리능력(Throughput, 한번에 처리하는 능력) 높고, 반환시간(Turn Around Time = 응답시간) 낮은, 사용 가능도(Availability) 높고, 신뢰도(Reliability) 높은게 좋음
        long tot = 0;

        // long start = System.currentTimeMillis();        // 1/1000 -> 너무빨라서 확인이 어려움
        long start = System.nanoTime();                    // 1/1000000000

        for(int i = 0; i < 100000; i++) {
            tot += i;
        }

        long end = System.nanoTime();

        System.out.println("누적 결과 : " + tot);
        System.out.println("걸린 시간 : " + (end - start) + "ns");

    }

}