package sec2;

public class MultiEx2 {

    public static void main(String[] args) {

        Multi2 m1 = new Multi2<String, Integer> ("student", 98);
        Multi2 m2 = new Multi2<String, Integer> ("teacher", 24);
        Multi2 m3 = new Multi2<String, Integer> ("teacher", 24);
        
        // static 으로 선언되서 연관으로 안나옴 -> 하나하나 다쳐야함
        boolean res1 = m1.compare(m1, m2);
        System.out.println("비교결과1 : " + res1);

        boolean res2 = m1.compare(m2, m3);
        System.out.println("비교결과2 : " + res2);

    }

}