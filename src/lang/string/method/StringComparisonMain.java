package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Hello Java";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str2: " + str1.equalsIgnoreCase(str2)); //case : 대소문자

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));  // a와 b의 칸수차이
        System.out.println("str1 compareTo str3:" + str1.compareTo(str3));

        System.out.println("str1 start with 'Hello':" + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java':" + str1.endsWith("Java"));
    }
}
