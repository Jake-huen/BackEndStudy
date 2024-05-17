package nested.question;

public class OuterClass1Main {
    public static void main(String[] args) {
        // 정적 중첩클래스
        OuterClass1.NestedClass nested = new OuterClass1.NestedClass();
        nested.hello();
    }
}
