package sec1;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {

    public static void main(String[] args) {

        List<Student> s = new LinkedList<>();
        s.add(new Student(1, "손현우", 10));
        s.add(new Student(2, "이민혁", 8));
        s.add(new Student(3, "유기현", 7));
        s.add(new Student(4, "채형원", 6));
        s.add(new Student(5, "이주헌", 5));
        s.add(new Student(6, "임창균", 4));

        System.out.println("학생번호\t학생이름\t학생점수");
        for(int i = 0; i < s.size(); i++) {
            Student a = s.get(i);
            System.out.println(a.sno + "\t" + a.sname + "\t" +a.point);
        }

        /*
        List 와 linkedList 차이
        일반적인 속도는 linkedList 가 이전포인터와 다음포인터가 있어 훨씬 빠르나
        중간 삭제나 중간 삽입의 경우는 List 가 더 빠르다

        일반적인 속도 : List < linkedList
        중간삭제나 중간삽입 시 속도 : List > linkedList -> 중간 작업일때만 속도가 확 떨어짐

        데이터를 중간에 끼어넣는 것 .insert()
        */

    }

}