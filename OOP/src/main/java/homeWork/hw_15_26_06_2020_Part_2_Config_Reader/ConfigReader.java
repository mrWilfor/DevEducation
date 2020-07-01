package homeWork.hw_15_26_06_2020_Part_2_Config_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {
    private String pathToConfigFile;
    private String source;
    private String destination;

    public ConfigReader(String pathToConfigFile, String source, String destination) {
        this.pathToConfigFile = pathToConfigFile;
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return getProps(source);
    }

    public String getDestination() {
        return getProps(destination);
    }

    public String getProps(String propsName) {
        File configFile = new File(pathToConfigFile);
        String result = null;

        try (FileReader fr = new FileReader(configFile); BufferedReader reader = new BufferedReader(fr)) {
            String bufferString;

            while ((bufferString = reader.readLine()) != null) {
                if (bufferString.contains(propsName)) {
                    result = bufferString.substring(bufferString.indexOf("=") + 2);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
