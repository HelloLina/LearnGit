import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.Customer;

public class MybatisTest {
	@Test
	public void findCustomerByIdTest() {
		String resource="mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			Customer customer= sqlSession.selectOne("mapper"+".CustomerMapper.findCustomerById",1);
			System.out.println(customer.toString());
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
