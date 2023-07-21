package sec1;

import java.util.List;
import java.util.Vector;

public class ListEx5 {

    public static void main(String[] args) {

        List<Qna> q = new Vector<>();
        Qna a = new Qna(1, "제목1", "손현우");
        q.add(a);
        q.add(new Qna(2, "제목2", "이민혁"));
        q.add(new Qna(3, "제목3", "유기현"));
        q.add(new Qna(4, "제목4", "채형원"));
        q.add(new Qna(5, "제목5", "이주헌"));
        q.add(new Qna(6, "제목6", "임창균"));

        System.out.println("글번호\t제목\t내용");
        for(Qna p : q) {
            System.out.println(p.qno + "\t" + p.title + "\t" + p.content);
        }

    }

}