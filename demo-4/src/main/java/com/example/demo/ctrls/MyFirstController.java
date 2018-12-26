package com.example.demo.ctrls;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.User;
import com.example.demo.services.UserServiceImpl;

@RestController
public class MyFirstController {

	@Resource
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/aaa")
	public User find() {
		User user =  userServiceImpl.find(1);
		return user;
	}
	@RequestMapping("insert")
	public String insert() {
		User user=new User();
		user.setId(1);
		user.setUsername("ceshiyonghu");
		user.setPassword("goodnight007");
		user.setAge(20);
		userServiceImpl.insert(user);
		return "success";
	}
	@RequestMapping("findall")
	public List<Map> findall(){
		List<Map>list=userServiceImpl.findall();
		return list;
	}
}
