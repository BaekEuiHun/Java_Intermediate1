package lang.mutable;

public class ImmutableObjMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(30);

        ImmutableObj obj2 = new ImmutableObj(40);
        ImmutableObj result = obj2.addValue(30);

        System.out.println("obj2.getValue() = " + result.getValue());

    }
}
