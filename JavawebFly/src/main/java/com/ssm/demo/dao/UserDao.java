package com.ssm.demo.dao;

import com.ssm.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

     boolean login(String name,String pwd);//登录
     boolean register(User user);//注册
     List<User> getUserAll();//返回用户信息集合
     boolean delete(int id) ;//根据id删除用户
     boolean update(int id,String name, String pwd,String sex, String home,String info) ;//更新用户信息

}
