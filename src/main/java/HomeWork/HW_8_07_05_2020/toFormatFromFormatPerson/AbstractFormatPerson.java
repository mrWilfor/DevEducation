package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;

public abstract class AbstractFormatPerson {
    public abstract String toFormat(Person p);

    public abstract Person fromFormat(String str);

    public abstract String toFormatStr(Person[] arrayInput);

    public abstract Person[] fromFormatObj(String stringInput);

    public String[] toFormat(Person[] arrayInput){
        String[] result = new String[arrayInput.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = toFormat(arrayInput[i]);
        }
        return result;
    }

    public Person[] fromFormat(String[] stringInput){
        Person[] result = new Person[stringInput.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = fromFormat(stringInput[i]);
        }
        return result;
    }

}
