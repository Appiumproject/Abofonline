package com.library;

import java.io.FileInputStream;
import java.util.Properties;

public class GenricClass {
	public static String configprop=BaseClass.sDirpath+"\\config.properties";

	//READ data from the config.properties
	
		public static String getdataproperties(String key){
			
			String svalue=null;
			Properties properties=new Properties();
			
			try{
				
					FileInputStream file=new FileInputStream(configprop);
					properties.load(file);
					svalue=properties.getProperty(key);
				
			}catch(Exception e){
				
			}
			return svalue;
			

}}
