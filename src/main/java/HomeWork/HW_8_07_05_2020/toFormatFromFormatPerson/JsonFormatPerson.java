package HomeWork.HW_8_07_05_2020.toFormatFromFormatPerson;

import HomeWork.HW_8_07_05_2020.object.Person;

public class JsonFormatPerson extends AbstractFormatPerson {
    @Override
    public String toFormat(Person p) {
        if (p == null) {
            return null;
        }
        else {
            return "{\"id\": \"" + p.getId() + "\", \"firstName\": \"" + p.getFirstName() + "\", \"lastName\": \"" + p.getLastName() + "\", \"age\": \"" + p.getAge() + "\"}";
        }
    }

    @Override
    public Person fromFormat(String str) {
        Person result = new Person();

        if (str == "" || str == null) {
            return null;
        }

        int index;
        String buffer;

        index = str.indexOf("id");
        buffer = str.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setId(Long.parseLong(buffer));

        index = str.indexOf("firstName");
        buffer = str.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setFirstName(buffer);

        index = str.indexOf("lastName");
        buffer = str.substring(index);
        index = buffer.indexOf(",");

        if (index == -1) {
            index = buffer.indexOf("}");
        }
        buffer = buffer.substring(0, index - 1);
        index = buffer.lastIndexOf("\"");
        buffer = buffer.substring(index + 1);

        result.setLastName(buffer);

        index = str.indexOf("age");
        buffer = str.substring(index);
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
    public String[] toFormat(Person[] arrayInput) {
        return super.toFormat(arrayInput);
    }

    @Override
    public Person[] fromFormat(String[] stringInput) {
        return super.fromFormat(stringInput);
    }
}
