package sec1;

public class Shape {

    // 패키지가 달라지면 접근제한이 생길 수 있음.

    // 기본 접근제한자 : public > protected > default > private

    // 필드의 접근제한자 : public > default(생략) > private
    // public : 어떤 패키지에서도 접근할 수 있음.
    // default : 같은 패키지에 있는 클래스만 접근할 수 있음.
    // ★private : 현재 클래스 내부에서만 접근할 수 있음.

    // Member Field(멤버 필드)
    private String type;
    private int length;     // 길이
    private double area;    // 면적

    // Member Constructor
    // 생성자는반드시 클래스 이름이랑 같아야 함.
    public Shape() {}   // 아예 생성자가 없을때는 생략해도 되지만, 아래 처럼 매개변수가 선언된 생산자가 있으면 필수로 등록해야됨
    public Shape(String type) {
        // this = 현재 클래스 내부를 의미
        this.type = type;
    }
    public Shape(String type, int length) {
        this.type = type;
        this.length = length;
    }

    // 멤버 메소드 (Member Method) : 사용자 정의 함수
    // area 계산 함수
    public double calcArea() {

        if(this.type.equals("square")) {
            this.area = this.length * this.length;
        } else if(this.type.equals("triangle")) {
            this.area = (this.length * 10) / 2;
        } else if(this.type.equals("circle")) {
            this.area = this.length * this.length * 3.14159;
        } else {
            this.area = 0.0f;
        }

        return this.area;

    }

    // setMethod(저장 메소드) : 각 필드에 값을 저장할 목적
    // getter & setter = 정보은닉 / 보안을 위해서
    // setter 는 void 를 사용해서 return 하지 않음.
    // getter 는 같은 데이터 타입으로 return 을 설정함.
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}