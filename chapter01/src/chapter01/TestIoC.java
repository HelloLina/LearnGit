package chapter01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class TestIoC {
	private static Log log = LogFactory.getLog(TestIoC.class);
	public static void main(String args[]) {
		log.info("main");
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao= (UserDao) applicationContext.getBean("userDao");
		userDao.say();
	}

}
