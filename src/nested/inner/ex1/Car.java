package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    public void start() {
        engine.start();
        System.out.println(model + "시작 완료");
    }
}
