package sec1;

public class Qna extends Board{
    
    // static = 정적인
    // final = 최후
    // final static | static final = 순서 상관 없음.
    // 공유 데이터 = 변하지 않는 값
    public static final String DUMMY = "테스트 글 제목";

    // 계층형 게시판
    private int level;
    private int parno;

    public Qna() {super();}

    public Qna(int no) {
        super(no);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }

    @Override
    public void method2() {
        super.method2();
        System.out.println("Board 를 상속받은 Qna 입니다.");
    }

}