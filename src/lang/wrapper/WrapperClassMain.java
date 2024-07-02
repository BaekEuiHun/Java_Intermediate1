package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longobj = Long.valueOf(10);
        Double doubleobj = Double.valueOf(10);
        System.out.println("newInteger: " + newInteger);
        System.out.println("integerobj: " + integerObj);
        System.out.println("longobj: " + longobj);
        System.out.println("doubleobj: " + doubleobj);

        System.out.println("내부값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue : " + intValue);
        long longValue = longobj.longValue();
        System.out.println("longValue = " + longValue);
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
