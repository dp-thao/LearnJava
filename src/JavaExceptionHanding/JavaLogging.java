package JavaExceptionHanding;

import java.util.logging.Filter;
import java.util.logging.Logger;

public class JavaLogging {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("newLoggerName");
        logger.info( "This is INFO log level message");
        logger.warning( "This is WARNING log level message");

        // get a filter
        Filter filter = logger.getFilter();

        // set a filter
        logger.setFilter(filter);


    }
}
