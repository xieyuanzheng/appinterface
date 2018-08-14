package com.ufa.mall.entity;


public class UfaRole {
    private int id;
    private String name;


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



    public UfaRole() {
    }

    public UfaRole(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
