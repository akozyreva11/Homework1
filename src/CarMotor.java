public class CarMotor extends Transport {
    public CarMotor(String modelName, int wheelsCount) {
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
