package com.xuanrui.demomybatis.service;

import com.xuanrui.demomybatis.mapper.UserMapper;
import com.xuanrui.demomybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户业务逻辑层
 *
 * @author xiasl
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查找一个用户
     * @param id  用户id
     */
    public User findUserById(Integer id){
        User userById = userMapper.findUserById(id);
        return userById;
    }

    /**
     * 查找所有的用户
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public List<User> findAllUser(){
        List<User> allUser = userMapper.findAllUser();
        return allUser;
    }

    /**
     * 添加一个用户
     * @param user  user类
     */

    @Transactional(rollbackFor = Exception.class)
    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    /**
     * 删除一个用户
     * @param id   用户id
     */
    @Transactional(rollbackFor = Exception.class)
    public void deleteUser(Integer id){
        userMapper.deleteUser(id);
    }

    /**
     * 更新一个用户
     * @param user  user类
     */
    @Transactional(rollbackFor = Exception.class)
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    /**
     * 登录判断
     * @param name     用户名
     * @param password  用户密码
     * @return  com.xuanrui.demomybatis.model.User
     */
    public User loginUser(String name,String password){
        User user = userMapper.loginUser(name, password);
        return user;
    }

    /**
     * 软删除用户
     * @param id  用户id
     */
    @Transactional(rollbackFor = Exception.class)
    public void softDeleteUser(Integer id){
        userMapper.softDeleteUser(id);
    }

    /**
     * 通过用户id查询用户和巨额写的信息
     * @param id   用户id
     * @return     user类
     */
    public User selectUserRole(Integer id){
        User user = userMapper.selectUserRole(id);
        return user;
    }
}
