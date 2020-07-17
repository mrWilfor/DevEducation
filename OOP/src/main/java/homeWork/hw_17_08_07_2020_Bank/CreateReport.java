package homeWork.hw_17_08_07_2020_Bank;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import homeWork.hw_17_08_07_2020_Bank.enums.FormatResult;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateReport extends Thread {
    List<ObjectReport> list;
    FormatResult formatResult;

    public CreateReport(ListOfReport listOfReport, FormatResult formatResult) {
        this.list = listOfReport.getList();
        this.formatResult = formatResult;
    }

    @Override
    public void run() {
        ListOfReport listOfReport = new ListOfReport();

        try {
            switch (formatResult) {
                case JSON:
                    try (BufferedWriter bw = new BufferedWriter(
                            new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.json", true))) {
                        ObjectMapper mapper = new ObjectMapper();

                        mapper.writeValue(bw, list);
                    }
                    break;
                case CSV:
                    for (ObjectReport objectReport : list) {
                        try (BufferedWriter bw = new BufferedWriter(
                                new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.csv", true))) {
                            CsvMapper csvMapper = new CsvMapper();
                            CsvSchema schema = csvMapper.schemaFor(objectReport.getClass()).withHeader();

                            try {
                                csvMapper.writerWithSchemaFor(objectReport.getClass()).with(schema).writeValue(bw, objectReport);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case XML:
                    try (BufferedWriter bw = new BufferedWriter(
                            new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.xml", true))) {
                        XmlMapper xmlMapper = new XmlMapper();

                        xmlMapper.writeValue(bw, list);
                    }
                    break;
                case YAML:
                    try (BufferedWriter bw = new BufferedWriter(
                            new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.yaml", true))) {
                        YAMLMapper yamlMapper = new YAMLMapper();

                        yamlMapper.writeValue(bw, list);
                    }
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to convert");
        }
    }
}
