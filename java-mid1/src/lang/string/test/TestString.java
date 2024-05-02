package lang.string.test;

public class TestString {

    public static void main(String[] args) {
        String url = "https://www.example.com";
        System.out.println(url.startsWith("https"));

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int length = 0;
        for (String str : arr) {
            length += str.length();
        }
        System.out.println("length = " + length);

        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);

        String str6 = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index2 = str6.indexOf(key);

        while (index2 >= 0) {
            index2 = str6.indexOf(key, index2 + 1);
            count += 1;
        }
    }
}
