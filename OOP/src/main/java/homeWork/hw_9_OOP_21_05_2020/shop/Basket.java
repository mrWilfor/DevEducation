package homeWork.hw_9_OOP_21_05_2020.shop;

import homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Product;

import java.util.Arrays;

public class Basket implements homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Basket {
    private Product[] listOfProduct;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Basket basket = (Basket) o;

        return Arrays.equals(listOfProduct, basket.listOfProduct);
    }

    @Override
    public int hashCode() {
        return 31 * Arrays.hashCode(listOfProduct);
    }
}
