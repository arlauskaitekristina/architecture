package architecture;


import java.awt.*;

/**
 * Главный класс приложения, демонстрирующий создание различных типов автомобилей и
 * их взаимодействие с различными сервисами
 */
public class Main {

    public static void main(String[] args) {
        // Создаем объекты различных автомобилей
        SportCar sportCar = new SportCar("Лада", "Гранта", Color.RED, CarType.SPORT, 4, FuelType.GASOLINE, GearboxType.MANUAL, 3.9);
        FlyCar flyCar = new FlyCar("XPeng", "HT Aero", Color.WHITE, CarType.FLYING, 3, FuelType.ELECTRIC, GearboxType.AUTOMATIC, 2.0);
        ClearCar clearCar = new ClearCar("John Deere", "X9", Color.GREEN, CarType.PICKUP, 4, FuelType.DIESEL, GearboxType.MANUAL, 13.6);

        // Проводим демонстрацию функциональности каждого автомобиля
        System.out.println("Спортивный автомобиль:");
        sportCar.move();
        sportCar.refuel(FuelType.GASOLINE);
        sportCar.washCar();
        sportCar.wipeHeadlights();
        sportCar.wipeMirrors();
        sportCar.wipeWindshield();

        System.out.println("\nЛетающий автомобиль:");
        flyCar.move();
        flyCar.fly();
        flyCar.washCar();

        System.out.println("\nУборщик:");
        clearCar.move();
        clearCar.refuel(FuelType.DIESEL);
        clearCar.sweepStreet();
        clearCar.washCar();

        // Демонстрируем функционал автомойки
        System.out.println("\nДемонстрация работы автомойки:");
        CarWash carWash = new CarWash() {
            @Override
            public void washCar() {
                System.out.println("Автомобиль моется на автомойке");
            }
        };
        carWash.washCar();
    }
}