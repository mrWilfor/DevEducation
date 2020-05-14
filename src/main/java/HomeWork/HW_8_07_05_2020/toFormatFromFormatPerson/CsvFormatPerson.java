package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;

public class CsvFormatPerson extends AbstractFormatPerson {

    @Override
    public String toFormat(Person p) {
        if (p == null) {
            return null;
        }
        return p.getId() + ", " + p.getFirstName() + ", "
                + p.getLastName() + ", " + p.getAge();
    }

    @Override
    public Person fromFormat(String stringInput) {
        if (stringInput == null) {
            return null;
        }
        String[] array = stringInput.split(", ");
        return new Person(
                Long.parseLong(array[0]),
                array[1],
                array[2],
                Integer.parseInt(array[3])
        );
    }

    @Override
    public String toFormatStr(Person[] arrayInput) {
        String result = "";

        if (arrayInput == null) {
            return null;
        }

        for (int i = 0; i < arrayInput.length; i++) {
            result = result.concat(toFormat(arrayInput[i]));
            if (i != arrayInput.length - 1) {
                result = result.concat("\n");
            }
        }
        return result;
    }

    @Override
    public Person[] fromFormatObj(String stringInput) {
        if (stringInput == null) {
            return null;
        }

        String[] arrayOfString = stringInput.split("\n");
        Person[] arrayOutput = new Person[arrayOfString.length];

        for (int i = 0; i < arrayOfString.length; i++) {
        arrayOutput[i] = fromFormat(arrayOfString[i]);
        }
        return arrayOutput;
}

    @Override
    public String[] toFormat(Person[] arrayInput) {
        return super.toFormat(arrayInput);
    }

    @Override
    public Person[] fromFormat(String[] stringInput) {
        return super.fromFormat(stringInput);
    }
}
