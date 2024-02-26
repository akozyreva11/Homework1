import java.util.Arrays;

public class ServiceStationPrint implements ServiceStation {

    @Override
    public void updateTyre(Car[] car) {
        for (int i = 0; i < car.length; i++) {
            Car cars = car[i];
            System.out.println("Обслуживаем " + cars.getModelName());
            if (car[i].getWheelsCount() > 0)
                System.out.println("Меняем покрышку");
                System.out.println("Проверяем двигатель");
        }
    }


    @Override
    public void checkEngine(Bicycle[] bicycles) {
            for (int i = 0; i < bicycles.length; i++) {
                Bicycle bicycless = bicycles[i];
                if (bicycles[i].getWheelsCount() > 0) {
                    System.out.println("Обслуживаем " + bicycless.getModelName());
                    System.out.println("Меняем покрышку");
                }
            }
        }

        @Override
        public void checkTrailer (Truck[]truck){
            for (int i = 0; i < truck.length; i++) {
                Truck trucks = truck[i];
                System.out.println("Обслуживаем " + trucks.getModelName());
                if (truck[i].getWheelsCount() > 0) {
                    System.out.println("Проверяем прицеп");
                    System.out.println("Проверяем двигатель");
                }
            }
        }
    }
