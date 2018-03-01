package com.xuanrui.demomybatis.model;


import java.io.Serializable;

/**
 * user实体类
 *
 * @author xiasl
 */
public class User implements Serializable{

  private Integer   id;
  private String    name;
  private String    password;
  private Integer   organizationid;
  private String    nickname;
  private String    phone;
  private String    city;
  private String    createtime;
  private Integer   createaccount;
  private String    updatetime;
  private Integer   updateaccount;
  private Integer   available;
  private Role      roles;

  public Integer getId() {
    return id;
  }

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

  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public Integer getCreateaccount() {
    return createaccount;
  }

  public void setCreateaccount(Integer createaccount) {
    this.createaccount = createaccount;
  }

  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }

  public Integer getUpdateaccount() {
    return updateaccount;
  }

  public void setUpdateaccount(Integer updateaccount) {
    this.updateaccount = updateaccount;
  }

  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public Role getRoles() {
    return roles;
  }

  public void setRoles(Role roles) {
    this.roles = roles;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", organizationid=" + organizationid +
            ", nickname='" + nickname + '\'' +
            ", phone='" + phone + '\'' +
            ", city='" + city + '\'' +
            ", createtime='" + createtime + '\'' +
            ", createaccount=" + createaccount +
            ", updatetime='" + updatetime + '\'' +
            ", updateaccount=" + updateaccount +
            ", available=" + available +
            ", roles=" + roles +
            '}';
  }
}
