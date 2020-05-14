package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;

import java.util.StringJoiner;

public class JsonFormatPerson extends AbstractFormatPerson {
    @Override
    public String toFormat(Person p) {
        if (p == null) {
            return null;
        } else {
            return "{\"id\": \"" + p.getId() + "\", \"firstName\": \"" + p.getFirstName() + "\", \"lastName\": \"" + p.getLastName() + "\", \"age\": \"" + p.getAge() + "\"}";
        }
    }

    @Override
    public Person fromFormat(String stringInput) {
        Person result = new Person();

        if (stringInput == "" || stringInput == null) {
            return null;
        }

        int index;
        String buffer;

        index = stringInput.indexOf("id");
        buffer = stringInput.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setId(Long.parseLong(buffer));

        index = stringInput.indexOf("firstName");
        buffer = stringInput.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setFirstName(buffer);

        index = stringInput.indexOf("lastName");
        buffer = stringInput.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setLastName(buffer);

        index = stringInput.indexOf("age");
        buffer = stringInput.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setAge(Integer.parseInt(buffer));
        return result;
    }

    @Override
    public String toFormatStr(Person[] arrayInput) {
        StringJoiner result = new StringJoiner(", ", "[", "]");

        for (int i = 0; i < arrayInput.length; i++) {
            result.add(toFormat(arrayInput[i]));
            ;
        }
        return result.toString();
    }

    @Override
    public Person[] fromFormatObj(String stringInput) {
        Person[] arrayOutput = new Person[0];

        if (stringInput == "" || stringInput == null) {
            return new Person[0];
        }
        stringInput = stringInput.replaceAll("\\[", "");
        stringInput = stringInput.replaceAll("]", "");
        String[] arrayString = stringInput.split(", \\{");

        for (int i = 0; i < arrayString.length; i++) {
            Person person = fromFormat(arrayString[i]);

            if (arrayOutput.length == 0) {
                arrayOutput = new Person[1];
                arrayOutput[0] = person;
            } else {
                Person[] newArrayOutput = new Person[arrayOutput.length + 1];

                for (int j = 0; j < arrayOutput.length; j++) {
                    newArrayOutput[j] = arrayOutput[j];
                }
                newArrayOutput[newArrayOutput.length - 1] = person;
                arrayOutput = newArrayOutput;
            }
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
