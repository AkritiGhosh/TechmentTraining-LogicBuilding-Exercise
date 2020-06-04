import org.apache.log4j.*;
public class LoggerExample {
	
		static Logger logger=Logger.getLogger("LogProperties.class");
		
		public static void main(String[] args) {

			
			  logger.debug("This is DEBUG message");
	    	logger.info("This is INFO message");
	    	logger.error("This is ERROR message");
	    	logger.fatal("This is FATAL message");
	    	System.out.println("Success");

		}
	}
}
