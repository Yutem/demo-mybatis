package com.xuanrui.demomybatis.vo;


import com.xuanrui.demomybatis.model.Role;

/**
 * 用户和角色信息实体类
 *
 * @author xiasl
 */
public class UserLinkRole extends Role{

    private Integer   id;
    private String    name;
    private String    password;
    private Integer   organizationid;
    private String    nickname;
    private String    phone;
    private String    city;
    private String    createTime;
    private Integer   createAccount;
    private String    updateTime;
    private Integer   updateAccount;
    private Integer   available;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Integer organizationid) {
        this.organizationid = organizationid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(Integer createAccount) {
        this.createAccount = createAccount;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(Integer updateAccount) {
        this.updateAccount = updateAccount;
    }

    @Override
    public Integer getAvailable() {
        return available;
    }

    @Override
    public void setAvailable(Integer available) {
        this.available = available;
    }




}
