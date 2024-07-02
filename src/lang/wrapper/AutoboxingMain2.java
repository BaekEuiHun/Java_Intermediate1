package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive 0> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토박싱

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토언박싱

        System.out.println("boxedvalue: " + boxedValue);
        System.out.println("unboxedvalue: " + unboxedValue);
    }
}
