package com.automation.utilities;

/**
 * @author manoj
 *
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.automation.exceptions.WebserviceException;


/**
 * This class is used to instantiate the data source using the properties file.
 * Pooled connection creation, closing implementation is provided with this
 * class.
 */
public class PropertyUtil {

	/** The Constant LOG. */

	/** properties. */
	private static Properties properties;


	/**
	 * @param file
	 */
	private static void initPropertyFile(File file) {
		try {

			initialize(file);
		} catch (WebserviceException WebserviceException) {
			WebserviceException.printStackTrace();

		}
	}
	/**
	 * Gets the property.
	 * 
	 * @param propertyName
	 * 
	 * @return the property
	 */
	public static String getProperty(String propertyName) {
		properties = new Properties();
		initPropertyFile(new File("src\\main\\resources\\app.properties"));
		String returnString = properties.getProperty(propertyName);
		return returnString;
	}

	/**
	 * This method handles the loading property file int
	 * 
	 * @param filePath
	 * @throws WebAdaptorException
	 * 
	 */
	public final static void initialize(File filePath) throws WebserviceException {

		if (filePath.exists()) {
			InputStream inputStream = null;
			try {
				inputStream = new BufferedInputStream(new FileInputStream(
						filePath));
				Properties props = new Properties();
				props.load(inputStream);
				properties.clear();// clear property
				properties.putAll(props);
			} catch (Exception e) {
			} finally {
				if (inputStream != null) {
					try {
						inputStream.close();
					} catch (Exception e2) {
					}
				}
			}
		} else {
			throw new WebserviceException(
					"unable to find config.properties property file");
		}

		}
}
