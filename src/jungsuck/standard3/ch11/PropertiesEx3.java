package jungsuck.standard3.ch11;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "한글");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        try {
            prop.store(new FileOutputStream("src/jungsuck.standard3.ch11/output.txt"),
                    "Properties Example");
            prop.storeToXML(new FileOutputStream("src/jungsuck.standard3.ch11/output.xml"),
                    "Properties Example");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
