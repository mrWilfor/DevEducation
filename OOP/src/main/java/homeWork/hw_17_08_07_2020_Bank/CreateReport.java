package homeWork.hw_17_08_07_2020_Bank;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import homeWork.hw_17_08_07_2020_Bank.enums.FormatResult;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateReport extends Thread {
    ObjectReport objectReport;
    FormatResult formatResult;

    public CreateReport(ObjectReport objectReport, FormatResult formatResult) {
        this.objectReport = objectReport;
        this.formatResult = formatResult;
    }

    @Override
    public void run() {
        try {
        switch (formatResult) {
            case JSON:
                try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.json", true))) {
                    ObjectMapper mapper = new ObjectMapper();
                    String result = mapper.writeValueAsString(objectReport);
                    bw.write(result + "\n");
//                    bw.flush();
//                    mapper.writeValue(bw, objectReport);
                }
                break;
            case CSV:
                 try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.csv", true))) {
                CsvMapper csvMapper = new CsvMapper();
//                CsvSchema schema = csvMapper.schemaFor(objectReport.getClass()).withHeader();
                csvMapper.writerWithSchemaFor(objectReport.getClass()).writeValue(bw, objectReport);
                }
                break;
            case XML:
                try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.xml", true))) {
                XmlMapper xmlMapper = new XmlMapper();
                xmlMapper.writeValue(bw, objectReport);
                }
                break;
            case YAML:
                try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter("OOP/src/main/java/homeWork/hw_17_08_07_2020_Bank/result.yaml", true))) {
                    YAMLMapper yamlMapper = new YAMLMapper();
                    yamlMapper.writeValue(bw, objectReport);
                }
                break;
        }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to convert");
        }
    }
}
