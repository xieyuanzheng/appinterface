package com.ufa.mall.entity;


public class UfaUser {
    private int id;
    private String name;
    private String telephone;
    private Integer number;
    private Integer deptid;
    private Integer roleid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }


    public UfaUser() {
    }

    public UfaUser(int id, String name, String telephone, Integer number, Integer deptid, Integer roleid) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.number = number;
        this.deptid = deptid;
        this.roleid = roleid;
    }
}
