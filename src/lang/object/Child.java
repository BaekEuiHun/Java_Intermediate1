package lang.object;

public class Child extends Parent {


    //명시적으로 상속받았으므로 Object 상속 X
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
