package homeWork.hw_8_07_05_2020.object.car;

public class DaoCar implements IDaoCar {
    private static Car[] listOfCars = new Car[0];

    @Override
    public long create(Car car) {
        if (car == null) {
            return -1;
        }

        if (listOfCars.length == 0) {
            listOfCars = new Car[1];
            listOfCars[0] = car;
        } else {
            Car[] arrayOfCars = new Car[listOfCars.length + 1];

            for (int i = 0; i < listOfCars.length; i++) {
                arrayOfCars[i] = listOfCars[i];
            }
            arrayOfCars[arrayOfCars.length - 1] = car;
            listOfCars = arrayOfCars;
        }
        return car.getId();
    }

    @Override
    public Car[] readAll() {
        return listOfCars;
    }

    @Override
    public Car[] readByMake(String make) {
        Car[] listOfCarByMake = new Car[0];

        if (make == null || make.equals("")) {
            return new Car[0];
        }

        for (int i = 0; i < listOfCars.length; i++) {
            if (make.equals(listOfCars[i].getCarMake())) {
                if (listOfCarByMake.length == 0) {
                    listOfCarByMake = new Car[1];
                    listOfCarByMake[0] = listOfCars[i];
                } else {
                    Car[] newListOfCarByMake = new Car[listOfCarByMake.length + 1];

                    for (int j = 0; j < listOfCarByMake.length; j++) {
                        newListOfCarByMake[j] = listOfCarByMake[j];
                    }
                    newListOfCarByMake[newListOfCarByMake.length - 1] = listOfCars[i];
                    listOfCarByMake = newListOfCarByMake;
                }
            }
        }
        return listOfCarByMake;
    }

    @Override
    public Car[] readByModelMoreYearOfOperation(String model, int yearsOfOperation) {
        Car[] listOfCarByModelMoreYearOfOperation = new Car[0];

        if (model == null || model.equals("")) {
            return new Car[0];
        }

        for (int i = 0; i < listOfCars.length; i++) {
            if (model.equals(listOfCars[i].getModel()) && 2020 - listOfCars[i].getYearOfIssue() > yearsOfOperation) {
                if (listOfCarByModelMoreYearOfOperation.length == 0) {
                    listOfCarByModelMoreYearOfOperation = new Car[1];
                    listOfCarByModelMoreYearOfOperation[0] = listOfCars[i];
                } else {
                    Car[] newListOfCarByModelMoreYearOfOperation =
                            new Car[listOfCarByModelMoreYearOfOperation.length + 1];

                    for (int j = 0; j < listOfCarByModelMoreYearOfOperation.length; j++) {
                        newListOfCarByModelMoreYearOfOperation[j] = listOfCarByModelMoreYearOfOperation[j];
                    }
                    newListOfCarByModelMoreYearOfOperation[newListOfCarByModelMoreYearOfOperation.length - 1] =
                            listOfCars[i];
                    listOfCarByModelMoreYearOfOperation = newListOfCarByModelMoreYearOfOperation;
                }
            }
        }
        return listOfCarByModelMoreYearOfOperation;
    }

    @Override
    public Car[] readByYearOfIssuePriseMore(int yearOfIssue, long prise) {
        Car[] listOfCarByYearOfIssue = new Car[0];

        for (int i = 0; i < listOfCars.length; i++) {
            if (yearOfIssue == listOfCars[i].getYearOfIssue() && prise < listOfCars[i].getPrise()) {
                if (listOfCarByYearOfIssue.length == 0) {
                    listOfCarByYearOfIssue = new Car[1];
                    listOfCarByYearOfIssue[0] = listOfCars[i];
                } else {
                    Car[] newListOfCarByYearOfIssue = new Car[listOfCarByYearOfIssue.length + 1];

                    for (int j = 0; j < listOfCarByYearOfIssue.length; j++) {
                        newListOfCarByYearOfIssue[j] = listOfCarByYearOfIssue[j];
                    }
                    newListOfCarByYearOfIssue[newListOfCarByYearOfIssue.length - 1] = listOfCars[i];
                    listOfCarByYearOfIssue = newListOfCarByYearOfIssue;
                }
            }
        }
        return listOfCarByYearOfIssue;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfCars.length; i++) {
            if (id == listOfCars[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Car[] newListOfCars = new Car[listOfCars.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfCars[j] = listOfCars[j];
            }

            for (int h = index + 1; h < listOfCars.length; h++) {
                newListOfCars[h - 1] = listOfCars[h];
            }
            listOfCars = newListOfCars;
        }
    }

    @Override
    public void update(Car car) {
        for (int i = 0; i < listOfCars.length; i++) {
            if (car.getId() == listOfCars[i].getId()) {
                listOfCars[i] = car;
            }
        }
    }

    @Override
    public void clear() {
        listOfCars = new Car[0];
    }
}
