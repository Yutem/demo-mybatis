package com.xuanrui.demomybatis.service;


import com.xuanrui.demomybatis.mapper.RoleMapper;
import com.xuanrui.demomybatis.model.Role;
import com.xuanrui.demomybatis.model.User;
import com.xuanrui.demomybatis.vo.UserLinkRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色业务逻辑层
 *
 * @author xiasl
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 根据用户id查找角色信息
     * @param id  用户id
     * @return    com.xuanrui.demomybatis.model.Role
     */
    public Role findRole(Integer id){
        Role role = roleMapper.findRole(id);
        return role;
    }

    /**
     * 根据角色id查找角色信息
     * @param id   用户id
     * @return    com.xuanrui.demomybatis.model.Role
     */
    public Role selectUserById(Integer id){
        Role role = roleMapper.selectRoleById(id);
        return role;
    }

    /**
     * 添加角色信息
     * @param role  role类
     */
    public void insertRole(Role role){
        roleMapper.insertRole(role);
    }

    /**
     * 删除角色信息
     * @param id  用户id
     */
    public void deleteRole(Integer id){
        roleMapper.deleteRole(id);
    }

    /**
     * 软删除角色信息
     * @param id  用户id
     */
    public void softDeleteRole(Integer id){
        roleMapper.softDeleteRole(id);
    }

    /**
     * 通过用户id查找用户和角色的信息
     * @param id
     * @return
     */
    public UserLinkRole findUserRole(Integer id){
        UserLinkRole userRole = roleMapper.findUserRole(id);
        return userRole;
    }

    /**
     * 通过用户名和角色名查找用户和角色的信息
     * @param name      用户名
     * @param rolename  角色名
     * @return  com.xuanrui.demomybatis.vo.UserLinkRole
     */
    public UserLinkRole selectUserRole(String name, String rolename){
        UserLinkRole userLinkRole = roleMapper.selectUserRole(name, rolename);
        return userLinkRole;
    }
}
