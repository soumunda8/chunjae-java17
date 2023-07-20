package sec1;

public class GenEx1 {

    public static void main(String[] args) {
        
        Gen1 gen1 = new Gen1();
        gen1.method1("몬스타엑스");
        
        // 일반 클래스로 만들어진 필드의 값은 오로지 한 가지 타입 밖에 지원되지 않으므로, t 필드는 String 이므로 setT()의 저장되는 값은 String 으로 저장해야함
        // gen1.setT(20);       // 제너릭 함수가 아니기 때문에 오류남
        gen1.setT("몬스타엑스");
        
    }
    
}