package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



public class logsCapture {
	
	public static void takeLogs(String classname, String message) {
		
		DOMConfigurator.configure("../automation/layout.xml");
		Logger L = Logger.getLogger(classname);
		L.info(message);
		
	}

}


