package com.xuanrui.demomybatis.model;


import java.io.Serializable;

/**
 * role实体类
 * @author xiasl
 */
public class Role implements Serializable {

  private Integer id;
  private String rolename;
  private String roledesc;
  private Integer rolestatus;
  private Integer createaccount;
  private String createtime;
  private Integer updateaccount;
  private String updatetime;
  private Integer available;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }


  public String getRoledesc() {
    return roledesc;
  }

  public void setRoledesc(String roledesc) {
    this.roledesc = roledesc;
  }


  public Integer getRolestatus() {
    return rolestatus;
  }

  public void setRolestatus(Integer rolestatus) {
    this.rolestatus = rolestatus;
  }


  public Integer getCreateaccount() {
    return createaccount;
  }

  public void setCreateaccount(Integer createaccount) {
    this.createaccount = createaccount;
  }


  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }


  public Integer getUpdateaccount() {
    return updateaccount;
  }

  public void setUpdateaccount(Integer updateaccount) {
    this.updateaccount = updateaccount;
  }


  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }


  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  @Override
  public String toString() {
    return "Role{" +
            "id=" + id +
            ", rolename='" + rolename + '\'' +
            ", roledesc='" + roledesc + '\'' +
            ", rolestatus=" + rolestatus +
            ", createaccount=" + createaccount +
            ", createtime='" + createtime + '\'' +
            ", updateaccount=" + updateaccount +
            ", updatetime='" + updatetime + '\'' +
            ", available=" + available +
            '}';
  }
}
