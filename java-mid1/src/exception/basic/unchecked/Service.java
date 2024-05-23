package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리할 수 있습니다.
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("e = " + e);
        }
    }

    // 예외를 잡지 않아도 자연스럽게 상위로 넘어갑니다.
    public void callThrow() {
        client.call();
    }
}
