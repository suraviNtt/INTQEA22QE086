package alertHandling.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesReader {

	private static Properties prop;

	public PropertiesReader() {
		try {
			Reader file = new FileReader(FilePathReader.getPropertiesFile("config"));
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getBrowserName() {
		return prop.getProperty("browser");
	}
	
	public static String getAppURL() {
		return prop.getProperty("url");
	}
	
	public static String getHardWait() {
		return prop.getProperty("hardtime");
	}

	public static String getImplicitWait() {
		return prop.getProperty("implicit");
	}

	public static String getExplicitWait() {
		return prop.getProperty("explicit");
	}

}
