package sec1;

import java.util.List;
import java.util.ArrayList;

/*
 컬렉션 프레임워크(Collection Framework) : 여러 데이터의 모음을 저장한 자료 구조
 Stack, Queue, Deque, Set, Nap, List, ...
 List : 데이터의 순서가 있으며, 데이터 중복이 허용되며, 순서 유지가 됨 -> *ArrayList*, Vector, LinkedList, ...
 Set : 일반적인 집합을 말하며, 순서 유지가 되지 않지만, 데이터 중복이 허용되지 않음 -> *HashSet*, TreeSet, ...
 Map : 키와 값을 쌍으로 저자, 키의 중복을 허용하지 않지만, 값은 중복이 허용됨 -> *HashMap*, HashTable, TreeMap, Properties(사용자에 대한 객체로 저장할 때 좋음), ...
 Stack : 일반적인 데이터, 최신의 데이터를 저장하는 자료 구조로 데이터 입출력이 LIFO 로서 거꾸로 진행되는 자료구조명
         데이터 입력 -> push down
         데이터 출력 -> pop up
         데이터 양보다 입력양이 많음 -> overflow
         데이터 양보다 출력량이 많음 -> underflow
 Queue : 데이터 입출력이 FIFO 로서 순서대로 진행되는 자료구조로 CPU 스케줄링 -> 쓰레드의 우선순위 또는 발생순으로 처리
         입구 : rear
         출구 : front
 Deque : FIFO/LIFO 운영방식이 모두 가능한 자료구조
*/

public class ListEx1 {

    public static void main(String[] args) {

        String[] author = {"손현우", "이민혁", "유기현", "채형원", "이주헌", "임창균"};

        List<Board> list = new ArrayList<>();           // spring boot / spring framework 에서 많이 사용
        //ArrayList<Board> list = new ArrayList<>();

        Board bd1;
        for(int i = 1; i < 6; i++) {

            bd1 = new Board();
            bd1.setNo(i);
            bd1.setTitle("더미 제목" + i);
            bd1.setContents("더미 내용" + i);
            bd1.setAuthor(author[i-1]);
            bd1.setResDate("2023-07-20");

            list.add(bd1);      // ArrayList 에 추가

        }

        prt((ArrayList<Board>) list);
        // prt(list);

    }

    public static void prt(ArrayList<Board> list) {

        for(Board bd:list) {

            System.out.println("글번호 :" + bd.getNo());
            System.out.println("글제목 :" + bd.getTitle());
            System.out.println("작성자 :" + bd.getAuthor());
            System.out.println("작성일 :" + bd.getResDate());
            System.out.println("=========================");
        }

    }

}