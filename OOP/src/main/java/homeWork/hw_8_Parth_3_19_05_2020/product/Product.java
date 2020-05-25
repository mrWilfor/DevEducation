package homeWork.hw_8_Parth_3_19_05_2020.product;

public abstract class Product implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Product {
    private String nameOfProduct;
    private String category;
    private String color;
    private String description;
    private int prise;
    private boolean status = false;

    public Product(String nameOfProduct, String category, String color, String description, int prise) {
        this.nameOfProduct = nameOfProduct;
        this.category = category;
        this.color = color;
        this.description = description;
        this.prise = prise;
    }

    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.prise == ((Product) o).prise &&
                this.nameOfProduct.equals(((Product) o).nameOfProduct) &&
                this.category.equals(((Product) o).category) &&
                this.color.equals(((Product) o).color) &&
                this.description.equals(((Product) o).description);
    }

    @Override
    public int hashCode() {
        return 31 * (nameOfProduct != null ? nameOfProduct.hashCode() : 0) +
                (category != null ? category.hashCode() : 0) + (color != null ? color.hashCode() : 0) +
                (description != null ? description.hashCode() : 0) + prise;
    }

    @Override
    public String toString() {
        return "nameOfProduct='" + nameOfProduct + '\'' +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                ", prise='" + prise + '\'';
    }
}
