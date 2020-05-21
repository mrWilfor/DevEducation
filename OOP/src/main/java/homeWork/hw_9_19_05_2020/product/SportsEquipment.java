package homeWork.hw_9_19_05_2020.product;

public class SportsEquipment extends Product {

    public SportsEquipment(String nameOfProduct, String color, String description, int prise) {
        super(nameOfProduct, "Equipment", color, description, prise);
    }

    @Override
    public String toString() {
        return "SportsEquipment{" + super.toString() + '}';
    }
}
