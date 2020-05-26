package homeWork.hw_8_Parth_3_19_05_2020.product;

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

    public String getSize() {
        return size;
    }

    public String getTypeOfWear() {
        return typeOfWear;
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
        return "SportsWear{" + super.toString() +
                ", size='" + size + '\'' +
                ", typeOfWear='" + typeOfWear + '\'' +
                '}';
    }
}
