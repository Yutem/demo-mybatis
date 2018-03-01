package com.xuanrui.demomybatis.model;


import java.io.Serializable;

/**
 * UserRole 实体类
 * @author xiasl
 */
public class UserRole implements Serializable {

  private Integer id;
  private Integer userid;
  private Integer roleid;
  private String createtime;
  private Integer createaccount;
  private String updatetime;
  private Integer updateaccount;
  private Integer available;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public Integer getRoleid() {
    return roleid;
  }

  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
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

  @Override
  public String toString() {
    return "UserRole{" +
            "id=" + id +
            ", userid=" + userid +
            ", roleid=" + roleid +
            ", createtime='" + createtime + '\'' +
            ", createaccount=" + createaccount +
            ", updatetime='" + updatetime + '\'' +
            ", updateaccount=" + updateaccount +
            ", available=" + available +
            '}';
  }
}
