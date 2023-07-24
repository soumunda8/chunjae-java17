package sec1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ApiEx3 {

    public static void main(String[] args) {

        // Math.random() : 0 ~ 1 의 실수
        int su = (int) (Math.random() * 44 + 1);    // 1 ~ 45
        System.out.println("임의의 수 : " + su);

        System.out.println("-----------------------");
        
        // 로또 추첨기 만들기 - 내꺼01
        int[] lotto01 = new int[6];

        for(int i01 = 0; i01 < 6; i01++) {

            lotto01[i01] = (int) (Math.random() * 44 + 1);

            for(int j01 = 0; j01 < i01; j01++) {

                if(lotto01[i01] == lotto01[j01]) {

                    i01--;
                    break;

                }

            }

        }

        System.out.print("[ ");
        for (int a : lotto01) {
            System.out.print(a + " ");
        }
        System.out.println("]");

        System.out.println("-----------------------");

        // 로또 추첨기 만들기 - 내꺼02 -> 중복시 갯수가 부족한 상태로 출력되서 사용불가
        /*
        Integer[] lotto02 = new Integer[6];

        for(int i02 = 0; i02 < 6; i02++) {

            lotto02[i02] = (int) (Math.random() * 44 + 1);

        }

        Set<Integer> gen01 = new HashSet<>(Arrays.asList(lotto02));
        Iterator<Integer> it01 = gen01.iterator();

        System.out.print("[ ");
        while (it01.hasNext()) {

            System.out.print(it01.next() + " ");

        }
        System.out.println("]");

        System.out.println("-----------------------");
        */

        // 로또 추첨기 만들기 - 강사님 버전 [배열로 설정한 경우]
        Integer[] lotto03 = new Integer[6];

        for(int i = 0; i < 6; i++) {

            lotto03[i] = (int) (Math.random() * 44 + 1);

        }

        Set<Integer> gen02 = new HashSet<>(Arrays.asList(lotto03));

        // 중복된 번호가 있으며, 개수가 6개 미만이므로 6개 미만일 겨웅
        // 중복 없이 요소가 6개가 될 때까지 반복
        while (gen02.size() < 6) {
            gen02.add((int) (Math.random() * 44 + 1));
        }

        // Set 을 Array(배열)로 변환
        lotto03 = gen02.toArray(new Integer[6]);
        Arrays.sort(lotto03);   // 오름차순 정렬하기
        // Arrays.sort(lotto03, Collections.reverseOrder());    // 내림차순 정렬하기
        System.out.println(Arrays.toString(lotto03));

    }

}