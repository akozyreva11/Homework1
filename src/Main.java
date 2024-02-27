public class Main {
    public static void main(String[] args) {

        Transportable car = new Car("car1", 1);
        Transportable car1 = new Car("car2", 1);
        Transportable truck = new Truck("truck1", 1);
        Transportable truck1 = new Truck("truck2", 1);
        Transportable bicycle = new Bicycle("bicycle1", 1);
        Transportable bicycle1 = new Bicycle("bicycle2", 1);
        Transportable[] transports = {car, car1, truck, truck1, bicycle, bicycle1};
        ServiceStation serviceStation = new ServiceStation();

        for (int i = 0; i < transports.length; i++) {
            serviceStation.check(transports[i]);
        }
    }
}