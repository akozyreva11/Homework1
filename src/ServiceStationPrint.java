public class ServiceStationPrint implements ServiceStation {

    @Override
    public void updateTyre(Car[] car) {
        if (car != null) {
            for (int i = 0; i < car.length; i++) {
                Car cars = car[i];
                System.out.println("Обслуживаем " + cars.getModelName());
                for (int ii = 0; ii < car[i].getWheelsCount(); ii++) {
                }
                System.out.println("Меняем покрышку");
                System.out.println("Проверяем двигатель");
            }
        }
    }

    @Override
    public void checkEngine(Bicycle[] bicycles) {
        if (bicycles != null) {
            for (int i = 0; i < bicycles.length; i++) {
                Bicycle bicycless = bicycles[i];
                System.out.println("Обслуживаем " + bicycless.getModelName());
                for (int ii = 0; ii < bicycles[i].getWheelsCount(); ii++) {
                }
                System.out.println("Меняем покрышку");
            }
        }
    }

    @Override
    public void checkTrailer(Truck[] truck) {
        if (truck != null) {
            for (int i = 0; i < truck.length; i++) {
                Truck trucks = truck[i];
                System.out.println("Обслуживаем " + trucks.getModelName());
                for (int ii = 0; ii < truck[i].getWheelsCount(); ii++) {
                }
                System.out.println("Проверяем прицеп");
                System.out.println("Проверяем двигатель");
            }

        }
    }
}
