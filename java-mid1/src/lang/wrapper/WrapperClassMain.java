package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 대신 valueOf()를 사용해라
        Integer integerObject = Integer.valueOf(10); // -128~127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("intValue = " + integerObject.intValue());
        System.out.println("doubleObj.doubleValue() = " + doubleObj.doubleValue());
        System.out.println("longObj = " + longObj.longValue());
        System.out.println();
        System.out.println("비교");
        System.out.println("newInteger = " + (newInteger == integerObject));
        System.out.println(newInteger.equals(integerObject));
    }
}
