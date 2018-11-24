package dao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class UserDaoImpl implements UserDao{
	private static Log log = LogFactory.getLog(UserDaoImpl.class);
	@Override
	public void say() {
		log.info("UserDao say");
		System.out.println("UserDao say hello world");
		
	}

}
