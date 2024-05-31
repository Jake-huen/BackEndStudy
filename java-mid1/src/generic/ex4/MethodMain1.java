package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        Integer integer = GenericMethod.<Integer>genericMethod(i);
        System.out.println("integer = " + integer);
        Integer integer1 = GenericMethod.<Integer>numberMethod(i);
        System.out.println("integer1 = " + integer1);
        GenericMethod.<Double>numberMethod(190.0);
    }
}
