package com.ufa.mall.entity;

public class Table {
    private int id;
    private String username;
    private String sex;
    private String city;
    private String sign;
    private String experience;
    private String score;
    private String classify;
    private String wealth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getWealth() {
        return wealth;
    }

    public void setWealth(String wealth) {
        this.wealth = wealth;
    }

    public Table() {
    }

    public Table(int id, String username, String sex, String city, String sign, String experience, String score, String classify, String wealth) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.city = city;
        this.sign = sign;
        this.experience = experience;
        this.score = score;
        this.classify = classify;
        this.wealth = wealth;
    }
}
