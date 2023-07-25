package sec3;

class Student {

    public int no;
    public String name;

    public Student() {}

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

}

public class SystemEx2 {

    public static void main(String[] args) {

        Student st1;
        st1 = new Student(1, "유아인");        // 쓰레기1 -> 다음 값이 null 이 되기 때문
        st1 = null;
        st1 = new Student();                            // 쓰레기2 -> null 값만 가지고 있기 때문
        System.out.println(st1.no + "\t" + st1.name);
        System.gc();                                    // 가베지 콜렌셕(Garbage Collection) : 더 이상 사용하지 않는 메모리 공간을 모아 재사용하기 위함.

    }

}