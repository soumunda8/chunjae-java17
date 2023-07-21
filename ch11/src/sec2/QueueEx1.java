package sec2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("4");
        que.offer("8");
        System.out.println(que);

        // FIFO
        que.poll();     // 출력이면서 제거
        que.poll();
        System.out.println(que);

    }

}