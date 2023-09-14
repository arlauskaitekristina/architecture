package architecture;

import java.awt.*;

/**
 * Класс ClearCar, представляющий автомобиль уборщик
 * Этот класс наследуется от абстрактного класса Car и реализует методы, определенные в нем,
 * а также дополнительный метод для уборки улиц, представленный в интерфейсе StreetSweeperService
 */
public class ClearCar extends Car implements CarRefueling, CarWash, CarSweep {

    // Конструктор для инициализации характеристик комбайна
    public ClearCar(String make, String model, Color color, CarType carType, int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        super(make, model, color, carType, wheelsCount, fuelType, gearboxType, engineCapacity);
    }

    // Реализация абстрактных методов класса Car
    @Override
    public void move() {
        System.out.println("Уборщик движется по полю");
    }

    @Override
    public void service() {
        System.out.println("Уборщик на техническом обслуживании");
    }

    @Override
    public void switchGear() {
        System.out.println("Уборщик переключает передачу");
    }

    @Override
    public void turnOnHeadlights() {
        System.out.println("Уборщик включает фары");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("Уборщик включает дворники");
    }

    @Override
    public void turnOnFogLights() {
        System.out.println("Уборщик включает противотуманные фары");
    }

    @Override
    public void carryCargo() {
        System.out.println("Уборщик перевозит урожай");
    }

    // Реализация методов интерфейсов
    @Override
    public void refuel(FuelType fuelType) {
        System.out.println("Уборщик заправляется топливом типа: " + fuelType);
    }

    @Override
    public void wipeWindshield() {
        System.out.println("Уборщик протирает ветровое стекло");
    }

    @Override
    public void wipeHeadlights() {
        System.out.println("Уборщик протирает фары");
    }

    @Override
    public void wipeMirrors() {
        System.out.println("Уборщик протирает зеркала");
    }

    @Override
    public void washCar() {
        System.out.println("Уборщик моется на автомойке");
    }

    // Реализация дополнительного метода интерфейса CarSweep
    @Override
    public void sweepStreet() {
        System.out.println("Уборщик подметает улицу");
    }
}