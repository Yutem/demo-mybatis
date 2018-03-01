package com.xuanrui.demomybatis.mapper;

import com.xuanrui.demomybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 操作数据库方法
 *
 * @author xiasl
 */
@Mapper
public interface UserMapper {


    /**
     * 新增用户信息
     * @param user  user对象
     */
    void insertUser(@Param("user") User user);

    /**
     * 删除一个用户
     * @param id  用户id
     */
    void deleteUser(@Param("id") Integer id);

    /**
     * 通过id查找用户信息
     * @param id
     * @return
     */
    User findUserById(@Param("id") Integer id);

    /**
     * 更新用户信息
     * @param user  user对象
     */
    void updateUser(User user);

    /**
     *查找所有的用户信息
     * @return
     */
    List<User> findAllUser();

    /**
     * 判断用户是否存在
     * @param name     用户名
     * @param password 用户密码
     * @return  com.xuanrui.demomybatis.model.User
     */
    User loginUser(@Param("name") String name, @Param("password") String password);

    /**
     * 软删除用户
     * @param id  用户id
     */
    void softDeleteUser(@Param("id") Integer id);

    /**
     * 通过用户id查询用户和巨额写的信息
     * @param id   用户id
     * @return  user类
     */
    User selectUserRole(@Param("id") Integer id);

}
