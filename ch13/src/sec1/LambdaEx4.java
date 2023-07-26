package sec1;

@FunctionalInterface
interface MyLambda4 {
    String print(int a);
}
public class LambdaEx4 {

    public static void main(String[] args) {

        MyLambda4 lam4 = (a) -> {
            return ("람다식4에서 출력한 [ " + a + " ] 입니다.");
        };
        System.out.println(lam4.print(1004));

    }

}