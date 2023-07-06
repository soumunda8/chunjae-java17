package sec2;

public class Example7 {
    public static void main(String[] args) {
        
        // 자동형변환(Auto Casting) = 해당 타입에서 크기가 같거나 더 큰 타입에 대입되었을 때 발생함
        
        int data1 = 1004;
        float data2 = data1;

        char data3 = 'K';
        int data4 = data3;  // 아스키코드로 변환됨 저장됨, 한글은 유니코드로 변환되서 저장됨

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);
        
        /*
        // byte(1) < char(2), shor(2) < int(4) < long(8)
        // float(4) < double(8)

        // 자동형변환이 안된다 -> 오버플로우 현상이 일어남
        int data5 = 2048;
        byte data6 = data5;
        */
        
        // 강제형변환(Force Casting) = 형변환연산자를 활용하는 형변환
        // 오류는 안 나고, 범위 안이면 출력할 수 있게 하는 방법 - 단, 데이터의 정확성을 보장할 수 없다.
        int data5 = 2048;
        byte data6 = (byte) data5;

        System.out.println("data5 = " + data5);
        System.out.println("data6 = " + data6);
    }
}