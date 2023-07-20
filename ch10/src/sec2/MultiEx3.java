package sec2;

/*
- 제너릭의 제한 -> <T extends 제한클래스>
- 제한(슈퍼) 클래스의 서브(이하) 클래스만 생성이 허용됨
*/

public class MultiEx3 {

    public static void main(String[] args) {
        /*
        - java 1.6 이하는 생성자 내 인자를 생략하면 안됨
        - java 1.7 이상은 생성자 내 인자 생략가능
        */
        // Child<Parent> c1 = new Child<Parent>(); // My 이하로 잡아놔서 오류
        Child<My> c2 = new Child<>();
        // Child<Child> c3 = new Child<>(); // 자기자신은 만들수 없음
        Child<Season> c4 = new Child<>();


    }

}