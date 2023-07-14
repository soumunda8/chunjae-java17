package sec1;

public class Member {

    private String id;
    private String pw;
    private String email;
    private String name;
    private String tel;
    private String birth;
    private int point;

    public Member() { this("id"); }

    public Member(String id) {
        this(id, "1234");
    }

    public Member(String id, String pw) {
        this(id, pw, "ddd@naver.com");
    }

    public Member(String id, String pw, String email) {
        this(id, pw, email, "nick");
    }

    public Member(String id, String pw, String email, String name) {
        this(id, pw, email, name, "010-5555-7777");
    }

    public Member(String id, String pw, String email, String name, String tel) {
        this(id, pw, email, name, tel, "2011-01-24");
    }

    public Member(String id, String pw, String email, String name, String tel, String birth) {
        this(id, pw, email, name, tel, birth, 500);
    }

    public Member(String id, String pw, String email, String name, String tel, String birth, int point) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.name = name;
        this.tel = tel;
        this.birth = birth;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}