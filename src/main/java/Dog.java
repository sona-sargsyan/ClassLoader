import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog extends Animal {

    private static final Logger logger = LogManager.getLogger(Dog.class);

    public void voice() {
        logger.info("Dog has a voice");
    }

    public void play() {
        logger.info("Dog is playing with the cat");
    }
}
