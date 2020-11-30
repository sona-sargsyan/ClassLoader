import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat extends Animal {

    private static final Logger logger = LogManager.getLogger(Cat.class);

    public void voice() {
        logger.info("Cat has a voice");
    }

    public void play() {
        logger.info("Cat is playing with the mouse");
    }
}
