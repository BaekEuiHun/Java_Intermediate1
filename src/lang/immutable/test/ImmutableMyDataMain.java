package lang.immutable.test;

public class ImmutableMyDataMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);

        System.out.println("2025 -> date1");
        date1 = new ImmutableMyDate(2025, 1, 1);
        //date1 = date1.withYear(2025);
        //date1.withYear(2025); 절대 불가!! 반환값 받아야한다.
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);


    }
}
