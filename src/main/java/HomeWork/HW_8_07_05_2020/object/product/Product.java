package homeWork.hw_8_07_05_2020.object.product;

import java.util.StringJoiner;

public class Product {
    private long id;
    private String name;
    private long upc;
    private String manufacturer;
    private long prise;
    private int shelfLife;
    private long quantity;

    public Product() {

    }

    public Product(long id, String name, long upc, String manufacturer, long prise, int shelfLife, long quantity) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.prise = prise;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public Product(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.upc = b.upc;
        this.manufacturer = b.manufacturer;
        this.prise = b.prise;
        this.shelfLife = b.shelfLife;
        this.quantity = b.quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUpc() {
        return upc;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrise() {
        return prise;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o == null) {
            return false;
        } else if (o instanceof Product) {
            return this.id == ((Product) o).id && this.name.equals(((Product) o).name) && this.upc == ((Product) o).upc &&
                    this.manufacturer.equals(((Product) o).manufacturer) && this.prise == ((Product) o).prise &&
                    this.shelfLife == ((Product) o).shelfLife && this.quantity == ((Product) o).quantity;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (name != null ? name.hashCode() : 0) + upc + (manufacturer != null ? manufacturer.hashCode() : 0) +
                prise + shelfLife + quantity);
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("name=".concat(name))
                .add("upc=".concat(Long.toString(upc)))
                .add("manufacturer=".concat(manufacturer))
                .add("prise=".concat(Long.toString(prise)))
                .add("shelfLife=".concat(Integer.toString(shelfLife)))
                .add("quantity=".concat(Long.toString(quantity)));
        String result = "HomeWork.HW_8_07_05_2020.object.Product@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private long id;
        private String name;
        private long upc;
        private String manufacturer;
        private long prise;
        private int shelfLife;
        private long quantity;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder upc(long upc) {
            this.upc = upc;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder prise(long prise) {
            this.prise = prise;
            return this;
        }

        public Builder shelfLife(int shelfLife) {
            this.shelfLife = shelfLife;
            return this;
        }

        public Builder quantity(long quantity) {
            this.quantity = quantity;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
