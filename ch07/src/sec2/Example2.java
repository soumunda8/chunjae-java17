package sec2;

//import sec1.Dbl;  // Dbl 클래스는 default 라서 사용 불가
import sec1.Outer;

public class Example2 {

    public static void main(String[] args) {

        Outer out1 = new Outer();

        // Outer
        out1.setItem1(100);
        out1.setItem2("임창균");
        out1.method1();

        System.out.println("--------------------");

        // 외부클래스.내부클래스 인스턴스명 = 외부인스턴스.new 내부생성자
        // Inner
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4("몬스타엑스");
        in1.method2();

        System.out.println("--------------------");

        //Dbl db1 = new Dbl();  // - public 이 아니라 default 라서 사용 불가
        // Dbl db1 = new Dbl(); // - 생성 안됨
        // Dbl db = out1.getDbl(); // - 안됨

        // 이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
        // out1.db  // - Dbl 클래스 타입의 멤버필드
        // out1.getDbl();  // - 메소드 호출에 의한 생성
        
    }

}