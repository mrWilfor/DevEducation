package homeWork.hw_9_OOP_21_05_2020.shop;

import homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Product;

public class Categories implements homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Categories {
    private String name;
    private Product[] listOfProduct;

    public Categories(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Product[] getListOfProduct() {
        return this.listOfProduct;
    }

    @Override
    public void addProduct(Product product) {
        if (product != null) {
            if (listOfProduct == null) {
                listOfProduct = new Product[1];
                listOfProduct[0] = product;
            } else {
                Product[] newListOfProduct = new Product[listOfProduct.length + 1];

                for (int i = 0; i < listOfProduct.length; i++) {
                    newListOfProduct[i] = listOfProduct[i];
                }

                newListOfProduct[newListOfProduct.length - 1] = product;
                listOfProduct = newListOfProduct;
            }
        }
    }

    @Override
    public void deleteProduct(Product product) {
        if (product != null && listOfProduct != null && listOfProduct.length != 0) {
            int index = -1;

            for (int i = 0; i < listOfProduct.length; i++) {
                if (listOfProduct[i].equals(product)) {
                    index = i;
                }
            }

            if (index != -1) {
                Product[] newListOfProduct = new Product[listOfProduct.length - 1];

                for (int i = 0; i < index; i++) {
                    newListOfProduct[i] = listOfProduct[i];
                }

                for (int i = index + 1; i < listOfProduct.length; i++) {
                    newListOfProduct[i - 1] = listOfProduct[i];
                }

                listOfProduct = newListOfProduct;
            }
        }
    }

    @Override
    public Product getProduct(int index) {
        if (index >= 0 && index < listOfProduct.length && listOfProduct != null) {
            return listOfProduct[index];
        }

        return null;
    }
}
