package homeWork.hw_8_Parth_3_19_05_2020.product;

public class SportsEquipment extends ImplProduct {

    public SportsEquipment(String nameOfProduct, String color, String description, int prise) {
        super(nameOfProduct, "Equipment", color, description, prise);
    }

    @Override
    public String toString() {
        return "SportsEquipment{" +
                "nameOfProduct='" + super.getName() + '\'' +
                ", nameOfDepartment='" + super.getNameOfDepartment() + '\'' +
                ", category='" + super.getCategory() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", prise=" + super.getPrise() +
                ", status=" + super.getStatus() +
                '}';
    }
}
