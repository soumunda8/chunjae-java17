package sec1;

// Type -> T
// Element(속성, 필드) -> E
// Key -> K
// Number -> N
// Value -> V
// Result -> R
// Question -> Q
// Query -> Q
// Generic -> G

// 첫 번째 글자만 약어로 만들어 인자를 사용하는 것이 관례
// public class 클래스명<인자> {}
public class Gen2<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}