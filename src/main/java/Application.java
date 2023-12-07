import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {

        logger.debug("Application Started");

        while (true){
            logger.info("Application Running");
            Thread.sleep(2300);
        }

    }

}
