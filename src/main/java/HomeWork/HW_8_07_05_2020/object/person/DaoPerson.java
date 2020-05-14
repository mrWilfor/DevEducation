package homeWork.hw_8_07_05_2020.object.person;

public class DaoPerson implements IDaoPerson {

    private static Person[] mock = new Person[0];

    @Override
    public long create(Person p) {
        if (p == null) {
            return -1;
        }

        if (mock.length == 0) {
            mock = new Person[1];
            mock[0] = p;
        } else {
            Person[] array = new Person[mock.length + 1];

            for (int i = 0; i < mock.length; i++) {
                array[i] = mock[i];
            }
            array[array.length - 1] = p;
            mock = array;
        }
        return p.getId();
    }

    @Override
    public Person[] readAll() {
        return mock;
    }

    @Override
    public Person[] readByName(String name) {
        Person[] array = new Person[0];

        if (name == null || name.equals("")) {
            return new Person[0];
        }

        for (int i = 0; i < mock.length; i++) {
            if (name.equals(mock[i].getFirstName())) {
                if (array.length == 0) {
                    array = new Person[1];
                    array[0] = mock[i];
                } else {
                    Person[] array1 = new Person[array.length + 1];

                    for (int j = 0; j < array.length; j++) {
                        array1[j] = array[j];
                    }
                    array1[array.length - 1] = mock[i];
                    array = array1;
                }
            }
        }
        return array;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < mock.length; i++) {
            if (id == mock[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Person[] array = new Person[mock.length - 1];

            for (int i = 0; i < index; i++) {
                array[i] = mock[i];
            }

            for (int i = index + 1; i < mock.length; i++) {
                array[i - 1] = mock[i];
            }
            mock = array;
        }
    }

    @Override
    public void update(Person p) {

    }

    @Override
    public void clear() {
        mock = new Person[0];
    }
}
