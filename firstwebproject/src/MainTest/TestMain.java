package MainTest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Student;
import service.UserService;

public class TestMain {
	@Autowired
	private UserService userservice;
	
	public void test(){
		List<Student> studentlist = userservice.StudentList();
		for(Student s:studentlist){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new TestMain().test();
	}

}
