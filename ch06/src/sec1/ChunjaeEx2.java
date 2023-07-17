package sec1;

public class ChunjaeEx2 {

    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();

        //c1.no = 10; - private 이므로, 같은 클래스 내부에서만 접근 가능하므로 접근 불가
        c1.partNo = 1234; // default 이므로, 같은 패키지에서만 접근 간가능하므로 접근 가능
        c1.point = 200; // protected 이므로, 같은 패키지에 있거나 상속 관계에 있을 때만 가능하므로 접근 가능
        c1.name = "안녕"; // public 이므로, 어느패키지나 클래스에 관계없이 모두 접근 가능하므로 접근 가능
        System.out.println(Chunjae.PI * 20 * 20);

        // public > protected > default > private

        Im i1 = new Im(); // default 이므로, 같은 패키지에 있는 클래스가 아니므로 사용 가능
        Honey h1 = new Honey(); // default 이므로, 같은 패키지에 있는 클래스가 아니므로 사용 가능

        int[] k = new int[100];

        Im[] i2 = new Im[100];   // 객체 배열 s[0], s[1] ~ s[9]
        // i2[0].num ~ i2[9].num
        // i2[0].data ~ i2[9].data

        for(int a = 0; a < i2.length; a++){    // 객체의 배열은 원소를 재생성해야함
            i2[a] = new Im();
            i2[a].setNum(a+1);
            i2[a].setData("아이엠" + (a+1));
        }

        for(int a = 0; a < i2.length; a++) {
            System.out.println("아이엠 넘버는 [" + i2[a].getNum() + "] 입니다.");
            System.out.println("아이엠 데이터는 [" + i2[a].getData() + "] 입니다.");
            System.out.println("---------------------------------------------");
        }

    }

}