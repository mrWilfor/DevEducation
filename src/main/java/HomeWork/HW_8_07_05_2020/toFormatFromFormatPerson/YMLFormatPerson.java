package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;

public class YMLFormatPerson extends AbstractFormatPerson {
    @Override
    public String toFormat(Person p) {
        if (p == null) {
            return null;
        }
        else {
            return  "Person:\n" +
                    "\tid: " + p.getId() + "\n\r" +
                    "\tfirstName: " + p.getFirstName() + "\n\r" +
                    "\tlastName: " + p.getLastName() + "\n\r" +
                    "\tage: " + p.getAge() + "\n\r";
        }
    }

    @Override
    public Person fromFormat(String str) {
        Person result = new Person();

        if (str == null || str == "") {
            return null;
        }

        int index;
        String buffer;

        index = str.indexOf("id:");
        buffer = str.substring(index + 3);
        index = buffer.indexOf("\n");
        buffer = buffer.substring(0, index);
        buffer = buffer.replaceAll(" ", "");

        result.setId(Long.parseLong(buffer));

        index = str.indexOf("firstName:");
        buffer = str.substring(index + 10);
        index = buffer.indexOf("\n");
        buffer = buffer.substring(0, index);
        buffer = buffer.replaceAll(" ", "");

        result.setFirstName(buffer);

        index = str.indexOf("lastName:");
        buffer = str.substring(index + 9);
        index = buffer.indexOf("\n");
        buffer = buffer.substring(0, index);
        buffer = buffer.replaceAll(" ", "");

        result.setLastName(buffer);

        index = str.indexOf("age:");
        buffer = str.substring(index + 4);
        index = buffer.indexOf("\n");
        buffer = buffer.substring(0, index);
        buffer = buffer.replaceAll(" ", "");

        result.setAge(Integer.parseInt(buffer));

        return result;
    }

    @Override
    public String toFormatStr(Person[] arrayInput) {
        String result = "";

        for (int i = 0; i < arrayInput.length; i++) {
            result = result.concat(toFormat(arrayInput[i]));;
        }
        return result;
    }

    @Override
    public Person[] fromFormatObj(String stringInput) {
        boolean trigger = false;
        Person[] arrayOutput = new Person[0];

        do {
            trigger = false;
            int index = stringInput.lastIndexOf("Person:");

            if (index != -1) {
                String stringPerson = stringInput.substring(index);
                Person person = fromFormat(stringPerson);

                if (arrayOutput.length == 0) {
                    arrayOutput = new Person[1];
                    arrayOutput[0] = person;
                } else {
                    Person[] newArrayOutput = new Person[arrayOutput.length + 1];

                    for (int i = 0; i < arrayOutput.length; i++) {
                        newArrayOutput[i + 1] = arrayOutput[i];
                    }
                    newArrayOutput[0] = person;
                    arrayOutput = newArrayOutput;
                }
                stringInput = stringInput.substring(0, index);
                trigger = true;
            }
        } while (trigger);
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
