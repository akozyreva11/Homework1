public class Main {
    public static void main(String[] args) {

        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        ServiceStation serviceStationPrint = new ServiceStationPrint();
        serviceStationPrint.updateTyre(car);
        serviceStationPrint.checkEngine(bicycle);
        serviceStationPrint.checkTrailer(truck);


    }
}