package homeWork.hw_8_Parth_3_19_05_2020.product;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Department;


public abstract class ImplProduct implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Product {
    private String name;
    private String nameOfDepartment;
    private String category;
    private String color;
    private String description;
    private int prise;
    private boolean status = false;

    public ImplProduct(String name, String category, String color, String description, int prise) {
        this.name = name;
        this.category = category;
        this.color = color;
        this.description = description;
        this.prise = prise;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    @Override
    public void setNameOfDepartment(Department department) {
        this.nameOfDepartment = department.getName();
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
        return this.prise == ((ImplProduct) o).prise &&
                this.name.equals(((ImplProduct) o).name) &&
                this.category.equals(((ImplProduct) o).category) &&
                this.color.equals(((ImplProduct) o).color) &&
                this.description.equals(((ImplProduct) o).description);
    }

    @Override
    public int hashCode() {
        return 31 * (name != null ? name.hashCode() : 0) +
                (category != null ? category.hashCode() : 0) + (color != null ? color.hashCode() : 0) +
                (description != null ? description.hashCode() : 0) + prise;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", nameOfDepartment='" + nameOfDepartment + '\'' +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                ", prise=" + prise +
                ", status=" + status +
                '}';
    }
}
