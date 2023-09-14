package architecture;

/**
 * Интерфейс для описания сервиса по заправке автомобиля топливом
 */
public interface CarRefueling {
    void refuel(FuelType fuelType);
}