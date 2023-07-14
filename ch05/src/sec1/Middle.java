package sec1;

public class Middle extends Score {

    private int history;

    public Middle() {
        //this();     // 자기 자신의 클래스의 생성자
        super();    // 부모 클래스 생성자의 - public Score() { } - 가 실행됨
    }
    
    public Middle(int history) {
        this.history = history;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void prtPoint() {
        System.out.println("영어 : " + super.getEng());
    }

}