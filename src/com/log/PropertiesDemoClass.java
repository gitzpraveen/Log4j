package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertiesDemoClass {
	private static Logger logger = Logger.getLogger(PropertiesDemoClass.class);
	static {
		try {
			PropertyConfigurator.configure("log Folder/DailyRollingFileAppender.properties");
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		System.out.println("program started !!!!!!!!!!!!");

		logger.debug("debug is started ");
		logger.info("info is started");
		logger.warn(404);
		logger.error("known exception is occoured");
		logger.fatal("unknown exception is occoured");

		System.out.println("program ended ************");

	}

}
