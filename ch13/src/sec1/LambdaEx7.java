package sec1;

// Predicate

@FunctionalInterface
interface MyLambda7<T, Q> {
    boolean compare(T t, Q q);
}

public class LambdaEx7 {

    public static void main(String[] args) {

        MyLambda7<Integer, Integer> comp1 = (a, b) -> {
            //return (a == b ? true : false);
            return a==b;
        };

        MyLambda7<String, String> comp2 = (a, b) -> {
            //return (a.equals(b) ? true : false);
            return a.equals(b);
        };

        System.out.println("숫자 비교 결과 : " + comp1.compare(10, 30));
        System.out.println("문자 비교 결과 : " + comp2.compare("monstaX", "monstaX"));

    }

}