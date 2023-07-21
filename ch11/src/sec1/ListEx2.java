package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {

    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1 = new Vector();
        list1 = new LinkedList();

        ArrayList list2 = new ArrayList();
        //Vector list2 = new Vector();      -> method2는 매개변수로 ArrayList 로 받는데, Vector 을 넣어 에러가 남

        method1(list1);
        method2(list2);

        // 매개변수는 최상위 클래스 타입으로 선언해야 문제 없이 사용 가능 함.

    }

    public static void method1(List ls) {}
    public static void method2(ArrayList ls) {}

}