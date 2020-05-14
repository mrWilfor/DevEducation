package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;

public class XMLFormatPerson extends AbstractFormatPerson {
    @Override
    public String toFormat(Person p) {
        if (p == null) {
            return null;
        } else {
            return "<Person>\n" +
                    "\t<id>" + p.getId() + "</id>\n\r" +
                    "\t<firstName>" + p.getFirstName() + "</firstName>\n\r" +
                    "\t<lastName>" + p.getLastName() + "</lastName>\n\r" +
                    "\t<age>" + p.getAge() + "</age>\n\r" +
                    "</Person>";
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

        index = str.indexOf("</id>");
        buffer = str.substring(0, index);
        index = buffer.lastIndexOf(">");
        buffer = buffer.substring(index + 1);

        result.setId(Long.parseLong(buffer));

        index = str.indexOf("</firstName>");
        buffer = str.substring(0, index);
        index = buffer.lastIndexOf(">");
        buffer = buffer.substring(index + 1);

        result.setFirstName(buffer);

        index = str.indexOf("</lastName>");
        buffer = str.substring(0, index);
        index = buffer.lastIndexOf(">");
        buffer = buffer.substring(index + 1);

        result.setLastName(buffer);

        index = str.indexOf("</age>");
        buffer = str.substring(0, index);
        index = buffer.lastIndexOf(">");
        buffer = buffer.substring(index + 1);

        result.setAge(Integer.parseInt(buffer));
        return result;
    }

    @Override
    public String toFormatStr(Person[] arrayInput) {
        String result = "<Persons>\n\r";

        if (arrayInput == null) {
            return null;
        }

        for (int i = 0; i < arrayInput.length; i++) {
            result = result.concat(toFormat(arrayInput[i]));
            result = result.concat("\n");
        }
        return result.replaceAll("\t", "\t\t")
                .replaceAll("<Person>", "\t<Person>")
                .replaceAll("</Person>", "\t</Person>")
                .concat("</Persons>");
    }

    @Override
    public Person[] fromFormatObj(String stringInput) {
        boolean trigger = false;
        Person[] arrayOutput = new Person[0];

        do {
            trigger = false;
            int index = stringInput.indexOf("</Person>");

            if (index != -1) {
                String stringPerson = stringInput.substring(0, index + 9);
                Person person = fromFormat(stringPerson);

                if (arrayOutput.length == 0) {
                    arrayOutput = new Person[1];
                    arrayOutput[0] = person;
                } else {
                    Person[] newArrayOutput = new Person[arrayOutput.length + 1];

                    for (int i = 0; i < arrayOutput.length; i++) {
                        newArrayOutput[i] = arrayOutput[i];
                    }
                    newArrayOutput[newArrayOutput.length - 1] = person;
                    arrayOutput = newArrayOutput;
                }
                    stringInput = stringInput.substring(index + 9);
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
