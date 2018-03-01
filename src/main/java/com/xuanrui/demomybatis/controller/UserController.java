package com.xuanrui.demomybatis.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xuanrui.demomybatis.model.Role;
import com.xuanrui.demomybatis.model.User;
import com.xuanrui.demomybatis.vo.UserLinkRole;
import com.xuanrui.demomybatis.service.RoleService;
import com.xuanrui.demomybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * controller层
 *
 * @author xiasl
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private RoleService roleService;


    /**
     * 测试用户的增删查改
     * @param id  用户id
     * @return    String
     */
    @RequestMapping("/user")
    @ResponseBody
    public String findUserById(Integer id){
        User userById = userService.findUserById(id);
        System.out.println(userById.getCity());
        userById.setCity("广州");
        userService.updateUser(userById);
//        userService.insertUser(userById);
        String s = JSONObject.toJSONString(userById);
        return s;
    }

    /**
     * 判断接受用户名和密码
     * @param user  user对象
     * @return  String
     */
    @RequestMapping("/log")
    public String log(User user){
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "login";
    }

    /**
     * 测试html页面
     * @return  html页面
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * 查询用户信息
     * @param id  用户id
     * @return    String
     */
    @RequestMapping("/findUser")
    @ResponseBody
    public String findUser(Integer id){
        User userById = userService.findUserById(id);
        String s = JSONObject.toJSONString(userById);
        return s;
    }

    /**
     * 添加用户
     * @param user  user对象
     * @return  String
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(User user){
        userService.insertUser(user);
        System.out.println(user.getId());
        User userById = userService.findUserById(user.getId());
        String s = JSONObject.toJSONString(userById);
        return s;
    }

    /**
     * 更新用户
     * @param user  user对象
     * @return  String
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user){
        userService.updateUser(user);
        User userById = userService.findUserById(user.getId());
        String s = JSONObject.toJSONString(userById);
        return s;
    }

    /**
     * 删除用户信息
     * @param id  用户id
     * @return  String
     */
    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(Integer id){
        userService.deleteUser(id);
        return "ok";
    }

    /**
     * 根据用户id查找出用户和角色信息
     * @param id 用户id
     * @return  String
     */
    @RequestMapping("findRole")
    @ResponseBody
    public String findRole(Integer id){
        UserLinkRole userRole = roleService.findUserRole(id);
        String s = JSONObject.toJSONString(userRole);
        return s;
    }

    /**
     * 软删除用户
     * @param id 用户id
     * @return String
     */
    @RequestMapping("/softDeleteUser")
    @ResponseBody
    public String softDeleteUser(Integer id){
       userService.softDeleteUser(id);
        List<User> allUser = userService.findAllUser();
        String s = JSONArray.toJSONString(allUser);
        return s;
    }

    /**
     * 根据用户id查找出用户和角色信息
     * @param id 用户id
     * @return  String
     */
    @RequestMapping("select")
    @ResponseBody
    public String selectUserRole(Integer id){
        User user = userService.selectUserRole(id);
        String s = JSONObject.toJSONString(user);
        return s;
    }

    @ResponseBody
    @RequestMapping("selectRole")
    public String selectRole(Integer id){
        Role role = roleService.selectUserById(id);
        String s = JSONObject.toJSONString(role);
        return s;
    }
}
