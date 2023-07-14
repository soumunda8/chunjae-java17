package sec1;

public class Score {

    private int num;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public int getNum() {
        return num;
    }

    public Score() { }

    public Score(int num) {
        this.num = num;
    }

    public Score(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Score(int num, String name, int kor) {
        this.num = num;
        this.name = name;
        this.kor = kor;
    }

    public Score(int num, String name, int kor, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public Score(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    // 사용자 정의 함수
    public void prtNum(int num) {
        System.out.println("[prtNum 실행]학번 : " + num);
    }

    public void prtName(String num) {  // scope(유효범위)
        //this.setNum(1004);     // this. = 자기 자신의 클래스의 메소드
        System.out.println("[prtNum 실행]이름 : " + num);
    }

}