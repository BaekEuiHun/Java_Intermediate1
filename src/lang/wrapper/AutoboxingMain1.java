package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive 0> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedvalue: " + boxedValue);
        System.out.println("unboxedvalue: " + unboxedValue);
    }
}
