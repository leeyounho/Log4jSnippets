import org.apache.log4j.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    /*
        BEFORE
        adding log4j.properties
        log4j:WARN No appenders could be found for logger (Main).
        log4j:WARN Please initialize the log4j system properly.
        log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.

        AFTER
        1. adding log4j.properties
        2. add resources folder to classpath

        or
        1. adding log4j.xml
        2. add config folder to classpath
        work!
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.info("Hello logger!");
    }
}