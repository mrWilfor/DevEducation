package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties = new Properties();
    private FileInputStream fis;

    public ConfigReader(String pathToConfigFile) throws IOException {
        this.fis = new FileInputStream(pathToConfigFile);
        this.properties.load(fis);
    }

    public String getSource() {
        return properties.getProperty("path.from");
    }

    public String getDestination() {
        return properties.getProperty("path.toForCopyFiles");
    }

    public String getProps(String propsName) {
        return properties.getProperty(propsName);
    }
}
