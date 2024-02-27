public abstract class MotorTransport extends Transport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Меняем двигатель");
    }

    public void check() {
        super.check();
        checkEngine();
    }
}
