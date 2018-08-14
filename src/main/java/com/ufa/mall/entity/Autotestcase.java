package com.ufa.mall.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Autotestcase {
    private int id;
    private String type;
    private String name;
    private String terminal;
    private String testobject;
    private String param1;
    private String value1;
    private String param2;
    private String value2;
    private String param3;
    private String value3;
    private String result;
    private Integer valid;
    private String executor;
    private Timestamp createtime;
    private String modifier;
    private Timestamp modifytime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "terminal")
    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Basic
    @Column(name = "testobject")
    public String getTestobject() {
        return testobject;
    }

    public void setTestobject(String testobject) {
        this.testobject = testobject;
    }

    @Basic
    @Column(name = "param1")
    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    @Basic
    @Column(name = "value1")
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    @Basic
    @Column(name = "param2")
    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    @Basic
    @Column(name = "value2")
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Basic
    @Column(name = "param3")
    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    @Basic
    @Column(name = "value3")
    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Basic
    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "valid")
    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "executor")
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    @Basic
    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "modifier")
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Basic
    @Column(name = "modifytime")
    public Timestamp getModifytime() {
        return modifytime;
    }

    public void setModifytime(Timestamp modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autotestcase that = (Autotestcase) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (terminal != null ? !terminal.equals(that.terminal) : that.terminal != null) return false;
        if (testobject != null ? !testobject.equals(that.testobject) : that.testobject != null) return false;
        if (param1 != null ? !param1.equals(that.param1) : that.param1 != null) return false;
        if (value1 != null ? !value1.equals(that.value1) : that.value1 != null) return false;
        if (param2 != null ? !param2.equals(that.param2) : that.param2 != null) return false;
        if (value2 != null ? !value2.equals(that.value2) : that.value2 != null) return false;
        if (param3 != null ? !param3.equals(that.param3) : that.param3 != null) return false;
        if (value3 != null ? !value3.equals(that.value3) : that.value3 != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (executor != null ? !executor.equals(that.executor) : that.executor != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (modifier != null ? !modifier.equals(that.modifier) : that.modifier != null) return false;
        if (modifytime != null ? !modifytime.equals(that.modifytime) : that.modifytime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id;
        result1 = 31 * result1 + (type != null ? type.hashCode() : 0);
        result1 = 31 * result1 + (name != null ? name.hashCode() : 0);
        result1 = 31 * result1 + (terminal != null ? terminal.hashCode() : 0);
        result1 = 31 * result1 + (testobject != null ? testobject.hashCode() : 0);
        result1 = 31 * result1 + (param1 != null ? param1.hashCode() : 0);
        result1 = 31 * result1 + (value1 != null ? value1.hashCode() : 0);
        result1 = 31 * result1 + (param2 != null ? param2.hashCode() : 0);
        result1 = 31 * result1 + (value2 != null ? value2.hashCode() : 0);
        result1 = 31 * result1 + (param3 != null ? param3.hashCode() : 0);
        result1 = 31 * result1 + (value3 != null ? value3.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (valid != null ? valid.hashCode() : 0);
        result1 = 31 * result1 + (executor != null ? executor.hashCode() : 0);
        result1 = 31 * result1 + (createtime != null ? createtime.hashCode() : 0);
        result1 = 31 * result1 + (modifier != null ? modifier.hashCode() : 0);
        result1 = 31 * result1 + (modifytime != null ? modifytime.hashCode() : 0);
        return result1;
    }
}
