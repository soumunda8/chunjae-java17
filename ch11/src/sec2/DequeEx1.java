package sec2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

// Deque = Dequeue : Stack 과 Queue 의 장점을 혼합한 이중 구조
public class DequeEx1 {

    public static void main(String[] args) {

        Deque<String> dq1 = new ArrayDeque<>();
        Deque<String> dq2 = new LinkedBlockingDeque<>();
        Deque<String> dq3 = new ConcurrentLinkedDeque<>();
        Deque<String> dq4 = new LinkedList<>();

        // push - 현재 위치의 앞에 추가
        // offer - 현재 위치의 뒤에 추가
        dq1.add("0");
        dq1.push("1");          // 현재(0)의 앞에
        dq1.offer("2");         // 현재(0)의 뒤에
        dq1.add("3");              // 맨 뒤에
        dq1.push("4");          // 현재(3)의 앞에
        dq1.offer("5");         // 현재(3)의 뒤에
        dq1.addFirst("6");      // 맨 앞에
        dq1.addLast("7");       // 맨 뒤에
        dq1.offerFirst("8");
        dq1.offerLast("9");
        
        // 요소제거
        dq1.remove("4");        // 해당 값 삭제
        dq1.removeFirst();
        dq1.removeLast();
        dq1.poll();
        dq1.pollFirst();
        dq1.pollLast();

        // 값 접근
        System.out.println(dq1.peek());         // 처음꺼 출력
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.peekLast());
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());

    }

}
