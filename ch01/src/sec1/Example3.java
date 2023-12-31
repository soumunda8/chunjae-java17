package sec1;

public class Example3 {
    /*
    변수명 규칙
    1. 영문 소문자로 시작 -> 숫자는 불가능, 대문자는 관례상 사용하지 않는 편
    2. 예약어는 사용할 수 없음 -> 예약어=키워드=정의어 (package, public, class 등)
    3. 변수명 중간에 공백을 사용할 수 없음
    4. 시작시 $ 또는 _(언더스코어/언더바)로 시작할 수 있음
    5. 대문자와 소문자가 서로 엄격히 다름

    변수명 규칙 관례
    1. 누구나 그 변수가 어떠한 역활을 하는지 쉽게 알 수 있도록
    2. 여러 단어로 변수명을 정할 경우 = 스네이크(파스칼케이스)방식 또는 카멜방식으로 연결함
       ex1) 스네이크 방식 = chunjae_it_center - 파이썬에서 자주 사용
       ex2) 카멜 방식 = chunjaeItCenter - 자바에서 자주 사용
    3. 개발기준서를 기준으로 접두어나 접두사를 붙여 정함 - 가장중요!
       ex) 데이터 단순 저장일 경우 - 해당 변수는 모두 set으로 시작함 = setKim
    */
    
    int a, a1, $a, _a;
    int Aa; // 대문자로 시작하지 않도록 유의
    //int k*j; 연산자를 변수로 활용할 수 없음
    //int 1a;  숫자로 시작할 수 없음
    //int a b; 변수명 중간에 띄어쓰기 할 수 없음
    //int class; 예약어는 사용할 수 없음
}