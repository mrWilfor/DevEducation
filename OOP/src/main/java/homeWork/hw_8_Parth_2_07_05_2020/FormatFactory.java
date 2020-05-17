package homeWork.hw_8_Parth_2_07_05_2020;

import homeWork.hw_8_07_05_2020.toFormatFromFormatPerson.*;

public class FormatFactory {
    private FormatFactory() {

    }

    public static AbstractFormatPerson choose(String format) {
        switch (format) {
            case ConstantsFormat.CSV_FORMAT:
                return new CsvFormatPerson();
            case ConstantsFormat.JSON_FORMAT:
                return new JsonFormatPerson();
            case ConstantsFormat.XML_FORMAT:
                return new XMLFormatPerson();
            case ConstantsFormat.YML_FORMAT:
                return new YMLFormatPerson();
            default:
                return null;
        }
    }
}
