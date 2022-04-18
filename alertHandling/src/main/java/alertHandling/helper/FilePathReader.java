package alertHandling.helper;

public class FilePathReader {

	private static String getSystemPath() {
		return System.getProperty("user.dir");
	}
	
	private static String mainResourcesPath() {
		return "/src/main/resources";
	}
	
	private static String testResourcesPath() {
		return "/src/test/resources";
	}
	
	public static String getPropertiesFile(String filename) {
		return getSystemPath()+mainResourcesPath()+filename+".properties";
	}
}

