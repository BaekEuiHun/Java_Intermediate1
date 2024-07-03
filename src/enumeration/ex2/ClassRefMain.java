package enumeration.ex2;


public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC : " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD : " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND : " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC : " + ClassGrade.BASIC);
        System.out.println("ref GOLD : " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND : " + ClassGrade.DIAMOND);

        //참조값이 모두 다르다. (타입은 ClassGrade로 같다)
    }
}
