package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values)); // 배열의 참조값이 아니라 배열 내부의 값을 출력하기 위해 사용
        for (Grade value : values) {
            System.out.println("value.name() = " + value.name());
        }

        // String -> ENUM 변환
        String input = "GOLD"; // 잘못 입력받으면 변환안되고 컴파일 오류
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
