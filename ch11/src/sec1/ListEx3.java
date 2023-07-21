package sec1;

import java.util.ArrayList;
import java.util.List;

class Student {

    public int sno;
    public String sname;
    public int point;

    public Student() {}

    public Student(int sno, String sname, int point) {
        this.sno = sno;
        this.sname = sname;
        this.point = point;
    }
}

public class ListEx3 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("손현우");        // 요소 추가
        list1.add("이민혁");
        list1.add("유기현");
        list1.add("채형원");
        list1.add("이주헌");
        list1.add("임창균");
        list1.add("몬스타엑스");
        System.out.println(list1);
        
        list1.remove(6);            // 특정 인덱스 위치의 요소 제거
        System.out.println(list1);

        list1.clear();                    // 모든 요소 제거
        System.out.println(list1);

        list1.add("손현우");
        list1.add("이민혁");
        list1.add("유기현");
        list1.add("채형원");
        list1.add("이주헌");
        list1.add("임창균");
        System.out.println(list1);

        System.out.println("리스트의 요소 수 : " + list1.size());
        System.out.println("인덱스가 2인 데이터 : " + list1.get(2));

        if (list1.contains("몬스타엑스")) {  // 존재 유무 판단
            System.out.println("몬스타엑스가 존재합니다.");
        } else {
            System.out.println("몬스타엑스가 존재하지 않습니다.");
        }

        if (list1.isEmpty()) {              // 빈 리스트를 검증
            System.out.println("현재 리스트가 비어 있음");
        } else {
            System.out.println("현재 리스트가 사용 중임");
        }

        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("--------------------------------");

        for(String s:list1) {
            System.out.println(s);
        }

        List<Student> sl = new ArrayList<>();
        Student q1 = new Student();
        q1.sno = 1;
        q1.sname = "손현우";
        q1.point = 90;

        Student q2 = new Student();
        q2.sno = 2;
        q2.sname = "이민혁";
        q2.point = 85;

        Student q3 = new Student();
        q3.sno = 3;
        q3.sname = "유기현";
        q3.point = 50;

        sl.add(q1);
        sl.add(q2);
        sl.add(q3);

        System.out.println("----------------방법1----------------");

        Student q;
        for(int i = 0; i < sl.size(); i++) {
            q = sl.get(i);
            System.out.println("번호 :" + q.sno);
            System.out.println("이름 :" + q.sname);
            System.out.println("점수 :" + q.point);
        }

        System.out.println("----------------방법2----------------");

        for (Student s:sl) {
            System.out.println("번호 :" + s.sno);
            System.out.println("이름 :" + s.sname);
            System.out.println("점수 :" + s.point);
        }

    }

}