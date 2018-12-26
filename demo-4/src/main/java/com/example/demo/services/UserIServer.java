package com.example.demo.services;

import java.util.List;
import java.util.Map;

import com.example.demo.bean.User;

public interface UserIServer {
	public void insert(User user);
	public void update(User user);
	public User find(int id);
	public List<Map> findall();
	public void delete(int id);
}
