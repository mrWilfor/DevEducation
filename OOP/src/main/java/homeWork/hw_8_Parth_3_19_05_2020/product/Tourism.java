package homeWork.hw_8_Parth_3_19_05_2020.product;

public class Tourism extends ImplProduct {
    private String instruction;

    public Tourism(String nameOfProduct, String color, String description, int prise, String instruction) {
        super(nameOfProduct, "Tourism", color, description, prise);
        this.instruction = instruction;
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
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Tourism) {
            return super.equals(o) && this.instruction.equals(((Tourism) o).instruction);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (instruction != null ? instruction.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "Tourism{" +
                "nameOfProduct='" + super.getName() + '\'' +
                ", nameOfDepartment='" + super.getNameOfDepartment() + '\'' +
                ", category='" + super.getCategory() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", prise=" + super.getPrise() +
                ", status=" + super.getStatus() +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
