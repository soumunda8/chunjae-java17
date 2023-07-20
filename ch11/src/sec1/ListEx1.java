package sec1;

import java.util.ArrayList;

// Stack, Queue, Deque, Set, Nap, List, ...

public class ListEx1 {

    public static void main(String[] args) {

        String[] author = {"손현우", "이민혁", "유기현", "채형원", "이주헌", "임창균"};

        ArrayList<Board> list = new ArrayList<>();

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

        prt(list);

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