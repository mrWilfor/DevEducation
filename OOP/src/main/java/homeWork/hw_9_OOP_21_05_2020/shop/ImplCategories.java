package homeWork.hw_9_OOP_21_05_2020.shop;

import homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Product;

public class ImplCategories extends ImplBasket implements homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Categories {
    private String name;

    public ImplCategories(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Product getProduct(int index) {
        if (index >= 0 && index < super.getListOfProduct().length && super.getListOfProduct() != null) {
            return super.getListOfProduct()[index];
        }

        return null;
    }
}
