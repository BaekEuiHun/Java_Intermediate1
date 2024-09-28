package lang.mutable;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public ImmutableObj addValue(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }
}
