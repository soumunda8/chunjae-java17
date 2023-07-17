package sec1;

// 추상화는 메소드에 대해서
// 전체 추상화 = interface
// 부분 추상화 = abstract class

// 1. 원하는것을 마음대로구현
// 2. 빼먹지 않고 구현할 수 있음 - 필수 기능을 집약하기 좋음
//    반드시 구현부분을 구현해야 에러가 안남, 즉 오버라이딩을 필수로 진행해야됨
// 3. 자식끼리 기능을 교체할 수 잇음 - interface나 추상화클래스를 반드시 커져야함 (-> 둘이는 부모일수밖에 없음)

// 추상화(abstract) 클래스
public abstract class Man {

    private int item1;
    private String item2;

    // 추상화 : 실제 구현내용을 적지 않고, 상속 받는 클래스에서 구현내용을 기술하므로써 물려 받는 입장에서 쓰고 싶은 것이 다를 경우 미리 아래(method5~method8)처럼 사용처를 정해버리면 그대로 쓰든가 아니면, 오버라이딩을 해야함.
    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);

    // 추상화 선언이 아니므로, 구현내용을 기술해야함.
    public void method5() {
        System.out.println("method5");
    }
    public int method6() {
        return 100;
    }
    public void method7(int no) {
        System.out.println("method7의 [" + no + "]");
    }
    public int method8(int no) {
        return no*(no-1);
    }

}