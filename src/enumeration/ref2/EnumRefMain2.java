package enumeration.ref2;


public class EnumRefMain2 {
    public static void main(String[] args)  {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            print(grade, price);

        }
    }

    private static void print(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 : " + grade.discount(price));
    }
}
