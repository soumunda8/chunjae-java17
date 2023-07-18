package sec1;

class Dbl {

    private int col1;
    private String col2;

    public void fnc1() {
        System.out.println("이중 클래스의 메소드 1입니다.");
    }

    public int getCol1() {
        return col1;
    }

    public void setCol1(int col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

}

public class Outer {

    private int item1;
    private String item2;

    public Dbl db;  // 1. 필드로 기용

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public void method1() {

        System.out.println("외부 클래스의 메소드 1 입니다.");

    }

    // default class 접근하기 위한 메서드
    /*
    public Dbl getDbl() {
        return new Dbl();
    }
    */
    // 2. 생성메소드를 이용하는 방법
    public void getDbl() {
        Dbl dbl = new Dbl();
    }
    
    public class Inner {   // 멤버 클래스

        private int item3;
        private String item4;

        public int getItem3() {
            return item3;
        }

        public void setItem3(int item3) {
            this.item3 = item3;
        }

        public String getItem4() {
            return item4;
        }

        public void setItem4(String item4) {
            this.item4 = item4;
        }

        public void method2() {

            System.out.println("내부 클래스의 메소드 2 입니다.");

        }
        
    }
    
}