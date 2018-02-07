package impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import entity.Student;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<Student> StudentList() {
		// TODO Auto-generated method stub
		if(userMapper==null){
			System.out.println("userMapperΪ��");
			 ApplicationContext  ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			 userMapper = (UserMapper) ac.getBean("userMapper");
		}
		else{
			System.out.println("userMapper��Ϊ��");
		}
		return userMapper.StudentList();
	}

}
