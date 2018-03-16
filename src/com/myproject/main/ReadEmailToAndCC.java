package com.myproject.main;

import java.util.*;  
import java.io.*;  

public class ReadEmailToAndCC {
	
	public static void main(String[] args) throws Exception { 
		try {
			ReadEmailToAndCC readProperties = new ReadEmailToAndCC();
			Properties properties = new Properties();
			File file = new File("src/myproperties.xml");
		    FileInputStream reader=new FileInputStream(file); 
		    properties.loadFromXML(reader);
		    String to = readProperties.getEmailTo(properties);
		    String cc = readProperties.getEmailCC(properties);
		    System.out.println("Sending email TO :" +to);
		    System.out.println("Sending email CC :" +cc);
		    reader.close();
		
		}catch (FileNotFoundException e) {
			System.out.println("Error Occurred " +e.getMessage());
			e.printStackTrace();
		
		} catch (IOException e) {
			System.out.println("Error Occurred " +e.getMessage());
			e.printStackTrace();
		}
	}
	
	public  String getEmailTo(Properties property) {
		Enumeration<?> propertyKey = property.keys();
		String key = null;
		String emailTo = null;
		while (propertyKey.hasMoreElements()) {
	    	key=(String) propertyKey.nextElement();
		    	if (null!= key && key.equals("email.to")) {
		    		emailTo=property.getProperty(key);
		    		}
		}
		return emailTo;
	}
	
	public  String getEmailCC(Properties property) {
		Enumeration<?> propertyKey = property.keys();
		String key = null;
		String emailCC = null;
		while (propertyKey.hasMoreElements()) {
	    	key=(String) propertyKey.nextElement();
	    	if (null!= key && key.equals("email.cc")) {
	    		emailCC=property.getProperty(key);
	    		}
	}
	return emailCC;
	}
}


