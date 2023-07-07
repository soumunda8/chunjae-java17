package sec1;

public class Example3 {
    public static void main(String[] args) {
        // 관계연산 : ==(이다/일치), !=(아니다/불일치), >(초과/후), >=(이상/이후), <(미만/전), <=(이하/이전)
        int su1 = 90;
        int su2 = 85;
        int su3 = 88;
        System.out.println("su1 == su2 : " + (su1 == su2));
        System.out.println("su1 != su2 : " + (su1 != su2));
        System.out.println("su1 > su2 : " + (su1 > su2));
        System.out.println("su2 >= su3 : " + (su2 >= su3));
        System.out.println("su1 < su2 : " + (su1 < su2));
        System.out.println("su1 <= su2 : " + (su1 <= su2));

        // 논리연산 : AND(&&), OR(||), NOT(!)
        // AND 연산
        System.out.println("su1 <= su2 && su2 >= su3 : " + (su1 <= su2 && su2 >= su3));
        System.out.println("su1 >= su2 && su2 >= su3 : " + (su1 >= su2 && su2 >= su3));
        System.out.println("su1 <= su2 && su2 <= su3 : " + (su1 <= su2 && su2 <= su3));
        System.out.println("su1 >= su2 && su2 <= su3 : " + (su1 >= su2 && su2 <= su3));
        // OR 연산
        System.out.println("su1 <= su2 || su2 >= su3 : " + (su1 <= su2 || su2 >= su3));
        System.out.println("su1 >= su2 || su2 >= su3 : " + (su1 >= su2 || su2 >= su3));
        System.out.println("su1 <= su2 || su2 <= su3 : " + (su1 <= su2 || su2 <= su3));
        System.out.println("su1 >= su2 || su2 <= su3 : " + (su1 >= su2 || su2 <= su3));
        // NOT 연산
        System.out.println("!(su1 >= su2) : " + (!(su1 >= su2)));
        System.out.println("!(su2 >= su3) : " + (!(su2 >= su3)));
    }
}