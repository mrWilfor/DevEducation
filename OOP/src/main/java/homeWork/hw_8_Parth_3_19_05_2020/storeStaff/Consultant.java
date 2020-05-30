package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;

public class Consultant extends ImplStaff {
    private boolean status;

    public Consultant(String name, String department) {
        super(name, "Consultant", department);
        this.status = true;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return super.equals(o) && this.status == ((Consultant) o).getStatus();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (status ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Consultant{" + super.toString() + "}";
    }

    public void consultation(ImplProduct implProduct) {
        System.out.println(implProduct.getDescription());
        setStatus(false);
    }
}
