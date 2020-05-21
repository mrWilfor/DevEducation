package homeWork.hw_9_19_05_2020.product;

import java.util.Objects;

public class SportsWear extends Product {
    private String size;
    private String typeOfWear;

    public SportsWear(
            String nameOfProduct,
            String color,
            String description,
            int prise,
            String size,
            String typeOfWear
    ) {
        super(nameOfProduct, "Sports wear", color, description, prise);
        this.size = size;
        this.typeOfWear = typeOfWear;

    }

    @Override
    public String getNameOfProduct() {
        return super.getNameOfProduct();
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getPrise() {
        return super.getPrise();
    }

    public String getSize() {
        return size;
    }

    public String getTypeOfWear() {
        return typeOfWear;
    }

    @Override
    public void setStatus(boolean status) {
        super.setStatus(status);
    }

    @Override
    public boolean getStatus() {
        return super.getStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SportsWear that = (SportsWear) o;
        return super.equals(o) && Objects.equals(size, that.size) &&
                Objects.equals(typeOfWear, that.typeOfWear);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (size != null ? size.hashCode() : 0) +
                (typeOfWear != null ? typeOfWear.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "sportsWear{" + super.toString() +
                "size='" + size + '\'' +
                ", typeOfWear='" + typeOfWear + '\'' +
                '}';
    }
}
