import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by anton on 30.01.17.
 */
public class KnightMain {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
