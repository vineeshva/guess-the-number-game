package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Slf4j
public class Main {
//    public static final String CONFIG_LOCATION = "beans.xml";
    public static void main(String[] args) {
       log.info("Guess The Number Game");

       //Create context Container
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        //close context (container)
        context.close();

    }
}
