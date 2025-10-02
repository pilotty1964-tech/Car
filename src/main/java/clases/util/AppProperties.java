package main.java.clases.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {
    private static AppProperties instance;
    private final Properties properties = new Properties();

    private AppProperties() {
    }

    public static synchronized AppProperties getInstance() {
        if (instance == null) {
            instance = new AppProperties();
        }
        return instance;
    }

    public void load() throws IOException {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input != null) {
                properties.load(input);
            } else {
                throw new IOException("Не найден конфигурационный файл");
            }
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
