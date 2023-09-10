package architecture;

public class Main {
    public static void main(String[] args) {
        House woodenHouse = new WoodenHouse();

        House woodenHouseWithGarage = new Garage(woodenHouse);

        System.out.println(woodenHouse.getInfo());
        System.out.println(woodenHouse.getPrice());

        System.out.println(woodenHouseWithGarage.getInfo());
        System.out.println(woodenHouseWithGarage.getPrice());
    }
}