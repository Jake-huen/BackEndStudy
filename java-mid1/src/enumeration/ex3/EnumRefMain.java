package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + Grade.BASIC); // toString() 오버라이딩 되어 있다.

        // 참조값 확인
        System.out.println("ref class BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref class GOLD = " + refValue(Grade.GOLD.getClass()));
        System.out.println("ref class DIAMOND = " + refValue(Grade.DIAMOND.getClass()));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
