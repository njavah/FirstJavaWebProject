package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Student;


/**
 * @author �ߺ�
 *
 */
public interface UserMapper {
	public List<Student> StudentList();
	
	/**
	 * @param str
	 * @param in
	 */
	public void test(String str, int in);
	
}
