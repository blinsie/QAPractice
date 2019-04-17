import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    private static final Logger LOG = LogManager.getLogger(Logging.class);
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            try {
                LOG.info("result: " + divide(i));
            } catch (Exception e) {
                LOG.error(e.getMessage(), e);
            }
        }
    }

    public static int divide(int x) {
        LOG.debug("divide method invoked; 2 / " + x);
        if(x == 0) {
            LOG.warn("x = 0; exception may occur");
        }
        return 2 / x;
    }
}

