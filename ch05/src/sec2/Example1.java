package sec2;

// Shape 클래스는 현재 클래스인 Example1 클래스와 다른 패키지인 sec1에 존재하므로 import 필요함.
import sec1.Shape;

// String 클래스와 같이 base 클래스인 경우는 java 언어 안에 내장되어 있으므로 사용자 정의 클래스와 다르게 별도의 import 필요 없다.
public class Example1 {

    public static void main(String[] args) {
        
        String str1 = new String();
        String str2 = new String("박나연");

        //  클래스명 인스턴스명 = new 생성자함수();
        Shape s1 = new Shape();

        s1.setType("square");       //s1.type = "square";
        s1.setLength(50);           //s1.length = 50;
        //s1.area = s1.length * s1.length;
        double d1 = s1.calcArea();
        System.out.println("현재 도형1의 면적은 ? " + d1);

        Shape s2 = new Shape("triangle");
        s2.setLength(30);           //s2.length = 30;
        double d2 = s2.calcArea();
        System.out.println("현재 도형2의 면적은 ? " + d2);

        Shape s3 = new Shape("circle", 20);
        double d3 = s3.calcArea();
        System.out.println("현재 도형3의 면적은 ? " + d3);

    }

}