package architecture;

public class WoodenHouse extends House {

    public WoodenHouse() {
        info = "Деревянный дом";
    }

    @Override
    public int getPrice() {
        return 25_000;
    }
}
