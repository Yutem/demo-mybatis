package com.xuanrui.demomybatis.mapper;

import com.xuanrui.demomybatis.model.Role;
import com.xuanrui.demomybatis.model.User;
import com.xuanrui.demomybatis.vo.UserLinkRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 方法最底层，对数据库操作的方法
 *
 * @author xiasl
 */
@Mapper
public interface RoleMapper {

    /**
     * 根据用户id查找角色信息
     * @param id  用户id
     * @return  com.xuanrui.demomybatis.model.Role
     */
    Role findRole(@Param("id") Integer id);

    /**
     * 根据角色id查找角色信息
     * @param id  用户id
     * @return   com.xuanrui.demomybatis.model.Role
     */
    Role selectRoleById(@Param("id") Integer id);

    /**
     * 添加角色信息
     * @param role  role对象
     */
    void insertRole(@Param("role") Role role);

    /**
     * 删除角色信息
     * @param id  用户对象
     */
    void deleteRole(@Param("id") Integer id);

    /**
     * 软删除信息
     * @param id
     */
    void softDeleteRole(@Param("id") Integer id);

    /**
     *  通过用户id查找用户和角色的信息
     * @param id  用户id
     * @return  com.xuanrui.demomybatis.vo.UserLinkRole
     */
    UserLinkRole findUserRole(@Param("id") Integer id);

    /**
     * 通过用户名和角色名查找用户和角色的信息
     * @param name      用户名
     * @param rolename  角色名
     * @return  com.xuanrui.demomybatis.vo.UserLinkRole
     */
    UserLinkRole selectUserRole(@Param("name") String name, @Param("rolename") String rolename);
}
