package sec2;

// ? -> 와일드카드 / 나중에 설정 가능
// Object -> 모든 것을 받을 수 있음

import java.util.List;

public class Multi4 {

    // 목록 출력
    public void method1(List<?> list) {
        
        for(Object obj : list) {
            System.out.println(obj);
        }
        
    }

    // 목록 합계
    public int method2(List<? extends Number> list) {

        int hap = 0;

        for(Number i : list) {
            hap += i.doubleValue(); // 실수 일때 사용
        }

        return hap;

    }

    // 목록 추가
    // extends(해당 제한클래스 이하를 사용) <> super(해당 제한클래스 이상을 사용)
    public List<? super Integer> method3(List<? super Integer> list) {

        for(int i = 0; i < 5; i++) {
            list.add(i);
        }

        return list;

    }

}