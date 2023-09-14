package architecture;

import java.awt.*;

public abstract class Car implements CarRefueling, CarWindshield, CarFary, CarMirrors, CarWash {

    // Основные характеристики автомобиля
    private String make;           // марка
    private String model;          // модель
    private Color color;           // цвет
    private CarType carType;       // тип кузова
    private int wheelsCount;       // количество колес
    private FuelType fuelType;     // тип топлива
    private GearboxType gearboxType; // тип коробки передач
    private double engineCapacity; // объем двигателя

    // Конструктор для инициализации основных характеристик автомобиля
    public Car(String make, String model, Color color, CarType carType, int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
    }

    // Абстрактные методы, представляющие основные действия, которые может выполнять автомобиль
    public abstract void move();  // движение
    public abstract void service(); // обслуживание
    public abstract void switchGear(); // переключение передач
    public abstract void turnOnHeadlights(); // включение фар
    public abstract void turnOnWipers(); // включение дворников
    public abstract void turnOnFogLights(); // включение противотуманных фар
    public abstract void carryCargo(); // перевозка груза

    // Реализации методов интерфейсов для обслуживания автомобиля
    @Override
    public void washCar() {
        System.out.println("Автомобиль моется");
    }

    @Override
    public void wipeWindshield() {
        System.out.println("Автомобиль протирает ветровое стекло");
    }

    @Override
    public void wipeHeadlights() {
        System.out.println("Автомобиль протирает фары");
    }

    @Override
    public void wipeMirrors() {
        System.out.println("Автомобиль протирает зеркала");
    }
}