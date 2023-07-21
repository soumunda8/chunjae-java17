package sec2;

import java.util.*;

public class SetEx1 {

    public static void main(String[] args) {

        Set set1 = new HashSet();
        set1 = new TreeSet();

        // 데이터 중복 X, 순서유지 X
        Set<String> set2 = new HashSet<>();
        set2.add("손현우");
        set2.add("이민혁");
        set2.add("유기현");
        set2.add("채형원");
        set2.add("이민혁");
        set2.add("이주헌");
        set2.add("이민혁");
        set2.add("임창균");

        System.out.println("----------Set 결과----------");
        Iterator it = set2.iterator();      // 한개씩 쪼개서 사용한다고 보면됨
        while (it.hasNext()) {    // 순서가 없어서 while 사용해야 함.
            System.out.println(it.next());
        }

        // 데이터 중복 O, 순서 유지 O
        List<String> list2 = new ArrayList<>();
        list2.add("손현우");
        list2.add("이민혁");
        list2.add("유기현");
        list2.add("채형원");
        list2.add("이민혁");
        list2.add("이주헌");
        list2.add("이민혁");
        list2.add("임창균");

        System.out.println("---------리스트 결과---------");
        for (String d : list2) {
            System.out.println(d);
        }

    }

}