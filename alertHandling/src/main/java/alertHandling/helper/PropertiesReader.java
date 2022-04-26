package alertHandling.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesReader {

	private Properties prop;

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

	/**
	 * 
	 * @return
	 */
	public String getBrowserName() {
		return prop.getProperty("browser");
	}

	/**
	 * 
	 * @return
	 */
	public String getAppURL() {
		return prop.getProperty("url");
	}

	public int getHardWait() {
		return Integer.parseInt(prop.getProperty("hardtime"));
	}

	public long getImplicitWait() {
		return Long.parseLong(prop.getProperty("implicit"));
	}

	public long getExplicitWait() {
		return Long.parseLong(prop.getProperty("explicit"));
	}

}
