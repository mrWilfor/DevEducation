package homeWork.hw_8_07_05_2020.object.bus;

public class DaoBus implements IDaoBus {
    private static Bus[] listOfBus = new Bus[0];

    @Override
    public long create(Bus bus) {
        if (bus == null) {
            return -1;
        }

        if (listOfBus.length == 0) {
            listOfBus = new Bus[1];
            listOfBus[0] = bus;
        } else {
            Bus[] arrayOfBus = new Bus[listOfBus.length + 1];

            for (int i = 0; i < listOfBus.length; i++) {
                arrayOfBus[i] = listOfBus[i];
            }
            arrayOfBus[arrayOfBus.length - 1] = bus;
            listOfBus = arrayOfBus;
        }
        return bus.getNumberBus();
    }

    @Override
    public Bus[] readAll() {
        return listOfBus;
    }

    @Override
    public Bus[] readByNumberBus(int numberBus) {
        Bus[] listOfBusByNumber = new Bus[0];


        if (numberBus == 0) {
            return new Bus[0];
        }

        for (int i = 0; i < listOfBus.length; i++) {
            if (numberBus == listOfBus[i].getNumberBus()) {
                if (listOfBusByNumber.length == 0) {
                    listOfBusByNumber = new Bus[1];
                    listOfBusByNumber[0] = listOfBus[i];
                } else {
                    Bus[] newListOfBusByNumber = new Bus[listOfBusByNumber.length + 1];

                    for (int j = 0; j < listOfBusByNumber.length; j++) {
                        newListOfBusByNumber[j] = listOfBusByNumber[j];
                    }
                    newListOfBusByNumber[newListOfBusByNumber.length - 1] = listOfBus[i];
                    listOfBusByNumber = newListOfBusByNumber;
                }
            }
        }
        return listOfBusByNumber;
    }

    @Override
    public Bus[] readByYearOfOperationMore(int yearOfOperation) {
        Bus[] listOfBusByYearOfOperationMore = new Bus[0];

        if (yearOfOperation == 0) {
            return new Bus[0];
        }

        for (int i = 0; i < listOfBus.length; i++) {
            if (yearOfOperation < listOfBus[i].getYearOfOperation()) {
                if (listOfBusByYearOfOperationMore.length == 0) {
                    listOfBusByYearOfOperationMore = new Bus[1];
                    listOfBusByYearOfOperationMore[0] = listOfBus[i];
                } else {
                    Bus[] newListOfBusByYearOfOperationMore = new Bus[listOfBusByYearOfOperationMore.length + 1];

                    for (int j = 0; j < listOfBusByYearOfOperationMore.length; j++) {
                        newListOfBusByYearOfOperationMore[j] = listOfBusByYearOfOperationMore[j];
                    }
                    newListOfBusByYearOfOperationMore[newListOfBusByYearOfOperationMore.length - 1] = listOfBus[i];
                    listOfBusByYearOfOperationMore = newListOfBusByYearOfOperationMore;
                }
            }
        }
        return listOfBusByYearOfOperationMore;
    }

    @Override
    public Bus[] readByMileageMore(long mileage) {
        Bus[] listOfBusByMileageMore = new Bus[0];


        if (mileage == 0) {
            return new Bus[0];
        }

        for (int i = 0; i < listOfBus.length; i++) {
            if (mileage < listOfBus[i].getMileage()) {
                if (listOfBusByMileageMore.length == 0) {
                    listOfBusByMileageMore = new Bus[1];
                    listOfBusByMileageMore[0] = listOfBus[i];
                } else {
                    Bus[] newListOfBusByMileageMore = new Bus[listOfBusByMileageMore.length + 1];

                    for (int j = 0; j < listOfBusByMileageMore.length; j++) {
                        newListOfBusByMileageMore[j] = listOfBusByMileageMore[j];
                    }
                    newListOfBusByMileageMore[newListOfBusByMileageMore.length - 1] = listOfBus[i];
                    listOfBusByMileageMore = newListOfBusByMileageMore;
                }
            }
        }
        return listOfBusByMileageMore;
    }

    @Override
    public void remove(int numberBus) {
        int index = -1;

        for (int i = 0; i < listOfBus.length; i++) {
            if (numberBus == listOfBus[i].getNumberBus()) {
                index = i;
            }
        }

        if (index != -1) {
            Bus[] newListOfBus = new Bus[listOfBus.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfBus[j] = listOfBus[j];
            }

            for (int h = index + 1; h < listOfBus.length; h++) {
                newListOfBus[h - 1] = listOfBus[h];
            }
            listOfBus = newListOfBus;
        }
    }

    @Override
    public void update(Bus bus) {
        for (int i = 0; i < listOfBus.length; i++) {
            if (bus.getNumberBus() == listOfBus[i].getNumberBus()) {
                listOfBus[i] = bus;
            }
        }
    }

    @Override
    public void clear() {
        listOfBus = new Bus[0];
    }
}
