package homeWork.hw_15_26_06_2020_Archiver_Unarchiver;

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
        return properties.getProperty("path.toSourceFilesWithoutFolder");
    }

    public String getDestination() {
        return properties.getProperty("path.toUnarchivedFiles");
    }

    public String getProps(String propsName) {
        return properties.getProperty(propsName);
    }
}
