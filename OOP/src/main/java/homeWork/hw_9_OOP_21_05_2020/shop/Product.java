package homeWork.hw_9_OOP_21_05_2020.shop;

import java.util.Objects;

public class Product implements homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Product {
    private String name;
    private int prise;
    private int rating;

    public Product(String name, int prise, int rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrise() {
        return this.prise;
    }

    @Override
    public int getRating() {
        return this.rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;

        return prise == product.prise &&
                rating == product.rating &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise, rating);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise='" + prise + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
