package testKeerthi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class keerthiTest2 {

	Logger logger = LogManager.getLogger(keerthiTest2.class);	
	
	@Test
	public void test1() {

		logger.info("This is for information");
		logger.error("This is for error information");
		logger.warn("This is for warning information");
		logger.fatal("This is for fatal information");
		
	}

}
