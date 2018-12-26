package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.User;

@Mapper
public interface UserMapper {
    public void insert(User user);

    public void update(User user);
    
    public void delete(int id);
    
    public User find(int id);
    @Select("select * from user")
    public List<Map> findall();
}
