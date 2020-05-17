package homeWork.hw_8_07_05_2020.object.customer;

public class DaoCustomer implements IDaoCustomer {
    private static Customer[] listOfCustomer = new Customer[0];

    @Override
    public long create(Customer customer) {
        if (customer == null) {
            return -1;
        } else if (listOfCustomer.length == 0) {
            listOfCustomer = new Customer[1];
            listOfCustomer[0] = customer;
        } else {
            Customer[] arrayOfCustomer = new Customer[listOfCustomer.length + 1];

            for (int i = 0; i < listOfCustomer.length; i++) {
                arrayOfCustomer[i] = listOfCustomer[i];
            }
            arrayOfCustomer[arrayOfCustomer.length - 1] = customer;
            listOfCustomer = arrayOfCustomer;
        }
        return customer.getId();
    }

    @Override
    public Customer[] readAll() {
        return listOfCustomer;
    }

    @Override
    public Customer[] readBySameNames() {
        Customer[] copyListOfCustomer = new Customer[listOfCustomer.length];
        Customer[] arrayOfCustomer = new Customer[0];

        for (int i = 0; i < listOfCustomer.length; i++) {
            copyListOfCustomer[i] = listOfCustomer[i];
        }

        for (int i = 0; i < copyListOfCustomer.length; i++) {
            int counter = 0;

            if (copyListOfCustomer[i] == null) {
                continue;
            } else {
                for (int j = 0; j < copyListOfCustomer.length; j++) {
                    if (copyListOfCustomer[j] != null && i != j) {
                        if (copyListOfCustomer[i].getName().equals(copyListOfCustomer[j].getName())) {
                            if (arrayOfCustomer.length == 0) {
                                arrayOfCustomer = new Customer[1];
                                arrayOfCustomer[0] = copyListOfCustomer[j];
                                copyListOfCustomer[j] = null;
                            } else {
                                Customer[] newArrayOfCustomer = new Customer[arrayOfCustomer.length + 1];

                                for (int k = 0; k < arrayOfCustomer.length; k++) {
                                    newArrayOfCustomer[k] = arrayOfCustomer[k];
                                }
                                newArrayOfCustomer[newArrayOfCustomer.length - 1] = copyListOfCustomer[j];
                                copyListOfCustomer[j] = null;
                                arrayOfCustomer = newArrayOfCustomer;
                            }
                            counter++;
                        }
                    }
                }
            }

            if (counter > 0) {
                Customer[] newArrayOfCustomer = new Customer[arrayOfCustomer.length + 1];

                for (int k = 0; k < arrayOfCustomer.length; k++) {
                    newArrayOfCustomer[k] = arrayOfCustomer[k];
                }
                newArrayOfCustomer[newArrayOfCustomer.length - 1] = copyListOfCustomer[i];
                arrayOfCustomer = newArrayOfCustomer;
            }
            copyListOfCustomer[i] = null;
        }
        return arrayOfCustomer;
    }

    @Override
    public Customer[] readByNumberOfCreditCard(long numberOfCreditCard) {
        Customer[] arrayOfCustomer = new Customer[0];

        if (numberOfCreditCard == 0) {
            return new Customer[0];
        }

        for (int i = 0; i < listOfCustomer.length; i++) {
            if (numberOfCreditCard == listOfCustomer[i].getNumberOfCreditCard()) {
                if (arrayOfCustomer.length == 0) {
                    arrayOfCustomer = new Customer[1];
                    arrayOfCustomer[0] = listOfCustomer[i];
                } else {
                    Customer[] newArrayOfCustomer = new Customer[arrayOfCustomer.length + 1];

                    for (int j = 0; j < arrayOfCustomer.length; j++) {
                        newArrayOfCustomer[j] = arrayOfCustomer[j];
                    }
                    newArrayOfCustomer[newArrayOfCustomer.length - 1] = listOfCustomer[i];
                    arrayOfCustomer = newArrayOfCustomer;
                }
            }
        }
        return arrayOfCustomer;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfCustomer.length; i++) {
            if (id == listOfCustomer[i].getId()) {
                index = i;
            }
        }
        if (index != -1) {
            Customer[] arrayOfCustomer = new Customer[listOfCustomer.length - 1];

            for (int i = 0; i < index; i++) {
                arrayOfCustomer[i] = listOfCustomer[i];
            }

            for (int i = index + 1; i < listOfCustomer.length; i++) {
                arrayOfCustomer[i - 1] = listOfCustomer[i];
            }
            listOfCustomer = arrayOfCustomer;
        }
    }

    @Override
    public void update(Customer customer) {
        for (int i = 0; i < listOfCustomer.length; i++) {
            if (customer.getId() == listOfCustomer[i].getId()) {
                listOfCustomer[i] = customer;
            }
        }
    }

    @Override
    public void clear() {
        listOfCustomer = new Customer[0];
    }
}
