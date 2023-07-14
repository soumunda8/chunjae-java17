package sec1;

public class Board {

    private int no;
    private String title;
    private String contents;
    private String resdate;
    private int viewcnt;

    public Board() {}   // no argument constructor = lombok | constructor 없을 땐 자동 생성

    public Board(int no) {
        this.no = no;
    }

    public Board(int no, String title) {
        this.no = no;
        this.title = title;
    }

    public Board(int no, String title, String resdate) {
        this.no = no;
        this.title = title;
        this.resdate = resdate;
    }

    public Board(int no, String title, String contents, String resdate) {
        this.no = no;
        this.title = title;
        this.contents = contents;
        this.resdate = resdate;
    }

    public Board(int no, String title, String contents, String resdate, int viewcnt) {
        this.no = no;
        this.title = title;
        this.contents = contents;
        this.resdate = resdate;
        this.viewcnt = viewcnt;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public int getViewcnt() {
        return viewcnt;
    }

    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }

    // final static 을 선언하면 오버라이딩(상속) 안됨
    // static 만 붙어도 상속은 되더라도, 오버라이딩(덮어쓰기와 비슷) 안됨
    public final static void method1() {
        System.out.println("여기는 Board1 입니다.");
    }

    public void method2() {
        System.out.println("여기는 Board2 입니다.");
    }

    public static void method3() {
        System.out.println("여기는 Board3 입니다.");
    }

}