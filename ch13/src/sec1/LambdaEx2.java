package sec1;

// Consumer
@FunctionalInterface
interface MyLambda2 {
    void print(int x);
}

public class LambdaEx2 {

    public static void main(String[] args) {

        MyLambda1 lam1 = () -> {
            System.out.println("가산역 사고로 인해 지하철이 막혀, 살려주세요..");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱 결과 : " + (x*x));
        };
        lam2.print(1004);

    }

}