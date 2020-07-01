package homeWork.hw_15_26_06_2020_Part_2_Config_Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

public class ConfigReader {
    private String textOfConfigFile;

    public ConfigReader(String resourceName) {
        initialisation("/".concat(resourceName));
    }

    public String getSource() {
        return getProps("path.from");
    }

    public String getDestination() {
        return getProps("path.to");
    }

    public String getProps(String propsName) {
        String[] arrayStrings = textOfConfigFile.split("\r\n");

        String result = Stream.of(arrayStrings)
                .filter(stringLine -> stringLine.contains(propsName))
                .findFirst().get();

        result = result.substring(result.indexOf("=") + 1).trim();
        return result;
    }

    private void initialisation(String resourceName) {
        StringBuilder sb = new StringBuilder();

        try (InputStream fin = this.getClass().getResourceAsStream((resourceName))) {
            int ch;

            while ((ch = fin.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        textOfConfigFile = sb.toString();
    }
}
