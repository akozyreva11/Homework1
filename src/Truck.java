public class Truck extends CarMotor {

    public Truck
            (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");

    }

    public void check() {
        super.check();
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}