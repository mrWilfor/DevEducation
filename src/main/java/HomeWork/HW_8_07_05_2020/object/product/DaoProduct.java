package homeWork.hw_8_07_05_2020.object.product;

public class DaoProduct implements IDaoProduct {
    private static Product[] listOfProduct = new Product[0];

    @Override
    public long create(Product product) {
        if (product == null) {
            return -1;
        } else if (listOfProduct.length == 0) {
            listOfProduct = new Product[1];
            listOfProduct[0] = product;
        } else {
            Product[] arrayOfProduct = new Product[listOfProduct.length + 1];

            for (int i = 0; i < listOfProduct.length; i++) {
                arrayOfProduct[i] = listOfProduct[i];
            }
            arrayOfProduct[arrayOfProduct.length - 1] = product;
            listOfProduct = arrayOfProduct;
        }
        return product.getId();
    }

    @Override
    public Product[] readAll() {
        return listOfProduct;
    }

    @Override
    public Product[] readByName(String name) {
        Product[] arrayOfProduct = new Product[0];

        if (name == null || name == "") {
            return new Product[0];
        }

        for (int i = 0; i < listOfProduct.length; i++) {
            if (name.equals(listOfProduct[i].getName())) {
                if (arrayOfProduct.length == 0) {
                    arrayOfProduct = new Product[1];
                    arrayOfProduct[0] = listOfProduct[i];
                } else {
                    Product[] newArrayOfProduct = new Product[arrayOfProduct.length + 1];

                    for (int j = 0; j < arrayOfProduct.length; j++) {
                        newArrayOfProduct[j] = arrayOfProduct[j];
                    }
                    newArrayOfProduct[newArrayOfProduct.length - 1] = listOfProduct[i];
                    arrayOfProduct = newArrayOfProduct;
                }
            }
        }
        return arrayOfProduct;
    }

    @Override
    public Product[] readByNameAndPriseFewGiven(String name, long prise) {
        Product[] arrayOfProduct = new Product[0];

        if (name == null || name == "") {
            return new Product[0];
        }

        for (int i = 0; i < listOfProduct.length; i++) {
            if (name.equals(listOfProduct[i].getName()) && prise >= listOfProduct[i].getPrise()) {
                if (arrayOfProduct.length == 0) {
                    arrayOfProduct = new Product[1];
                    arrayOfProduct[0] = listOfProduct[i];
                } else {
                    Product[] newArrayOfProduct = new Product[arrayOfProduct.length + 1];

                    for (int j = 0; j < arrayOfProduct.length; j++) {
                        newArrayOfProduct[j] = arrayOfProduct[j];
                    }
                    newArrayOfProduct[newArrayOfProduct.length - 1] = listOfProduct[i];
                    arrayOfProduct = newArrayOfProduct;
                }
            }
        }
        return arrayOfProduct;
    }

    @Override
    public Product[] readByShelfLifeMoreGiven(int shelfLife) {
        Product[] arrayOfProduct = new Product[0];

        if (shelfLife == 0) {
            return new Product[0];
        }

        for (int i = 0; i < listOfProduct.length; i++) {
            if (shelfLife < listOfProduct[i].getShelfLife()) {
                if (arrayOfProduct.length == 0) {
                    arrayOfProduct = new Product[1];
                    arrayOfProduct[0] = listOfProduct[i];
                } else {
                    Product[] newArrayOfProduct = new Product[arrayOfProduct.length + 1];

                    for (int j = 0; j < arrayOfProduct.length; j++) {
                        newArrayOfProduct[j] = arrayOfProduct[j];
                    }
                    newArrayOfProduct[newArrayOfProduct.length - 1] = listOfProduct[i];
                    arrayOfProduct = newArrayOfProduct;
                }
            }
        }
        return arrayOfProduct;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfProduct.length; i++) {
            if (id == listOfProduct[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Product[] arrayOfProduct = new Product[listOfProduct.length - 1];

            for (int i = 0; i < index; i++) {
                arrayOfProduct[i] = listOfProduct[i];
            }

            for (int i = index + 1; i < listOfProduct.length; i++) {
                arrayOfProduct[i - 1] = listOfProduct[i];
            }
            listOfProduct = arrayOfProduct;
        }
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < listOfProduct.length; i++) {
            if (product.getId() == listOfProduct[i].getId()) {
                listOfProduct[i] = product;
            }
        }
    }

    @Override
    public void clear() {
        listOfProduct = new Product[0];
    }
}
