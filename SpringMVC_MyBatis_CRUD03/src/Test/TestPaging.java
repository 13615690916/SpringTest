package Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.java1234.mappers.UserMapper;
import com.java1234.model.User;
import com.java1234.util.SqlSessionFactoryUtil;

public class TestPaging {

	SqlSession sqlSession = new SqlSessionFactoryUtil().getSqlSession();

	@Test
	public void test() {
		UserMapper userMapper = (UserMapper) sqlSession
				.getMapper(UserMapper.class);
		List<User> userList = userMapper.paging(0, 10);
		for (User user : userList) {
			System.out.println(user.getId());
			System.out.println(user.getPassword());
		}
	}

}
