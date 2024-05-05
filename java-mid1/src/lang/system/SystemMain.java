package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMills = System.currentTimeMillis();
        System.out.println("currentTimeMills = " + currentTimeMills);

        // 현재 시간(나노초)를 가져온다.
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        // 환경 변수를 읽는다.
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);

        // 시스템 속성을 읽는다.
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다. -> 운영체제나 하드웨어에서 복사.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("originalArray = " + Arrays.toString(originalArray));
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
