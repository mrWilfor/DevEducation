package HomeWork.HW_8_07_05_2020.toFormatFromFormatPerson;

import HomeWork.HW_8_07_05_2020.object.Person;

public class XMLFormatPerson extends AbstractFormatPerson {
    @Override
    public String toFormat(Person p) {
        if (p == null) {
            return null;
        }
        else {
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
    public String[] toFormat(Person[] arrayInput) {
        return super.toFormat(arrayInput);
    }

    @Override
    public Person[] fromFormat(String[] stringInput) {
        return super.fromFormat(stringInput);
    }
}
