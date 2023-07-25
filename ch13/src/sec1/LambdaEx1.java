package sec1;

public class LambdaEx1 {

    public int method1(int x, int y) {
        return (x*y);
    }

    /*
    // 람다식 자체가 구현체로서 호출하는 곳에서 바로 사용됨 -> 호출 필요 X
    (x, y) -> {x*y};

    () -> {};       // Basic
    (x) -> {};      // Consumer - 소비자
    () -> {x};      // Supplier
    (x) -> {x};     // Operator - 운영자[주로 매개변수를 전달받아 처리를 한 후, 다시 반환하는 타입]
                    // Function - 기능[주로 매개변수를 전달받아 처리를 한 후, 그 결과를 형변환하여 반환하는 타입]
                    // Predicate - [주로 매개변수를 전달받아 비교한 후, 일치하는지 여부를 논리값으로 반환하는 타입]
    */

}