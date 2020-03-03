import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("Test log record!!!");
        LOGGER.error("В программе возникла ошибка!");
        LOGGER.warn("Предупреждение");
        LOGGER.trace("Путь");

    }
}
