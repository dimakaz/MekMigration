package com.datacore.csvlog;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CSVLoggingTest {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(CSVLoggingTest.class);
		
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer;
	    
		for(int j = 0 ; j < 10000000 ; j ++) {
		   
			buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    
			logger.info("Any Message", buffer.toString(), buffer.toString(), buffer.toString() );

		}
	}

}
