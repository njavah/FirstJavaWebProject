package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;
import service.UserService;
import service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired(required=false)
	@Qualifier("userService")
	private UserService userservice;
	
	@RequestMapping("/login")
	public 	ModelAndView login(String loginname,String password,
			ModelAndView mv,HttpSession session){
		if(userservice==null){
			System.out.println("userservice为空");
			//userservice = new UserServiceImpl();
		}else{
			System.out.println("userservice为空");
		}
		List<Student> studentlist = userservice.StudentList();
		Student s = new Student();
		s.setName(loginname);
		s.setPassword(password);
		if(studentlist.contains(s)){
			session.setAttribute("student", s);
			mv.setViewName("success");
		}
		else{
			mv.addObject("message","登陆名或密码错误，请重新登陆");
			mv.setViewName("loginform");
		}
		return mv;
	}
}
