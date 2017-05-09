import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class MainApp {
	static Logger log = Logger.getLogger(MainApp.class.getName());
	
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      log.info("Going to create User Obj");
      User user = (User) context.getBean("user");
      user.getName();
      user.getAge();
      log.info("Going to Throw an exception");
      user.printThrowException();
   }
}