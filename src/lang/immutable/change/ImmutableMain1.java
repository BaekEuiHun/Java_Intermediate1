package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj add = obj1.add(20); //꼭 반환값해서 넣기 obj1.add(20); 하면 안됨.

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("add = " + add.getValue());
    }
}
