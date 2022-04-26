package alertHandling.helper;

public class FilePathReader {

	/**
	 * get current path directory
	 * @return
	 */
	private static String getSystemPath() {
		return System.getProperty("user.dir");
	}
	
	/**
	 * get main folder resources
	 * @return
	 */
	private static String mainResourcesPath() {
		return "/src/main/resources/";
	}
	
	/**
	 * get test folder resources
	 * @return
	 */
	private static String testResourcesPath() {
		return "/src/test/resources/";
	}
	
	/**
	 * read .properties file inside main resources
	 * @param filename
	 * @return
	 */
	public static String getPropertiesFile(String filename) {
		return getSystemPath()+mainResourcesPath()+filename+".properties";
	}
}

