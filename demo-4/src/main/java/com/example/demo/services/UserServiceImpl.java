package com.example.demo.services;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;

@ComponentScan({"com.example.demo.mapper"})
@Service("userServiceImpl")
public class UserServiceImpl implements UserIServer{

	@Resource
	private UserMapper userMapper;
	
	
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		User user=userMapper.find(id);
		return user;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userMapper.delete(id);
	}

	@Override
	public List<Map> findall() {
		// TODO Auto-generated method stub
		List<Map>userlist=null;
		userlist=userMapper.findall();
		return userlist;
	}

}
