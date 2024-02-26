public class Main {
    public static void main(String[] args) {

        Car car= new Car("car1", 2);
        Car car1 = new Car("car2", 2);

        Truck truck = new Truck("truck1", 3);
        Truck truck1 = new Truck("truck2", 2);
        Bicycle bicycle = new Bicycle("bicycle1", 1);
        Bicycle bicycle1 =  new Bicycle("bicycle2", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        serviceStation.check(car1);
        serviceStation.check(truck1);
        serviceStation.check(truck);
        serviceStation.check(bicycle);
        serviceStation.check(bicycle1);

    }
}